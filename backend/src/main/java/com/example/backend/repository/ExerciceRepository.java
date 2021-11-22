package com.example.backend.repository;

import com.example.backend.model.Exercice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RepositoryRestResource
public interface ExerciceRepository extends JpaRepository<Exercice, Long> {

   public List<Exercice> getExerciceByAnnee(String annee);
}
