package com.example.backend.controller;


import com.example.backend.model.Activite;
import com.example.backend.repository.ActiviteRepository;
import com.example.backend.service.ActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/activite")
public class ActiviteController {
   @Autowired
   ActiviteService activiteService;

    //lister toutes les activités
    @GetMapping("/activites")
    public List<Activite> getAllActivite(){
    return activiteService.getAllActivite();
    }

    //AJOUTER UNE ACTIVITE
    @PostMapping("/ajouActivite")
    public String ajouterActivite(@RequestBody Activite activite){
        this.activiteService.ajouterActivite(activite);
        return "Activité ajoutée avec succèss...";
    }

    //MODIFIER UNE ACTIVITE
    @PutMapping ("modifietActivite/{Id_activite}")
    public void Modifier_activite(@RequestBody Activite activite, @PathVariable Long Id_activite) {
    this.activiteService.modifierActivite(Id_activite, activite);
     }

    //AVOIR UNE ACTIVITE PAR ID
    @GetMapping("/uneActivite/{Id_activite}")
    public Activite AvoirUneActivite(@PathVariable("Id_activite") Long Id_activite){
        return activiteService.listeById(Id_activite);
    }

    //SUPPRIMER ACTIVITE
     @DeleteMapping("/supprimerActivites/{Id_activite}")
    public String supprimerActiviteById(@PathVariable ("Id_activite") long Id_activite){
    return this.activiteService.supprimerActiviteById(Id_activite);
     }

}
