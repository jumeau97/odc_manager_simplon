package com.example.backend.service;

import com.example.backend.model.Activite;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ActiviteService {
    Activite ajouterActivite (Activite activite);
    Activite modifierActivite (Activite activite);
    void supprimerActivite (Activite activite);
    void supprimerActiviteById (Long Id_activite);
    Activite getActivite (Long Id_activite);
    List<Activite> getAllActivite();
}
