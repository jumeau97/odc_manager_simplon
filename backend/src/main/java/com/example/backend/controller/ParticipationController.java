package com.example.backend.controller;

import com.example.backend.model.Participation;
import com.example.backend.service.ParticipationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ParticipationController {
    
    @Autowired
    ParticipationService participationService;
    
    @PostMapping("/save/presence")
    public ResponseEntity<?> save(@RequestBody Participation participation){
        return new ResponseEntity<>(participationService.savePresence(participation), HttpStatus.OK);
    }
    
    @GetMapping("/list/presence")
    public ResponseEntity<?> list(){
        return new ResponseEntity<>(participationService.list(),HttpStatus.OK);
    }

    @GetMapping("list/presence/activite/{id}")
    public ResponseEntity<?> listByAc(@RequestBody @PathVariable(name = "id") Long id){
        return  new ResponseEntity<>(participationService.listByActivite(id),HttpStatus.OK);
    }
}
