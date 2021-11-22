package com.example.backend.service;

import com.example.backend.model.Exercice;
import com.example.backend.repository.ExerciceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciceServiceImp implements ExerciceService{

    @Autowired
    ExerciceRepository exerciceRepository;


    @Override
    public void ajoutExercice(Exercice exercice) {
        exerciceRepository.save(exercice);

    }

    @Override
    public List<Exercice> listExercice() {
        return  exerciceRepository.findAll();
    }

    @Override
    public Exercice unExercice(Long id) {
        Optional<Exercice> optional = exerciceRepository.findById(id);
        Exercice exercice = null;
        if (optional.isPresent()){
            exercice = optional.get();
        }
        return exercice;
    }

    @Override
    @Transactional
    public void reExcercice(Long id, Exercice exercice) {
        Exercice exercice1 = exerciceRepository.findById(id).get();
        exercice1.setAnnee(exercice.getAnnee());
        exercice1.setDate_debut(exercice.getDate_debut());
        exercice1.setDate_fin(exercice.getDate_fin());
        exercice1.setStatut(exercice.getStatut());
        exercice1.setEtat(exercice.getEtat());
    }

    @Override
    public void supExercice(Long id) {
        exerciceRepository.deleteById(id);
    }

    @Override
    public List<Exercice> anneeExercice(String annee) {
        return this.exerciceRepository.getExerciceByAnnee(annee);
    }


}
