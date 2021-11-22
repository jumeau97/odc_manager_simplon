package com.example.backend.model;

import com.example.backend.ParticipantGenre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Data @NoArgsConstructor
@AllArgsConstructor
@Entity
public class Participant implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id_participant ;

    @Column(nullable = false, length = 50)
    private String nom_complet ;

    @Column(nullable = false, length = 14)
    private Integer telephone;

    @Column(nullable = false, length = 30)
    private String domaine;

    private String structure;

    @Column(nullable = false, length = 30)
    private String email;

    @Enumerated(EnumType.STRING)
    private ParticipantGenre genre;


}
