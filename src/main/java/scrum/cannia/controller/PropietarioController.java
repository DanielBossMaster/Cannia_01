package scrum.cannia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import scrum.cannia.model.PropietarioModel;
import scrum.cannia.repository.PropietarioRepository;

import java.util.List;

@Controller
@RequestMapping("/propietarios")
public class PropietarioController {

    private final PropietarioRepository propietarioRepository;

    public PropietarioController(PropietarioRepository propietarioRepository) {
        this.propietarioRepository = propietarioRepository;
    }

    @GetMapping
    public String listarPropietarios(Model model) {
        List<PropietarioModel> propietarios = propietarioRepository.findAll();
        model.addAttribute("propietarios", propietarios);
        return "veterinario/propietarioVH"; // vista thymeleaf
    }
}
