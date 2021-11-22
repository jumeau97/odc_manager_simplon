package com.example.backend.service;

import com.example.backend.model.Participation;
import com.example.backend.repository.ParticipationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartcipationServiceImplement implements ParticipationService{

    @Autowired
    ParticipationRepo participationRepo;
    @Override
    public Participation ajouterParticipation(Participation p) {
        return participationRepo.save(p);
    }

    @Override
    public void deleteParticipation(Long id) {
        participationRepo.deleteById(id);
    }

    @Override
    public Participation updateParticipation(Long id, Participation p) {
        return participationRepo.save(p);
    }

    @Override
    public List<Participation> getAllParticipation() {
        return participationRepo.findAll();
    }

    @Override
    public Participation getParticipationById(Long id) {
        return participationRepo.findById(id).get();
    }
}
