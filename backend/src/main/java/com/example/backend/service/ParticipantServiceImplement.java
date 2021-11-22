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
    // mettre a jour de participant
    public Participant updateParticipant(Long id, Participant participant)  {
        //return participantRepository.save(participant);
        Participant mod;
        mod= participantRepository.getById(id);
        Participant participant1 = participant;
        if(mod!=null){
            mod.setNom_complet(participant.getNom_complet());
            mod.setEmail(participant1.getEmail());
            mod.setDomaine(participant1.getDomaine());
            mod.setStructure(participant1.getStructure());
            mod.setTelephone(participant1.getTelephone());
            participantRepository.save(mod);

            System.out.println("insertion reussie");
            System.out.println("Modification reussie");
        } else {
            System.out.println("Modification reussie");
        }
        return participant1;

    }

    @Override
    public List<Participant> listParticipant() {
        return participantRepository.findAll();
    }

    @Override
    public void deleteParticipant(Long id) {
        participantRepository.deleteById(id);

    }

}
