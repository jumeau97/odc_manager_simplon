package com.example.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Participant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id_participant;

    @NotBlank(message = "Veuillez renseigner le nom du participant...")
    public String nom_complet;

    //@Length(min = 8, message = "Le numéro de téléphone doit comporter au minimum huit (08) caractères...")
    @NotNull(message = "Veuillez renseigner le numéro de téléphone...")
    public Integer telephone;

    public String domaine;
    public String structure;

    @NotBlank(message = "Veuillez renseigner l'email du participant...")
    public String email;
}