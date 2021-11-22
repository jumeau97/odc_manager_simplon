package com.example.backend.controller;

import com.example.backend.model.Participation;
import com.example.backend.service.ParticipationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ParticipationController {
    
    @Autowired
    ParticipationService participationService;
    
    @PostMapping("/save/presence")
    public ResponseEntity<?> save(Participation participation){
        return new ResponseEntity<>(participationService.savePresence(participation), HttpStatus.OK);
    }
}
