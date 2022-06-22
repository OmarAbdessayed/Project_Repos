package com.mosa.gestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mosa.gestion.entities.Fich_Rattrapage;
import com.mosa.gestion.entities.Rattrapage;
import com.mosa.gestion.repos.FichRepository;
import com.mosa.gestion.repos.RatRepository;

@Service
public class RatServiceImpl implements RattrapageService {

	@Autowired
	RatRepository ratRepository;
	
	@Autowired
	FichRepository fichRepository;

	@Override
	public Rattrapage saveRat(Rattrapage r) {
		return ratRepository.save(r);
	}

	@Override
	public Rattrapage updateRat(Rattrapage r) {
		return ratRepository.save(r);
	}

	@Override
	public void deleteRat(Rattrapage r,Fich_Rattrapage f	) {
		fichRepository.delete(f);
		ratRepository.delete(r);

	}

	@Override
	public Rattrapage getRattrapage(Long id) {
		ratRepository.findById(id).get();
		return null;
	}

	@Override
	public List<Rattrapage> getAllRattrapages() {
		return ratRepository.findAll();
	}

	@Override
	public void deleteRatbyID(Long id) {
		ratRepository.deleteById(id);
	}

	@Override
	public Rattrapage GetRatByIfch(Long id) {
		Fich_Rattrapage FRat = fichRepository.findById(id).get();
		Long temp = FRat.getIdFichRattrapage();
		return ratRepository.findById(temp).get();
	}

}
