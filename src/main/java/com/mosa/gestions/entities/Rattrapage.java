package com.mosa.gestion.entities;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.mosa.gestion.entities.*;




@Entity
public class Rattrapage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRattrapage;
	private String motifRattrapage;
	private String nomclass;
	private Date dateCreation;
	private Long idReponse;
	private String status;
	//
		public Rattrapage() {
		super(); }

	public Rattrapage(String motifRattrapage, String nomclass, Date dateCreation,Long idReponse,String status) {
		super();
		this.motifRattrapage = motifRattrapage;
		this.nomclass = nomclass;
		this.dateCreation = dateCreation;
		this.status=status;
		this.idReponse = idReponse;
	}

	public Long getIdRattrapage() {
		return idRattrapage;
	}

	public void setIdRattrapage(Long idRattrapage) {
		this.idRattrapage = idRattrapage;
	}

	public String getMotifRattrapage() {
		return motifRattrapage;
	}

	public void setMotifRattrapage(String motifRattrapage) {
		this.motifRattrapage = motifRattrapage;
	}

	public String getNomclass() {
		return nomclass;
	}

	public void setNomclass(String nomclass) {
		this.nomclass = nomclass;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public void setIdReponse(Long idReponse) {
		this.idReponse = idReponse;
	}
	public String getStatus() {
		return status;
	}
	public Long getIdReponse() {
		return idReponse;
	}
	
	
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Rattrapage [idRattrapage=" + idRattrapage + ", motifRattrapage=" + motifRattrapage + ", nomclass="
				+ nomclass + ", dateCreation=" + dateCreation + ", idReponse=" + idReponse + ", status=" + status + "]";
	}
	
	
	
	
}



