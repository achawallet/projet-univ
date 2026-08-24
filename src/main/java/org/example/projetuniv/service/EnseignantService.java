package org.example.projetuniv.service;

import org.example.projetuniv.entity.Enseignant;
import org.example.projetuniv.repository.EnseignantRepository;
import org.springframework.stereotype.Service;

@Service
public class EnseignantService {
    private final EnseignantRepository enseignantRepository;

    public EnseignantService(EnseignantRepository enseignantRepository) {
        this.enseignantRepository = enseignantRepository;
    }
    public Enseignant ajouterEnseignant(Enseignant enseignant){
        return enseignantRepository.save(enseignant);
    }
}
