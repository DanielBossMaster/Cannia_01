package scrum.cannia.controller;

import scrum.cannia.model.MascotaModel;
import scrum.cannia.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/mascotas")
public class MascotaController {

    @Autowired
    private MascotaService mascotaService; // ✅ Con 'S' mayúscula

    // MOSTRAR FORMULARIO DE REGISTRO
    @GetMapping("/nueva")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("mascota", new MascotaModel());
        return "FormularioMascota";
    }

    // PROCESAR REGISTRO - CORREGIDO
    @PostMapping("/guardar")
    public String registrarMascota(@ModelAttribute MascotaModel mascota) {
        System.out.println("Guardando mascota: " + mascota.getNombre()); // ✅ getNombre()
        mascotaService.guardarMascota(mascota); // ✅ mascotaService con 'S'
        return "redirect:/propietario/panel";
    }

    // MOSTRAR FORMULARIO DE EDICIÓN - CORREGIDO
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEdicion(@PathVariable Long id, Model model) {
        Optional<MascotaModel> mascotaOptional = mascotaService.obtenerMascotaPorId(id); // ✅ obtenerMascotaPorId

        if (mascotaOptional.isPresent()) {
            model.addAttribute("mascota", mascotaOptional.get()); // ✅ Sintaxis correcta
            return "EditarMascota";
        } else {
            return "redirect:/propietario/panel";
        }
    }

    // PROCESAR EDICIÓN - CORREGIDO
    @PostMapping("/actualizar/{id}")
    public String editarMascota(@PathVariable Long id, @ModelAttribute MascotaModel mascota) {
        System.out.println("Actualizando mascota ID: " + id);
        mascotaService.actualizarMascota(id, mascota);
        return "redirect:/propietario/panel";
    }

    // ELIMINAR MASCOTA - CORREGIDO
    @GetMapping("/eliminar/{id}")
    public String eliminarMascota(@PathVariable Long id) {
        System.out.println("Eliminando mascota ID: " + id);
        mascotaService.eliminarMascota(id);
        return "redirect:/propietario/panel";
    }
}