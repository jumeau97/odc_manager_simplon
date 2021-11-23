package com.example.backend.service;

import com.example.backend.model.Participation;
import com.example.backend.repository.ParticipationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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


    //La liste de presence
    public List<Participation> list(){
        List<Participation> listP= new ArrayList<>();


        try{
            listP=participationRepository.findAll();
            if (listP==null){

            }
        }catch (Exception e){
            e.printStackTrace(System.out);
            System.out.println("une erreur est survenue");
        }
        return listP;
    }

    //Liste de presence par activité
    public List<Participation> listByActivite(Long id){
        List<Participation> listPByA= new ArrayList<>();


        try{
            listPByA=participationRepository.findPresenceByActivite(id);
            if(listPByA==null){

            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("une erreur est survenue");
        }
        return listPByA;
    }
}
