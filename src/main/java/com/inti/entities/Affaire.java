package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Affaire implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAffaire;
	private String reference;
	private String titreAffaire;
	private String descriptionAffaire;
	private int statutAffaire;
	@OneToMany (mappedBy="affaire", fetch=FetchType.EAGER)
	private Set<Document> documents = new HashSet<>();
	@OneToMany (mappedBy="affaire", fetch=FetchType.EAGER)
	private Set<Tache> taches = new HashSet<>();
	
	public Affaire() {
	}

	public Affaire(String reference, String titreAffaire, int statutAffaire) {
		this.reference = reference;
		this.titreAffaire = titreAffaire;
		this.statutAffaire = statutAffaire;
	}

	public Long getIdAffaire() {
		return idAffaire;
	}

	public void setIdAffaire(Long idAffaire) {
		this.idAffaire = idAffaire;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getTitreAffaire() {
		return titreAffaire;
	}

	public void setTitreAffaire(String titreAffaire) {
		this.titreAffaire = titreAffaire;
	}

	public String getDescriptionAffaire() {
		return descriptionAffaire;
	}

	public void setDescriptionAffaire(String descriptionAffaire) {
		this.descriptionAffaire = descriptionAffaire;
	}

	public int getStatutAffaire() {
		return statutAffaire;
	}

	public void setStatutAffaire(int statutAffaire) {
		this.statutAffaire = statutAffaire;
	}

	public Set<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}

	public Set<Tache> getTaches() {
		return taches;
	}

	public void setTaches(Set<Tache> taches) {
		this.taches = taches;
	}

	@Override
	public String toString() {
		return "Affaire [reference=" + reference + ", titreAffaire=" + titreAffaire + ", descriptionAffaire=" + descriptionAffaire + ", statutAffaire="
				+ statutAffaire + "]";
	}
	
	

}
