package com.example.backend.service;

import java.util.List;

import com.example.backend.model.Responsable;

public interface ResponsableService {
	public abstract Responsable ajouter_responsable(Responsable responsable);
	public abstract Responsable modifier_responsable(Long id, Responsable responsable);
	public abstract List<Responsable> list_responsable();
	public abstract Responsable afficher_responsable_by_id(Long id);
	void supprimer_responsable(Long id);

}
