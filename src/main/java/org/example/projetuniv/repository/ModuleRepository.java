package org.example.projetuniv.repository;

import org.example.projetuniv.entity.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<Module,Long> {
}
