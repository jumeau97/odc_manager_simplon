package com.example.backend.service;

import com.example.backend.model.Exercice;
import com.example.backend.repository.ExerciceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciceServiceImp implements ExerciceService{

    @Autowired
    ExerciceRepository exerciceRepository;


    @Override
    public void ajoutExercice(Exercice exercice) {
        exerciceRepository.save(exercice);

    }
}
