package com.mosa.gestions.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mosa.gestions.entities.Reclamation;


@RepositoryRestResource(path = "rest")
public interface RecRepository extends JpaRepository<Reclamation, Long> {
	List<Reclamation> findByNomRec(String nom);
	List<Reclamation> findByNomRecContains(String nom);
	List<Reclamation> findByOrderByNomRecAsc();
	
	

}
