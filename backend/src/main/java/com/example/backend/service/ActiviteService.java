package com.example.backend.service;

import com.example.backend.model.Activite;

import java.util.List;

public interface ActiviteService {
    public String ajouter_Activite(Activite activite);
    public void modifier_Activite(Long id_activite, Activite activite);
    public Activite suprimer_Activite(Long id_activite, Activite activite);
    public List<Activite> liste_Activite();
    public Activite liste_Activite_By_Id(Long Id,Activite activite);
}
