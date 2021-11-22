package com.example.backend.controller;


import com.example.backend.model.Exercice;
import com.example.backend.service.ExerciceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercice")
public class ExerciceController {

    @Autowired
    ExerciceService exerciceService;

    //ajouter un exercice
    @PostMapping("/ajout")
    public String ajouExercice(@RequestBody Exercice exercice){
        exerciceService.ajoutExercice(exercice);
        return  "exercice enregistrer avec succès";
    }

    //lister les exercice
    @GetMapping("/liste")
    public List<Exercice> listExercice(){
        return exerciceService.listExercice();
    }

    //un exercice par son identifiant
    @GetMapping("/une/{id}")
    public Exercice unExercice(@PathVariable("id") Long id){
        return exerciceService.unExercice(id);
    }

    //mise à jour exercice
    @PutMapping("/ajour/{id}")
    public String reExercice(@PathVariable Long id, @RequestBody Exercice exercice){
        exerciceService.reExcercice(id, exercice);
        return "exercice modifier avec succès";
    }

    //supprimer un exercice
    @DeleteMapping("/supprimer/{id}")
    public String supExercice(@PathVariable Long id){
        exerciceService.supExercice(id);
        return "exercice supprimer avec succès";
    }

    //recherche exercice par annee
    @GetMapping("/annee/{annee}")
    public List<Exercice> recherExerciceAnnee(@PathVariable("annee") String annee){
        return this.exerciceService.anneeExercice(annee);
    }




}
