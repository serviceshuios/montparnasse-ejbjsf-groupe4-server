package com.infotel.metier;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Lotissement implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLot;
	private int numLot;
	private String adresseLot;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	private double prix;
	
	
	
	@ManyToOne
	private Personne personne;
	
	
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	public Long getIdLot() {
		return idLot;
	}
	public void setIdLot(Long idLot) {
		this.idLot = idLot;
	}
	public int getNumLot() {
		return numLot;
	}
	public void setNumLot(int numLot) {
		this.numLot = numLot;
	}
	public String getAdresseLot() {
		return adresseLot;
	}
	public void setAdresseLot(String adresseLot) {
		this.adresseLot = adresseLot;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Lotissement [idLot=" + idLot + ", numLot=" + numLot + ", adresseLot=" + adresseLot + ", dateCreation="
				+ dateCreation + ", prix=" + prix + "]";
	}

}
