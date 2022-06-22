package com.mosa.gestions.entities;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Reclamation implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRec;
	private String nomRec;
	private String typeRec;
	private String typeSalle;
	private String nomSalle;
	private String matiere;
	private String priorite;
	private String descriptif;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date datePla;
	

	
	public Reclamation(String nomRec, String typeRec, String typeSalle, String nomSalle, String matiere,
			String priorite, String descriptif, Date datePla) {
		super();
		this.nomRec = nomRec;
		this.typeRec = typeRec;
		this.typeSalle = typeSalle;
		this.nomSalle = nomSalle;
		this.matiere = matiere;
		this.priorite = priorite;
		this.descriptif = descriptif;
		this.datePla = datePla;
	}

	public Long getIdRec() {
		return idRec;
	}
	
	public void setIdRec(Long idRec) {
		this.idRec = idRec;
	}
	
	public String getNomRec() {
		return nomRec;
	}
	
	public void setNomRec(String nomRec) {
		this.nomRec = nomRec;
	}
		


	public String getTypeSalle() {
		return typeSalle;
	}
	
	public void setTypeSalle(String typeSalle) {
		this.typeSalle = typeSalle;
	}
	
	public String getNomSalle() {
		return nomSalle;
	}
	
	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}
	
	public String getMatiere() {
		return matiere;
	}
	
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	
	public String getPriorite() {
		return priorite;
	}
	
	public void setPriorite(String priorite) {
		this.priorite = priorite;
	}
	
	public String getDescriptif() {
		return descriptif;
	}
	
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	
	public Date getDatePla() {
		return datePla;
	}
	
	public void setDatePla(Date datePla) {
		this.datePla = datePla;
	}

	
	
	public String getTypeRec() {
		return typeRec;
	}

	public void setTypeRec(String typeRec) {
		this.typeRec = typeRec;
	}

	public Reclamation() {
		super();
	}

	@Override
	public String toString() {
		return "Reclamation [idRec=" + idRec + ", nomRec=" + nomRec + ", typeRec=" + typeRec + ", typeSalle="
				+ typeSalle + ", nomSalle=" + nomSalle + ", matiere=" + matiere + ", priorite=" + priorite
				+ ", descriptif=" + descriptif + ", datePla=" + datePla + "]";
	}


	

}
