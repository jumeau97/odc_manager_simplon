package com.example.backend.model;

import com.example.backend.enumeration.Etat;
import com.example.backend.enumeration.Statut;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
public class Exercice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String annee;
    private LocalDate date_debut;
    private LocalDate date_fin;
    private Statut statut;
    private Etat etat;
}
