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
//@AllArgsConstructor
@ToString
//@NoArgsConstructor
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

    public Exercice() {
    }

    public Exercice(Long id, String annee, LocalDate date_debut, LocalDate date_fin, Statut statut, Etat etat) {
        this.id = id;
        this.annee = annee;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.statut = statut;
        this.etat = etat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public LocalDate getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(LocalDate date_debut) {
        this.date_debut = date_debut;
    }

    public LocalDate getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(LocalDate date_fin) {
        this.date_fin = date_fin;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

}
