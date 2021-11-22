package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.model.Responsable;
import com.example.backend.repository.ResponsableRepository;

@Service
public class ResponsableServiceImp implements ResponsableService {

	@Autowired
	ResponsableRepository responsableRepository;
	
	@Override
	public Responsable Ajouter_Responsable(Responsable responsable) {
		return responsableRepository.save(responsable);
	}

	@Override
	public Responsable Modifier_Responsable(Long id, Responsable responsable) {
		Responsable responsables = responsableRepository.findById(id).orElseThrow();
		responsables.setNom(responsable.getNom());
		responsables.setPrenom(responsable.getPrenom());
		responsables.setTelephone(responsable.getTelephone());
		responsables.setDomaine(responsable.getDomaine());
		responsables.setType(responsable.getType());
		responsables.setEtat(responsable.getEtat());
		return responsableRepository.save(responsables);
	}

	@Override 
	public List<Responsable> list_Responsable() {
		return responsableRepository.findAll();
	}

	@Override
	public Responsable Afficher_Responsable_by_id(Long id) {
		return responsableRepository.findById(id).get();
	}

	@Override
	public void Supprimer_Responsable(Long id) {
		responsableRepository.deleteById(id);
		
	}

}
