package com.example.backend.service;

import com.example.backend.model.Participation;
import com.example.backend.repository.ParticipationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipationService {
    @Autowired
    ParticipationRepository participationRepository;

    public String savePresence(Participation participation){

        try{
            participationRepository.save(participation);
        }catch (Exception e){
            e.printStackTrace(System.out);
            return "une erreur est survenu";
        }

        return "ajouté avec succès";
    }
}
