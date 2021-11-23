package com.example.backend.controller;

import com.example.backend.model.Activite;
import com.example.backend.model.Activite_Responsable;
import com.example.backend.repository.Activite_ResponsableRepository;
import com.example.backend.service.Activite_ResponsableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Activite_ResponsableController {
    @Autowired
    Activite_ResponsableService actresp;
    @PostMapping(path="/ajou")
    public String save(@RequestBody Activite_Responsable act) {
       actresp.ajouteractiviteparresponsable(act);
       return "succès";
    }
}
