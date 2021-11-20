package com.example.backend.model;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
@Data
@Entity
public class Participant implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private long id_participant ;
    private String nom_complet ;
    private String telephone;
    private String domaine;
    private String structure;
    private String email;


}
