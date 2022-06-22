package com.mosa.gestion.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mosa.gestion.entities.Rattrapage;

public interface RatRepository extends JpaRepository<Rattrapage, Long>{
	
	
/*	@Query("select idReponse from Rattrapage R where R.idReponse = id ")
	Long findbyFichID(Long id);*/
}
