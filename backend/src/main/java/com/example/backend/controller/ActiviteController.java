package com.example.backend.controller;


import com.example.backend.model.Activite;
import com.example.backend.repository.ActiviteRepository;
import com.example.backend.service.ActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin("*")
@RequestMapping("/activite")
public class ActiviteController {
   @Autowired
   ActiviteService activiteService;


@GetMapping("/Activites")
    public List<Activite> getAllActivite(){
    return activiteService.getAllActivite();
    }
    @PostMapping("/AjouActivite")
    public String ajouterActivite(@RequestBody Activite activite){
        this.activiteService.ajouterActivite(activite);
        return "ok";
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
    public void deleteAll(){
     }

}
