package scrum.cannia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import scrum.cannia.model.RegistroModel;
import scrum.cannia.repository.RegistroRepository;

@Controller
@RequestMapping("/login")
public class LoginController {

    private final RegistroRepository registroRepository;

    public LoginController(RegistroRepository registroRepository) {
        this.registroRepository = registroRepository;
    }

    // 👉 Mostrar formulario de login
    @GetMapping
    public String mostrarLogin(Model model) {
        model.addAttribute("registro", new RegistroModel());
        return "registro/login"; // login.html
    }

    // 👉 Procesar login
    @PostMapping
    public String procesarLogin(@ModelAttribute("registro") RegistroModel registro, Model model) {
        RegistroModel usuario = registroRepository.findByUsuarioAndContrasena(registro.getUsuario(), registro.getContrasena());

        if (usuario != null && usuario.getContrasena().equals(registro.getContrasena())) {
            // ✅ Validación correcta → redirigir según el rol
            if ("veterinario".equalsIgnoreCase(usuario.getRol())) {
                return "redirect:/veterinario"; // Vista de veterinario
            } else if ("mascotas".equalsIgnoreCase(usuario.getRol())) {
                return "redirect:/mascotas"; // Vista de propietario
            }
        }

        // ❌ Si no encuentra usuario o contraseña incorrecta
        model.addAttribute("error", "Usuario o contraseña incorrectos");
        return "registro/login"; // vuelve al login con mensaje de error
    }
}