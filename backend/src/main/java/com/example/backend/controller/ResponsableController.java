package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.model.Responsable;
import com.example.backend.service.ResponsableService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ResponsableController {
	@Autowired
	ResponsableService responsableService;
	
	//Affichage de la liste
    @GetMapping("/responsables")
    public List<Responsable> getResponsableList(){
    return  responsableService.list_responsable();
    }
    
    //Affichage par id
    @GetMapping(path = "/responsable/{id}")
    public Responsable getOneresponsable(@PathVariable(value= "id") Long id){
        return responsableService.afficher_responsable_by_id(id);
    }
    
    //Ajout d'un responsable
    @PostMapping(path="/ajout")
    public Responsable save(@RequestBody Responsable responsable) {
        return responsableService.ajouter_responsable(responsable);
    }

    //Modification d'un responsable par son id
    @PutMapping("/update/{id}")
    public Responsable updateResponsable(@PathVariable Long id, @RequestBody Responsable responsable){
        return responsableService.modifier_responsable(id, responsable);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteresponsable(@PathVariable Long id) {
        responsableService.supprimer_responsable(id);
    }
}