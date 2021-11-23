package com.example.backend.model;
import com.example.backend.enumeration.Etat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Activite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_activite;
    private String libelle;
    private String type;
    private LocalDate date_debut;
    private LocalDate date_fin;
    private Etat etat;
    @ManyToOne
    private Exercice exercice;

}
