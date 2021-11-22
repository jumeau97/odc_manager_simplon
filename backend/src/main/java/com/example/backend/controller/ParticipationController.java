package com.example.backend.controller;


import com.example.backend.model.Participation;
import com.example.backend.service.ParticipationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/participation")
public class ParticipationController {

    @Autowired
    ParticipationService participationService;

    @PostMapping("/ajoutp")
    public Participation ajouterParticipation(@RequestBody Participation p) {
        return participationService.ajouterParticipation(p);
    }

    @DeleteMapping("/deletep/{id}")
    public void deleteParticipation(@PathVariable("id") Long id) {
        participationService.deleteParticipation(id);
    }

    @PutMapping("/updatep/{id}")
    public Participation updateParticipation(@PathVariable("id") Long id ,@RequestBody Participation p) {
        return participationService.updateParticipation(id, p);
    }

    @GetMapping("/getp")
    public List<Participation> getAllParticipation() {
        return participationService.getAllParticipation();
    }

    @GetMapping("/get/{id}")
    public Participation getParticipationById(@PathVariable("id") Long id) {
        return participationService.getParticipationById(id);
    }
}
