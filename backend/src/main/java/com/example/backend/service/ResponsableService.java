package com.example.backend.service;

import java.util.List;

import com.example.backend.model.Responsable;

public interface ResponsableService {
	public abstract Responsable Ajouter_Responsable(Responsable responsable);
	public abstract Responsable Modifier_Responsable(Long id, Responsable responsable);
	public abstract List<Responsable> list_Responsable();
	public abstract Responsable Afficher_Responsable_by_id(Long id);
	void Supprimer_Responsable(Long id);

}
