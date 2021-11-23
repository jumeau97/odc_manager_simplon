package com.example.backend.service;

import com.example.backend.model.Activite;
import com.example.backend.model.Activite_Responsable;

public interface Activite_ResponsableService {
    public void   ajouteractiviteparresponsable(Activite_Responsable act);
    public Activite modifieractiviteparresponsable(Activite_Responsable act, Long id_activite_responsable);
    public void supprimeractiviteparresponsable(Long id_activite_responsable);
}
