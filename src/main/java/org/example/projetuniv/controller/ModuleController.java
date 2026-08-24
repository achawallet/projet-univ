package org.example.projetuniv.controller;

import org.example.projetuniv.entity.Module;
import org.example.projetuniv.service.ModuleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ModuleController {
    private final ModuleService moduleService;
    public ModuleController(ModuleService moduleService) {
        this.moduleService = moduleService;
    }
    @GetMapping("/module")
        public String afficherModule(){
            return"module";
        }

    @PostMapping("/module")
    public String  ajouterModule(Module module){
        moduleService.ajouterModule(module);
        return "redirect:/module";
    }

}
