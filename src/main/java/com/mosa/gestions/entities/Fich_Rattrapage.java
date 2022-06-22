package com.mosa.gestion.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fich_Rattrapage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long idFichRattrapage;
	public String Status;
	
	public Fich_Rattrapage() {
		super();
	}

	public Fich_Rattrapage(String status) {
		super();
		Status = status;
	}

	public Long getIdFichRattrapage() {
		return idFichRattrapage;
	}

	public void setIdFichRattrapage(Long idFichRattrapage) {
		this.idFichRattrapage = idFichRattrapage;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "Fich_Rattrapage [idFichRattrapage=" + idFichRattrapage + ", Status=" + Status + "]";
	}
	
}
