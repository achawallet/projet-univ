package org.example.projetuniv.service;

import org.example.projetuniv.entity.Module;
import org.example.projetuniv.repository.ModuleRepository;
import org.springframework.stereotype.Service;

@Service
public class ModuleService {
    private final ModuleRepository moduleRepository;

    public ModuleService(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }
    public Module ajouterModule(Module module){
        return moduleRepository.save(module);
    }
}
