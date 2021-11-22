package com.example.backend.service;

import com.example.backend.model.Activite;
import com.example.backend.repository.ActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ActiviteImp implements ActiviteService{
    @Autowired
    ActiviteRepository activiteRepository;
    //Enregistrer un nouveau activite
    @Override
    public String ajouter_Activite(Activite activite) {
        this.activiteRepository.save(activite);
        return "Ajout effectuer avec succes:"+activite.getType();
    }
    //Modifier une activite
    @Override
    @Transactional
    public void modifier_Activite(Long id_activite, Activite activite) {
        Activite activiteAncien = activiteRepository.findById(id_activite).get();
        activiteAncien.setDate_debut(activite.getDate_debut());
        activiteAncien.setDate_fin(activite.getDate_fin());
        activiteAncien.setEtat(activite.getEtat());
        activiteAncien.setLibelle(activite.getLibelle());
        activiteAncien.setType(activite.getType());
    }
    //Suprimer une activite
    @Override
    public String suprimer_Activite(Long id_activite) {
        this.activiteRepository.deleteById(id_activite);
        return "L'activite vient d'être supprimer avec succes";

    }
    //liste activite
    @Override
    public List<Activite> liste_Activite() {
        return activiteRepository.findAll();
    }
    //liste activite by id_activite
    @Override
    public Activite liste_Activite_By_Id(Long id_activite) {
        return activiteRepository.findById(id_activite).get();
    }
}
