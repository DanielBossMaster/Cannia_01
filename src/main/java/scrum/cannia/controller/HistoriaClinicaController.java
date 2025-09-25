package scrum.cannia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import scrum.cannia.model.HistoriaClinicaModel;
import scrum.cannia.model.VacunaModel;
import scrum.cannia.model.PropietarioModel;
import scrum.cannia.model.MascotaModel;
import scrum.cannia.repository.HistoriaClinicaRepository;
import scrum.cannia.repository.VacunaRepository;
import scrum.cannia.repository.MascotaRepository;
import scrum.cannia.repository.PropietarioRepository;

import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; // Para archivos .xlsx
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;


@Controller
public class HistoriaClinicaController {

    @Autowired
    private VacunaRepository vacunaRepository;

    @Autowired
    private HistoriaClinicaRepository historiaRepository;

    @Autowired
    private PropietarioRepository propietarioRepository;

    @Autowired
    private MascotaRepository mascotaRepository;

    /**
     * Guardar vacuna
     */
    @PostMapping("/guardarVacuna")
    public String guardarVacuna(VacunaModel vacuna) {
        vacunaRepository.save(vacuna);
        return "redirect:/veterinario/propietarioVH";
    }

    /**
     * Ver propietario con sus mascotas
     */
    @GetMapping("/propietario/{id}")
    public String verPropietario(@PathVariable Long id, Model model) {
        PropietarioModel propietario = propietarioRepository.findById(id).orElse(null);
        List<MascotaModel> mascotas = mascotaRepository.findByPropietarioId(id);

        model.addAttribute("propietario", propietario);
        model.addAttribute("mascotas", mascotas);

        return "veterinario/propietarioVH";
    }

    /**
     * Guardar historia clínica
     */

    @PostMapping("/guardarHistoria")
    public void guardarHistoria(
            @ModelAttribute HistoriaClinicaModel historia,
            @RequestParam("mascotaId") Long mascotaId,
            HttpServletResponse response) throws IOException {

        // 1. Buscar la mascota en la base de datos
        MascotaModel mascota = mascotaRepository.findById(mascotaId)
                .orElseThrow(() -> new RuntimeException("Mascota no encontrada"));

        // 2. Asignar la mascota a la historia clínica
        historia.setMascota(mascota);

        // 3. Guardar en la base de datos
        historiaRepository.save(historia);

        // 4. Configuración de la respuesta como archivo Excel
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=historias_clinicas.xlsx");

        // 5. Obtener todas las historias clínicas
        List<HistoriaClinicaModel> historias = historiaRepository.findAll();

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Historias Clínicas");

        // Encabezados
        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("ID");
        header.createCell(1).setCellValue("Fecha y Hora");
        header.createCell(2).setCellValue("Peso");
        header.createCell(3).setCellValue("Anamnesis");
        header.createCell(4).setCellValue("Diagnóstico");
        header.createCell(5).setCellValue("Tratamiento");
        header.createCell(6).setCellValue("Mascota");

        // Llenar filas
        int rowIdx = 1;
        for (HistoriaClinicaModel h : historias) {
            Row row = sheet.createRow(rowIdx++);
            row.createCell(0).setCellValue(h.getIdHistoriaClinica());            // ID
            row.createCell(1).setCellValue(h.getFechaHora().toString());         // Fecha y hora
            row.createCell(2).setCellValue(h.getPeso());                         // Peso
            row.createCell(3).setCellValue(h.getAnamnesis());                    // Anamnesis
            row.createCell(4).setCellValue(h.getDiagnostico());                  // Diagnóstico
            row.createCell(5).setCellValue(h.getTratamiento());                  // Tratamiento
            row.createCell(6).setCellValue(h.getMascota().getNomMascota());      // Nombre mascota
        }

        // Ajustar tamaño de columnas
        for (int i = 0; i <= 6; i++) {
            sheet.autoSizeColumn(i);
        }

        // 6. Escribir archivo en la respuesta
        workbook.write(response.getOutputStream());
        workbook.close();
    }
}

