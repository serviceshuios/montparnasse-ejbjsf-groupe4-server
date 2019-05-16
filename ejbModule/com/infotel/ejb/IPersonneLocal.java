package com.infotel.ejb;

import java.util.List;

import javax.ejb.Local;

import com.infotel.metier.Personne;

@Local
public interface IPersonneLocal {
	public void ajouterPersonne(Personne p);
	public Personne getPersonne (long idPersonne);
	public Personne affichagePersonne(long idPersonne);
	public void supprimerPersonne (Personne p);
	public void modifierPersonne (Personne p);
	public List<Personne> findAllPersonnes();
	
	
	public void SeMarier(Personne p1,Personne p2);
}
