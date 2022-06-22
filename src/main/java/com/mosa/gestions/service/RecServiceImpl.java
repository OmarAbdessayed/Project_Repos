package com.mosa.gestions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.mosa.gestions.entities.Reclamation;

import com.mosa.gestions.repos.RecRepository;
;


@Service
public class RecServiceImpl implements RecService{
	@Autowired
	RecRepository recRepository;

	
	@Override
	public Reclamation saveReclamation(Reclamation p) {
		
		return recRepository.save(p);
		}
		@Override
		public Reclamation updateReclamation(Reclamation p) {
		return recRepository.save(p);
		}
		@Override
		public void deleteReclamation(Reclamation p) {
			recRepository.delete(p);
		}
		@Override
		public void deleteReclamationById(Long id) {
			recRepository.deleteById(id);
		}
		@Override
		public Reclamation getReclamation(Long id) {
		return recRepository.findById(id).get();
		}
		@Override
		public List<Reclamation> getAllReclamations() {
		return recRepository.findAll();
		}
		@Override
		public Page<Reclamation> getAllReclamationsParPage(int page, int size) {
		return recRepository.findAll(PageRequest.of(page, size));
		}
		@Override
		public List<Reclamation> findByNomRec(String nom) {
		return recRepository.findByNomRec(nom);
		}
		@Override
		public List<Reclamation> findByNomRecContains(String nom) {
		return recRepository.findByNomRecContains(nom);
		}
		@Override
		public List<Reclamation> findByOrderByNomRecAsc() {
		return recRepository.findByOrderByNomRecAsc();
		}
		
		
	}
