package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("professionnel")
public class Professionnel extends Tiers implements Serializable{
	private static final long serialVersionUID = 1L;
	private String raisonSociale;
	
	public Professionnel() {
		super();
	}

	public Professionnel(String villeTiers, String adresseTiers, Double telTiers, Date dateAjoutTiers,
			String commentaireTiers, String raisonSociale) {
		super(villeTiers, adresseTiers, telTiers, dateAjoutTiers, commentaireTiers);
		this.raisonSociale = raisonSociale;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	@Override
	public String toString() {
		return super.toString() + "Professionel [raisonSociale=" + raisonSociale + "]";
	}
	
	

}
