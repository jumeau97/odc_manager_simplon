package com.example.backend.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
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
    private TypeActivite type;
    private Date date_debut;
    private Date date_fin;
    private Etat etat;

}
