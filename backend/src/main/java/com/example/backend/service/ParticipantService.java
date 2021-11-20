package com.example.backend.service;

import com.example.backend.model.Participant;

import java.util.List;

public interface ParticipantService {

    public Participant addParticipant(Participant participant);
    public void updateParticipant(Long id, Participant participant);
    public List<Participant> listParticipant();
    public void deleteParticipant(Long id);
    public Participant getInfo(Long id);
}
