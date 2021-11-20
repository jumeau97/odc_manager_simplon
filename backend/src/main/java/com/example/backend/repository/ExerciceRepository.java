package com.example.backend.repository;

import com.example.backend.model.Exercice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@RepositoryRestResource
public interface ExerciceRepository extends JpaRepository<Exercice, Id> {
}
