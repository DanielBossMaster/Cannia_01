package scrum.cannia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/principal")
    public String home() {
        return "registro/principal";
    }

}