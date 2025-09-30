package scrum.cannia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import scrum.cannia.model.PropietarioModel;
import scrum.cannia.model.VeterinarioModel;
import scrum.cannia.model.RegistroModel;
import scrum.cannia.repository.PropietarioRepository;
import scrum.cannia.repository.VeterinarioRepository;
import scrum.cannia.repository.RegistroRepository;

@Controller
@RequestMapping("/registro")
public class RegistroController {

    private final PropietarioRepository propietarioRepository;
    private final VeterinarioRepository veterinarioRepository;
    private final RegistroRepository registroRepository;

    public RegistroController(PropietarioRepository propietarioRepository,
                              VeterinarioRepository veterinarioRepository,
                              RegistroRepository registroRepository) {
        this.propietarioRepository = propietarioRepository;
        this.veterinarioRepository = veterinarioRepository;
        this.registroRepository = registroRepository;
    }

    // 👉 Mostrar formulario
    @GetMapping
    public String mostrarFormulario(Model model) {
        model.addAttribute("registro", new RegistroModel());
        model.addAttribute("veterinarios", veterinarioRepository.findAll());
        model.addAttribute("propietarios", propietarioRepository.findAll());
        return "registro/registro"; // tu vista HTML
    }

    // 👉 Procesar registro
    @PostMapping
    public String registrar(@ModelAttribute("registro") RegistroModel registro) {

        // 🔐 Guardar siempre en la tabla de Registro
        RegistroModel nuevoUsuario = new RegistroModel();
        nuevoUsuario.setUsuario(registro.getUsuario());
        nuevoUsuario.setContrasena(registro.getContrasena()); // ⚠️ Lo ideal es encriptar aquí
        nuevoUsuario.setRol(registro.getRol());
        registroRepository.save(nuevoUsuario);

        // 👉 Si es propietario
        if ("propietario".equalsIgnoreCase(registro.getRol())) {
            PropietarioModel propietario = new PropietarioModel();
            propietario.setNumDoc(registro.getNumDoc());
            propietario.setNombrePro(registro.getNombre());
            propietario.setApellidoPro(registro.getApellido());
            propietario.setCorreoPro(registro.getCorreo());
            propietarioRepository.save(propietario);
            return "redirect:/propietario";
        }

        // 👉 Si es veterinario
        if ("veterinario".equalsIgnoreCase(registro.getRol())) {
            VeterinarioModel veterinario = new VeterinarioModel();
            veterinario.setNumLicencia(registro.getNumlicencia());
            veterinario.setNombreVete(registro.getNombreVete());
            veterinario.setApellidoVete(registro.getApellidoVete());
            veterinario.setCorreoVete(registro.getCorreoVete());
            veterinarioRepository.save(veterinario);
            return "redirect:/veterinario";
        }

        // 👉 Redirigir al login
        return "redirect:registro/login";
    }
}