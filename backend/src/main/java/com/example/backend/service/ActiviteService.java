package com.example.backend.service;

import com.example.backend.model.Activite;
import java.util.List;

public interface ActiviteService {
    public String ajouterActivite (Activite activite);
    public void modifierActivite (Long Id_activite, Activite activite);
    public String supprimerActiviteById (Long Id_activite);
    public Activite listeById (Long Id_activite);
    public List<Activite> getAllActivite();
}
