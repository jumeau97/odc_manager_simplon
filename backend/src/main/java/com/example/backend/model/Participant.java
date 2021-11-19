package com.example.backend.model;

import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;
@Data
@Entity
public class Participant implements Serializable {
    private long id_participant ;
    private String nom_complet ;
    private String telephone;
    private String domaine;
    private String structure;
    private String email;


}
