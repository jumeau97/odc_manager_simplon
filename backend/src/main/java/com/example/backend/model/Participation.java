package com.example.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Participation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_participation;
    @Temporal(TemporalType.TIME)
    private Date heure_arrivee;
    private boolean presence;
    private Administrateur administrateur;
    @ManyToOne
    private Participant participant;

}
