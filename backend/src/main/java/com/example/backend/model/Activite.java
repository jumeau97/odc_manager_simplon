package com.example.backend.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Activite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_activite;
    private String libelle;
    private String type;
    private Date date_debut;
    private Date date_fin;
    private String etat;
    @OneToMany(mappedBy = "activite")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Participation> participations;

}
