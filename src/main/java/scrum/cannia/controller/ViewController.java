package scrum.cannia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    // Página principal del propietario - MUY IMPORTANTE
    @GetMapping("/propietario/panel")
    public String panelPropietario(Model model) {
        // Aquí deberías cargar las mascotas del propietario logueado
        // Por ahora devolvemos la vista directamente
        return "indexPropietario"; // Asegúrate que coincida con tu HTML
    }

    // Página de login
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    // Página de registro
    @GetMapping("/registro")
    public String registro() {
        return "registro";
    }

    // Página de historia clínica
    @GetMapping("/historia/{id}")
    public String historiaClinica() {
        return "historia";
    }
}