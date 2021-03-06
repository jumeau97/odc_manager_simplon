package com.example.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Participation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_participation;
    @ManyToOne
    private Activite id_activite;
    @ManyToOne
    private Participant id_participant;
    private Time heure_arriver;
    private boolean presence;
    @ManyToOne
    private Administrateur id_p;
}
