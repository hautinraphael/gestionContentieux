package com.inti.entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String nomUtilisateur;
	private String prenomUtilisateur;
	@Column(unique=true)	
	private String username;
	private String password;
	private String villeUtilisateur;
	private String adresseUtilisateur;
	private String nomCabinet;
	private Double telUtilisateur;
	private boolean admin;
	private boolean enabled = true;
	@Temporal(TemporalType.DATE)
	private Date dateAjout;
	@Lob
	private byte[] image;
	@OneToMany (mappedBy="utilisateur", fetch=FetchType.EAGER)
	private Tache taches;
	@OneToMany (mappedBy="utilisateur", fetch=FetchType.EAGER)
	private Tiers tierss;
	@ManyToMany
	@JoinTable(name="profil", joinColumns= {@JoinColumn(name="id_utilisateur", 
			referencedColumnName="idUtilisateur")},
			inverseJoinColumns= {@JoinColumn(name="id_role", table="role", 
			referencedColumnName="idRole")}			
			)
	private Set<Role> roles = new HashSet<>();
	
	public Utilisateur() {
	}

	public Utilisateur(String nomUtilisateur, String prenomUtilisateur, String username, String password) {
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.username = username;
		this.password = password;
	}
	
	public Double getTelUtilisateur() {
		return telUtilisateur;
	}

	public void setTelUtilisateur(Double telUtilisateur) {
		this.telUtilisateur = telUtilisateur;
	}

	public Tiers getTierss() {
		return tierss;
	}

	public void setTierss(Tiers tierss) {
		this.tierss = tierss;
	}

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getNomCabinet() {
		return nomCabinet;
	}

	public void setNomCabinet(String nomCabinet) {
		this.nomCabinet = nomCabinet;
	}

	public Date getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getVilleUtilisateur() {
		return villeUtilisateur;
	}

	public void setVilleUtilisateur(String villeUtilisateur) {
		this.villeUtilisateur = villeUtilisateur;
	}

	public String getAdresseUtilisateur() {
		return adresseUtilisateur;
	}

	public void setAdresseUtilisateur(String adresseUtilisateur) {
		this.adresseUtilisateur = adresseUtilisateur;
	}

	public Tache getTaches() {
		return taches;
	}

	public void setTaches(Tache taches) {
		this.taches = taches;
	}

	@Override
	public String toString() {
		return "Utilisateur [nomUtilisateur=" + nomUtilisateur + ", prenomUtilisateur=" + prenomUtilisateur
				+ ", username=" + username + ", password=" + password + ", nomCabinet=" + nomCabinet + ", enabled="
				+ enabled + ", dateAjout=" + dateAjout + ", image=" + Arrays.toString(image) + "]";
	}

	

}
