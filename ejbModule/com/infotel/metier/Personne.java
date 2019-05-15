package com.infotel.metier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Personne implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPersonne;
	private String nom;
	private String prenom;
	private int age;
	@OneToMany(mappedBy="personne")
	private List<Lotissement>lotissements =new ArrayList<Lotissement>();
	@OneToOne (mappedBy="personne")
	private Personne personne;
	
	public List<Lotissement> getLotissements() {
		return lotissements;
	}
	public void setLotissements(List<Lotissement> lotissements) {
		this.lotissements = lotissements;
	}
	public Long getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(Long idPersonne) {
		this.idPersonne = idPersonne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Personne [idPersonne=" + idPersonne + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	

}
