package com.mosa.gestion.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mosa.gestion.entities.Fich_Rattrapage;

public interface FichRepository extends JpaRepository<Fich_Rattrapage, Long> {
}
