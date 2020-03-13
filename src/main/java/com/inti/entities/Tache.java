package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tache implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTache;
	@Temporal(TemporalType.DATE)
	private Date dateDebutTache;
	@Temporal(TemporalType.DATE)
	private Date dateFinTache;
	private String titreTache;
	private String descriptionTache;
	private Boolean statutAudience;
	@ManyToOne(fetch=FetchType.EAGER)
	private Affaire affaire;
	@ManyToOne(fetch=FetchType.EAGER)
	private Tribunal tribunal;
	@ManyToOne(fetch=FetchType.EAGER)
	private Utilisateur utilisateur;
	@OneToMany (mappedBy="tache", fetch=FetchType.EAGER)
	private Set<Phase> phases = new HashSet<>();
	
	public Tache() {
	}

	public Tache(Date dateDebutTache, Date dateFinTache, String titreTache, String descriptionTache) {
		this.dateDebutTache = dateDebutTache;
		this.dateFinTache = dateFinTache;
		this.titreTache = titreTache;
		this.descriptionTache = descriptionTache;
	}

	public Long getIdTache() {
		return idTache;
	}

	public void setIdTache(Long idTache) {
		this.idTache = idTache;
	}

	public String getTitreTache() {
		return titreTache;
	}

	public void setTitreTache(String titreTache) {
		this.titreTache = titreTache;
	}

	public String getDescriptionTache() {
		return descriptionTache;
	}

	public void setDescriptionTache(String descriptionTache) {
		this.descriptionTache = descriptionTache;
	}

	public Boolean getStatutAudience() {
		return statutAudience;
	}

	public void setStatutAudience(Boolean statutAudience) {
		this.statutAudience = statutAudience;
	}

	public Affaire getAffaire() {
		return affaire;
	}

	public void setAffaire(Affaire affaire) {
		this.affaire = affaire;
	}

	public Tribunal getTribunal() {
		return tribunal;
	}

	public void setTribunal(Tribunal tribunal) {
		this.tribunal = tribunal;
	}

	public Set<Phase> getPhases() {
		return phases;
	}

	public void setPhases(Set<Phase> phases) {
		this.phases = phases;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Date getDateDebutTache() {
		return dateDebutTache;
	}

	public void setDateDebutTache(Date dateDebutTache) {
		this.dateDebutTache = dateDebutTache;
	}

	public Date getDateFinTache() {
		return dateFinTache;
	}

	public void setDateFinTache(Date dateFinTache) {
		this.dateFinTache = dateFinTache;
	}

	@Override
	public String toString() {
		return "Tache [dateDebutTache=" + dateDebutTache + ", dateFinTache=" + dateFinTache + ", titreTache="
				+ titreTache + ", descriptionTache=" + descriptionTache + "]";
	}

	
	

}
