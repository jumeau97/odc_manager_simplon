package com.example.backend.service;

import com.example.backend.model.Participant;
import java.util.List;
public interface ParticipantService {
    public Participant addParticipant(Participant participant);
    public Participant updateParticipant(Long id, Participant participant);
    public List<Participant> listParticipant();
    //public List<Participant> ajoutExcel();
    void deleteParticipant( Long id);
    //void deleteParticipant(Long id);
}
