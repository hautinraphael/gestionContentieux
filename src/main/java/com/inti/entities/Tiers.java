package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance (strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name="type",discriminatorType=DiscriminatorType.STRING ) 
public class Tiers implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTiers;
	private String villeTiers;
	private String adresseTiers;
	private Double telTiers;
	@Temporal(TemporalType.DATE)
	private Date dateAjoutTiers;
	private String commentaireTiers;
	@ManyToOne(fetch=FetchType.EAGER)
	private Utilisateur utilisateur;
	
	public Tiers() {
	}

	public Tiers(String villeTiers, String adresseTiers, Double telTiers, Date dateAjoutTiers,
			String commentaireTiers) {
		super();
		this.villeTiers = villeTiers;
		this.adresseTiers = adresseTiers;
		this.telTiers = telTiers;
		this.dateAjoutTiers = dateAjoutTiers;
		this.commentaireTiers = commentaireTiers;
	}

	public Long getIdTiers() {
		return idTiers;
	}

	public void setIdTiers(Long idTiers) {
		this.idTiers = idTiers;
	}

	public String getAdresseTiers() {
		return adresseTiers;
	}

	public void setAdresseTiers(String adresseTiers) {
		this.adresseTiers = adresseTiers;
	}

	public Double getTelTiers() {
		return telTiers;
	}

	public void setTelTiers(Double telTiers) {
		this.telTiers = telTiers;
	}

	public Date getDateAjoutTiers() {
		return dateAjoutTiers;
	}

	public void setDateAjoutTiers(Date dateAjoutTiers) {
		this.dateAjoutTiers = dateAjoutTiers;
	}

	public String getCommentaireTiers() {
		return commentaireTiers;
	}

	public void setCommentaireTiers(String commentaireTiers) {
		this.commentaireTiers = commentaireTiers;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public String getVilleTiers() {
		return villeTiers;
	}

	public void setVilleTiers(String villeTiers) {
		this.villeTiers = villeTiers;
	}

	@Override
	public String toString() {
		return "Tiers [villeTiers=" + villeTiers + ", adresseTiers=" + adresseTiers + ", telTiers=" + telTiers
				+ ", dateAjoutTiers=" + dateAjoutTiers + ", commentaireTiers=" + commentaireTiers + "]";
	}

	

}
