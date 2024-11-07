package com.example.servicioconductores.repository;

import com.example.servicioconductores.model.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConductorRepository extends JpaRepository<Conductor, Long> {
}
