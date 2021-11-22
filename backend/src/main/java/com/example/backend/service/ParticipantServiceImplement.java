package com.example.backend.service;

import com.example.backend.model.Participant;
import com.example.backend.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantServiceImplement implements ParticipantService {
    @Autowired
    ParticipantRepository participantRepository;
    @Override
    public Participant addParticipant(Participant participant) {
        return participantRepository.save(participant);
    }

    @Override
    public Participant updateParticipant(Long id, Participant participant) {
        return participantRepository.save(participant);
    }

    @Override
    public List<Participant> listParticipant() {
        return participantRepository.findAll();
    }

    @Override
    public void deleteParticipant(Long id, Participant participant) {
        participantRepository.deleteById(id);
    }

    @Override
    public void deleteParticipant(Long id) {

    }
}
