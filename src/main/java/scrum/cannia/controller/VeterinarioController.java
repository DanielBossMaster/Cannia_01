package scrum.cannia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import scrum.cannia.repository.VeterinarioRepository;

@Controller
@RequestMapping("/veterinario")
public class VeterinarioController {

    private final VeterinarioRepository veterinarioRepository;

    public VeterinarioController(VeterinarioRepository veterinarioRepository){
        this.veterinarioRepository = veterinarioRepository;
    }

    @GetMapping

    public String index(Model model){
        model.addAttribute("veterinario")
    }
}
