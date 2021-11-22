package com.example.backend.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
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

}
