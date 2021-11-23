package com.example.backend.service;

import com.example.backend.model.Activite;
import com.example.backend.model.Activite_Responsable;
import com.example.backend.repository.Activite_ResponsableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Activite_ResponsableServiceImp implements Activite_ResponsableService {
    @Autowired
    Activite_ResponsableRepository activite_responsableRepository;


    @Override
    public void ajouteractiviteparresponsable(Activite_Responsable act) {
        activite_responsableRepository.save( act);
    }

    @Override
    public Activite modifieractiviteparresponsable(Activite_Responsable act, Long id_activite_responsable) {
        return null;
    }

    @Override
    public void supprimeractiviteparresponsable(Long id_activite_responsable) {

    }
}
