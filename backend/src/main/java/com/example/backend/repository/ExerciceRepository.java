package com.example.backend.repository;

import com.example.backend.model.Exercice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExerciceRepository extends JpaRepository<Exercice, Long> {
    public List<Exercice> getExerciceByAnnee(String annee);

}