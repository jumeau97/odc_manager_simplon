package com.example.backend.controller;


import com.example.backend.model.Activite;
import com.example.backend.repository.ActiviteRepository;
import com.example.backend.service.ActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ActiviteController {
   @Autowired
   ActiviteService activiteService;


@GetMapping("/Activites")
    public List<Activite> getAllActivite(){
    return activiteService.getAllActivite();
    }
    @PostMapping("/AjouActivite")
    public Activite save(Activite activite){
        return activiteService.ajouterActivite(activite);
        }
     @PostMapping("ModifietActivite")
    public Activite modifier(Activite activite){
    return activiteService.modifierActivite(activite);
     }
     @GetMapping("/uneActivite")
    public Activite AvoirUneActivite(Long Id_activite){
    return activiteService.getActivite(Id_activite);
     }
     @DeleteMapping("/ToutSupprimerActivites")
    public Activite toutSupprimer(Activite activite){
     activiteService.supprimerActivite();
     }

}
