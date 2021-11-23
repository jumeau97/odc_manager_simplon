package com.example.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;


@Entity
public class Participation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_participation;
    //@Temporal(TemporalType.TIME)
    private Time heure_arrivee;
    private boolean presence;
    @ManyToOne
    private Administrateur administrateur;
    @ManyToOne
    private Participant participant;
    @ManyToOne
    private Activite activite;

    public Participation() {
    }

    public Participation(Long id_participation, Time heure_arrivee, boolean presence, Administrateur administrateur, Participant participant, Activite activite) {
        this.id_participation = id_participation;
        this.heure_arrivee = heure_arrivee;
        this.presence = presence;
        this.administrateur = administrateur;
        this.participant = participant;
        this.activite = activite;
    }

    public Long getId_participation() {
        return id_participation;
    }

    public void setId_participation(Long id_participation) {
        this.id_participation = id_participation;
    }

    public Time getHeure_arrivee() {
        return heure_arrivee;
    }

    public void setHeure_arrivee(Time heure_arrivee) {
        this.heure_arrivee = heure_arrivee;
    }

    public boolean isPresence() {
        return presence;
    }

    public void setPresence(boolean presence) {
        this.presence = presence;
    }

    public Administrateur getAdministrateur() {
        return administrateur;
    }

    public void setAdministrateur(Administrateur administrateur) {
        this.administrateur = administrateur;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public Activite getActivite() {
        return activite;
    }

    public void setActivite(Activite activite) {
        this.activite = activite;
    }
}
