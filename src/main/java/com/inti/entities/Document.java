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
public class Document implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDocument;
	@Temporal(TemporalType.DATE)
	private Date dateCreationDoc;
	private String nomDoc;
	private String descriptionDoc;
	@ManyToOne(fetch=FetchType.EAGER)
	private Affaire affaire;
	
	public Document() {
	}

	public Document(Date dateCreationDoc, String nomDoc, String descriptionDoc) {
		this.dateCreationDoc = dateCreationDoc;
		this.nomDoc = nomDoc;
		this.descriptionDoc = descriptionDoc;
	}

	public Long getIdDocument() {
		return idDocument;
	}

	public void setIdDocument(Long idDocument) {
		this.idDocument = idDocument;
	}

	public Date getDateCreationDoc() {
		return dateCreationDoc;
	}

	public void setDateCreationDoc(Date dateCreationDoc) {
		this.dateCreationDoc = dateCreationDoc;
	}

	public String getNomDoc() {
		return nomDoc;
	}

	public void setNomDoc(String nomDoc) {
		this.nomDoc = nomDoc;
	}

	public String getDescriptionDoc() {
		return descriptionDoc;
	}

	public void setDescriptionDoc(String descriptionDoc) {
		this.descriptionDoc = descriptionDoc;
	}

	public Affaire getAffaire() {
		return affaire;
	}

	public void setAffaire(Affaire affaire) {
		this.affaire = affaire;
	}

	@Override
	public String toString() {
		return "Document [dateCreationDoc=" + dateCreationDoc + ", nomDoc=" + nomDoc + ", descriptionDoc="
				+ descriptionDoc + "]";
	}
	
	
	
}
