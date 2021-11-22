package com.example.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Participation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_participation;
    @Temporal(TemporalType.TIME)
    private Date heure_arrivee;
    private boolean presence;
    @ManyToOne
    private Administrateur administrateur;
    @ManyToOne
    private Participant participant;
    @ManyToOne
    private Activite activite;

}
