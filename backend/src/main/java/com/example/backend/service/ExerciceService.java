package com.example.backend.service;

import com.example.backend.model.Exercice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface ExerciceService {

    public void ajoutExercice(Exercice exercice);

}
