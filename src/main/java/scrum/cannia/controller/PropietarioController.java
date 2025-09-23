package scrum.cannia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import scrum.cannia.model.PropietarioModel;
import scrum.cannia.repository.PropietarioRepository;

import java.util.List;

@RestController
@RequestMapping("/api/propietarios")
public class PropietarioController {

    private final PropietarioRepository propietarioRepository;

    public PropietarioController(PropietarioRepository propietarioRepository) {
        this.propietarioRepository = propietarioRepository;
    }

    @GetMapping
    public List<PropietarioModel> getAllPropietarios() {
        return propietarioRepository.findAll();
    }
}
