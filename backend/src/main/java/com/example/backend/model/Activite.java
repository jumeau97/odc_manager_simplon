package com.example.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@NoArgsConstructor
@ToString
@AllArgsConstructor
@Data
@Entity
public class Activite {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long Id_activite;
    private  String libelle;
    private  String type;
    Date DateDebut = new Date();
    Date DateFin = new Date();
    private String etat;
}
