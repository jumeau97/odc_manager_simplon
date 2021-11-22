package com.example.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Administrateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotBlank(message = "Veuillez renseigner le nom...")
    String nom;

    @NotBlank(message = "Veuillez renseigner le prenom...")
    String prenom;

    @NotBlank(message = "Veuillez renseigner le login...")
    String login;

    @NotBlank(message = "Veuillez renseigner le mot de pass...")
    String password;

    @NotBlank(message = "Veuillez renseigner l'email...")
    @Email
    String email;

    private Etat etat;

    //@NotNull(message = "Veuillez renseigner le rôle...")
    @ManyToOne
    private Role role;
}
