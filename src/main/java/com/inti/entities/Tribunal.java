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
public class Tribunal implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTribunal;
	private String adresseTribunal;
	private Double fax;
	private Double telTribunal;
	private String region;
	@OneToMany (mappedBy="tribunal", fetch=FetchType.EAGER)
	private Set<Tache> taches = new HashSet<>();
	
	public Tribunal() {
	}

	public Tribunal(String adresseTribunal, Double fax, Double telTribunal, String region) {
		this.adresseTribunal = adresseTribunal;
		this.fax = fax;
		this.telTribunal = telTribunal;
		this.region = region;
	}

	public Long getIdTribunal() {
		return idTribunal;
	}

	public void setIdTribunal(Long idTribunal) {
		this.idTribunal = idTribunal;
	}

	public String getAdresseTribunal() {
		return adresseTribunal;
	}

	public void setAdresseTribunal(String adresseTribunal) {
		this.adresseTribunal = adresseTribunal;
	}

	public Double getFax() {
		return fax;
	}

	public void setFax(Double fax) {
		this.fax = fax;
	}

	public Double getTelTribunal() {
		return telTribunal;
	}

	public void setTelTribunal(Double telTribunal) {
		this.telTribunal = telTribunal;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Set<Tache> getTaches() {
		return taches;
	}

	public void setTaches(Set<Tache> taches) {
		this.taches = taches;
	}

	@Override
	public String toString() {
		return "Tribunal [adresseTribunal=" + adresseTribunal + ", fax=" + fax + ", telTribunal=" + telTribunal
				+ ", region=" + region + "]";
	}
	
	

}
