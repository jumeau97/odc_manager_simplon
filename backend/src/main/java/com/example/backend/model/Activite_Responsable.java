package com.example.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Activite_Responsable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_activite_responsable;
    @ManyToOne
    private Responsable responsable;
    @ManyToOne
    private Activite activite;
}
