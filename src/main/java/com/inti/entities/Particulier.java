package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("particulier")
public class Particulier extends Tiers implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long cin;
	private String nomParticulier;
	private String prenomParticulier;
	
	public Particulier() {
		super();
	}

	public Particulier(String villeTiers, String adresseTiers, Double telTiers, Date dateAjoutTiers,
			String commentaireTiers, Long cin, String nomParticulier, String prenomParticulier) {
		super(villeTiers, adresseTiers, telTiers, dateAjoutTiers, commentaireTiers);
		this.cin = cin;
		this.nomParticulier = nomParticulier;
		this.prenomParticulier = prenomParticulier;
	}

	public Long getCin() {
		return cin;
	}

	public void setCin(Long cin) {
		this.cin = cin;
	}

	public String getNomParticulier() {
		return nomParticulier;
	}

	public void setNomParticulier(String nomParticulier) {
		this.nomParticulier = nomParticulier;
	}

	public String getPrenomParticulier() {
		return prenomParticulier;
	}

	public void setPrenomParticulier(String prenomParticulier) {
		this.prenomParticulier = prenomParticulier;
	}

	@Override
	public String toString() {
		return super.toString() + "Particulier [cin=" + cin + ", nomParticulier=" + nomParticulier + ", prenomParticulier="
				+ prenomParticulier + "]";
	}
	
	

}
