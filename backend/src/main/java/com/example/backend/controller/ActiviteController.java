package com.example.backend.controller;

import com.example.backend.model.Activite;
import com.example.backend.service.ActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/activite")
public class ActiviteController {
    @Autowired
    ActiviteService activiteService;

    //Enregistrer un nouveau activite
    @PostMapping("/ajoutActivite")
    public String ajouter_Activite(@RequestBody Activite activite) {
        this.activiteService.ajouter_Activite(activite);
        return "enregistrement Ok";
    }

    //Modifier une activite
    @PutMapping("/modifierActivite/{id_activite}")
    public void modifier_activie(@RequestBody Activite activite, @PathVariable Long id_activite){
        this.activiteService.modifier_Activite(id_activite, activite);
    }

    //Suprimer une activites
    @DeleteMapping("/suprimerActivite/{id_activite}")
    public String suprimer_activite(@PathVariable("id_activite") long id_activite){
        return this.activiteService.suprimer_Activite(id_activite);
    }

    //liste activite
    @GetMapping("/listeActivite")
    public List<Activite> activitelist(){
    return activiteService.liste_Activite();
    }

    //liste activite by id_activite
    @GetMapping("/activiteById/{id_activite}")
    public Activite activite(@PathVariable("id_activite") Long id_activite){
        return activiteService.liste_Activite_By_Id (id_activite);
    }
}
