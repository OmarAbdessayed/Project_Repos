package com.mosa.gestion.service;

import java.util.List;

import com.mosa.gestion.entities.Fich_Rattrapage;
import com.mosa.gestion.entities.Rattrapage;

public interface RattrapageService {
	
	Rattrapage saveRat(Rattrapage r);
	Rattrapage updateRat(Rattrapage r);
	void deleteRat(Rattrapage r,Fich_Rattrapage f);
	void deleteRatbyID(Long id);
	Rattrapage getRattrapage(Long id);
	List<Rattrapage> getAllRattrapages();
	Rattrapage GetRatByIfch(Long id);

}
