package com.mosa.gestions.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.mosa.gestions.entities.Reclamation;



public interface RecService {

	Reclamation saveReclamation(Reclamation p);
	Reclamation updateReclamation(Reclamation p);
	void deleteReclamation(Reclamation p);
	void deleteReclamationById(Long id);
	Reclamation getReclamation(Long id);
	List<Reclamation> getAllReclamations();
	
	Page<Reclamation> getAllReclamationsParPage(int page, int size);
	
	List<Reclamation> findByNomRec(String nom);
	List<Reclamation> findByNomRecContains(String nom);
	List<Reclamation> findByOrderByNomRecAsc();
	
	
	
}
