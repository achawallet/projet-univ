package org.example.projetuniv.controller;

import org.example.projetuniv.entity.Enseignant;
import org.example.projetuniv.service.EnseignantService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EnseignantController {
    private final EnseignantService enseignantService;

    public EnseignantController(EnseignantService enseignantService) {
        this.enseignantService = enseignantService;
    }
    @GetMapping("/ens")
    public String afficherEnseignant(){
        return "enseignant";
    }
    @PostMapping("/ens")
    public String ajouterEnseignant(Enseignant enseignant){
        enseignantService.ajouterEnseignant(enseignant);
        return "redirect:/ens";
    }
}
