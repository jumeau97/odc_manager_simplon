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
    public Participant save (@RequestBody Participant participant){
        return participantService.addParticipant(participant);
    }
    @DeleteMapping(value = "/deleteParticipant/{id}")
    public void delete (@PathVariable("id") Long id,Participant participant){
       participantService.deleteParticipant(id,participant);
    }
    @PutMapping(path = "/update/{id}")
    public Participant update(@RequestBody Participant participant, @PathVariable(name = "id") Long id){
       return participantService.updateParticipant(id,participant);
    }
    //pour afficher la liste
    @GetMapping("/participant")
    @ResponseBody
    public List<Participant> list(){
        return participantService.listParticipant();

    }
}
