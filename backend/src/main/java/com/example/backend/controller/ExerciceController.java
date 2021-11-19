package com.example.backend.controller;


import com.example.backend.model.Exercice;
import com.example.backend.service.ExerciceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercice")
public class ExerciceController {

    @Autowired
    ExerciceService exerciceService;

    @PostMapping("/ajout")
    public String ajouExercice(@RequestBody Exercice exercice){
        exerciceService.ajoutExercice(exercice);
        return  "exercice enregistrer avec succès";
    }


}
