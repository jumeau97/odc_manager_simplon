package com.example.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Data @NoArgsConstructor
@AllArgsConstructor
@Entity
public class Participant implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id_participant ;
    private String nom_complet ;
    private Integer telephone;
    private String domaine;
    private String structure;
    private String email;
//    @OneToMany(mappedBy = "particpant")
//    private Collection<Participation>participations;


}
