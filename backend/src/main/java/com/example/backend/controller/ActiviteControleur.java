package com.example.backend.controller;

import com.example.backend.model.Activite;
import com.example.backend.service.ActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/activite")
public class ActiviteControleur {
    @Autowired
    ActiviteService activiteService;
    //Enregistrer un nouveau activite
    @PostMapping("/ajoutActivite")
    public String ajouter_Activite(@RequestBody Activite activite) {
        this.activiteService.ajouter_Activite(activite);
        return "enregistrement Ok";
    };
    //Modifier une activite
    @PutMapping("/modifierActivite/{id_activite}")
    public void modifier_activie(@RequestBody Activite activite, @PathVariable Long id_activite){
        this.activiteService.modifier_Activite(id_activite, activite);
    };
    //Suprimer une activite
    @DeleteMapping("/suprimerActivite/{id_activite}")
    public String suprimer_activite(@PathVariable("id_activite") long id_activite){
        return this.activiteService.suprimer_Activite(id_activite);
    }
}
