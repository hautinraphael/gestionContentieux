package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Phase implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPhase;
	private String nomPhase;
	@Temporal(TemporalType.DATE)
	private Date dateDebutPhase;
	@Temporal(TemporalType.DATE)
	private Date dateFinPhase;
	@ManyToOne(fetch=FetchType.EAGER)
	private Tache tache;
	
	public Phase() {
	}

	public Phase(String nomPhase, Date dateDebutPhase, Date dateFinPhase) {
		this.nomPhase = nomPhase;
		this.dateDebutPhase = dateDebutPhase;
		this.dateFinPhase = dateFinPhase;
	}

	public Long getIdPhase() {
		return idPhase;
	}

	public void setIdPhase(Long idPhase) {
		this.idPhase = idPhase;
	}

	public String getNomPhase() {
		return nomPhase;
	}

	public void setNomPhase(String nomPhase) {
		this.nomPhase = nomPhase;
	}

	public Date getDateDebutPhase() {
		return dateDebutPhase;
	}

	public void setDateDebutPhase(Date dateDebutPhase) {
		this.dateDebutPhase = dateDebutPhase;
	}

	public Date getDateFinPhase() {
		return dateFinPhase;
	}

	public void setDateFinPhase(Date dateFinPhase) {
		this.dateFinPhase = dateFinPhase;
	}

	public Tache getTache() {
		return tache;
	}

	public void setTache(Tache tache) {
		this.tache = tache;
	}

	@Override
	public String toString() {
		return "Phase [nomPhase=" + nomPhase + ", dateDebutPhase=" + dateDebutPhase + ", dateFinPhase=" + dateFinPhase
				+ "]";
	}

	

}
