package com.example.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Participant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_participant;
    @NotNull(message = "Veuillez renseigner le nom du participant...")
    private String nom_complet;
    @NotNull(message = "Veuillez renseigner le numéro de téléphone...")
    private Integer telephone;
    private String domaine;
    private String structure;
    @NotNull(message = "Veuillez renseigner l'email du participant...")
    private String email;
}