package com.example.backend.service;

import com.example.backend.model.Activite;
import com.example.backend.repository.ActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ActiviteImp implements ActiviteService{
    @Autowired
    ActiviteRepository activiteRepository;

    @Override
    public Activite ajouterActivite(Activite activite) {
        return activiteRepository.save(activite);
    }

    @Override
    public Activite modifierActivite(Activite activite) {
        return activiteRepository.save(activite);
    }

    @Override
    public void supprimerActivite(Activite activite) {
        activiteRepository.delete(activite);

    }

    @Override
    public void supprimerActiviteById(Long Id_activite) {
        activiteRepository.deleteById( Id_activite);

    }

    @Override
    public Activite getActivite(Long Id_activite) {
        return activiteRepository.findById(Id_activite).get();
    }

    @Override
    public List<Activite> getAllActivite() {
        return activiteRepository.findAll();
    }
}
