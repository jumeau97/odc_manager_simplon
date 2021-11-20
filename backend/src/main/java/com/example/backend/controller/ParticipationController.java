package com.example.backend.controller;


import com.example.backend.model.Participation;
import com.example.backend.service.ParticipationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ParticipationController {

    @Autowired
    ParticipationService participationService;

    @PostMapping("/ajout")
    public Participation ajouterParticipation(Participation p, Long id) {
        return participationService.ajouterParticipation(p, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteParticipation(@PathVariable("id") Long id) {
        participationService.deleteParticipation(id);
    }

    @PutMapping("/update/{id}")
    public Participation updateParticipation(@PathVariable("id") Long id ,@RequestBody Participation p) {
        return participationService.updateParticipation(id, p);
    }

    @GetMapping("/get")
    public List<Participation> getAllParticipation() {
        return participationService.getAllParticipation();
    }

    @GetMapping("/get/{id}")
    public Participation getParticipationById(@PathVariable("id") Long id) {
        return participationService.getParticipationById(id);
    }
}
