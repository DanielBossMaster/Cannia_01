package scrum.cannia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import scrum.cannia.model.PropietarioModel;
import scrum.cannia.model.VeterinarioModel;
import scrum.cannia.repository.MascotaRepository;
import scrum.cannia.repository.PropietarioRepository;
import scrum.cannia.repository.VeterinarioRepository;

import javax.naming.Binding;

@Controller
@RequestMapping("/veterinario")
public class VeterinarioController {

    private final VeterinarioRepository veterinarioRepository;
    private final PropietarioRepository propietarioRepository;
    private final MascotaRepository mascotaRepository;


    public VeterinarioController(
            VeterinarioRepository veterinarioRepository,
            PropietarioRepository propietarioRepository,
            MascotaRepository mascotaRepository) {

        this.propietarioRepository = propietarioRepository;
        this.veterinarioRepository = veterinarioRepository;
        this.mascotaRepository = mascotaRepository;

    }

    @GetMapping

    public String index(Model model) {
        model.addAttribute("veterinarios", veterinarioRepository.findAll());
        model.addAttribute("propietarios", propietarioRepository.findAll());
        model.addAttribute("mascotas", mascotaRepository.findAll());
        model.addAttribute("propietario", new PropietarioModel());
        return "/veterinario/index";


    }

    @PostMapping("/nuevo")
    public String nuevo(@ModelAttribute PropietarioModel propietarioModel, BindingResult br) {
        if (br.hasErrors()) {
            return "/veterinario/index";
        } else {
            propietarioRepository.save(propietarioModel);
            return "/redirect:veterinario/index";
        }


    }
}