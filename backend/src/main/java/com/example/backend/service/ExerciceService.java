package com.example.backend.service;

import com.example.backend.model.Exercice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ExerciceService {

    //method ajout exercice
    public void ajoutExercice(Exercice exercice);
    //method lister exercice
    public List<Exercice> listExercice();
    //afficher exercice par identifiant
    public Exercice unExercice(Long id);
    //mise à jour un exercice
    public void reExcercice(Long id, Exercice exercice);
    //supprimer un exercice
    public void supExercice(Long id);
    //recherche exercice par année
    public List<Exercice> anneeExercice(String annee);



}
