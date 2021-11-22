package com.example.backend.service;

import com.example.backend.model.Participant;
import com.example.backend.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ParticipantServiceImplement implements ParticipantService {
    @Autowired
    ParticipantRepository participantRepository;

public  ParticipantServiceImplement(ParticipantRepository participantRepository){
    this.participantRepository = participantRepository;
}

    //ajouter un participant
    @Override
    public Participant addParticipant(Participant participant) {

        return participantRepository.save(participant);
    }

    //modifier un participant
    @Override
    @Transactional
    public void updateParticipant(Long id, Participant participant) {
        Participant existParticipant = this.participantRepository.findById(id).get();
        existParticipant.setNom_complet(participant.getNom_complet());
        existParticipant.setStructure(participant.getStructure());
        existParticipant.setTelephone(participant.getTelephone());
        existParticipant.setEmail(participant.getEmail());
        existParticipant.setDomaine(participant.getDomaine());
        existParticipant.setGenre(participant.getGenre());
    }

    //lister les participants
    @Override
    public List<Participant> listParticipant() {

    return participantRepository.findAll();
    }

    //supprimer un participant a travers son Id
    @Override
    public void deleteParticipant(Long id) {
        participantRepository.deleteById(id);

    }

    //avoir information d'un participant a travers son id
    @Override
    public Participant getInfo(Long id) {

    return participantRepository.findById(id).get();
    }





}
