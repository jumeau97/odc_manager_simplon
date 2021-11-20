package com.example.backend.controller;


import com.example.backend.model.Participant;
import com.example.backend.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ParticipantController {

    @Autowired
    ParticipantService participantService;

    //Ajouter
    @PostMapping("/addParticipant")
    public Participant save (@RequestBody Participant participant){
        return participantService.addParticipant(participant);
    }

    //suppression
    @DeleteMapping("/deleteParticipant/{id}")
    public void delete (@PathVariable("id") Long id){
        participantService.deleteParticipant(id);
    }

    //mise à jour
    @PutMapping("/updateParticipant/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody Participant participant){
        participantService.updateParticipant(id,participant);
    }

    //pour afficher la liste
    @GetMapping("/listParticipant")
    @ResponseBody
    public List<Participant> list(){
        return participantService.listParticipant();

    }

    //Avoir information d'un Particiapnt
    @GetMapping("/getById/{id}")
    public Participant getInfo(@PathVariable("id") Long id, Participant participant){
        return participantService.getInfo(id);
    }
}
