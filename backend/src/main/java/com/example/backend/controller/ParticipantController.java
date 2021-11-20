package com.example.backend.controller;
import com.example.backend.model.Participant;
import com.example.backend.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class ParticipantController {
    @Autowired
    ParticipantService participantService;

    @PostMapping(value="/participant")
    public String save(@RequestBody Participant participant){
        participantService.addParticipant(participant);
        return "Participant ajouté avec succèss...";
    }
    @DeleteMapping(value = "/deleteParticipant/{id}")
    public String delete (@PathVariable("id") Long id){
       participantService.deleteParticipant(id);
       return "Participant supprimé avec succèss...";
    }

    @PutMapping(path = "/participant/{id}")
    public Participant update(@RequestBody Participant participant, @PathVariable Long id){
       return participantService.updateParticipant(id,participant);
    }

    //pour afficher la liste
    @GetMapping("/participants")
    @ResponseBody
    public List<Participant> list(){
        return participantService.listParticipant();
    }
}
