package com.infotel.ejb;

import java.util.List;

import javax.ejb.Remote;

import com.infotel.metier.Personne;
@Remote
public interface IPersonneRemote {
	public void ajouterPersonne(Personne p);
	public Personne getPersonne (long idPersonne);
	public Personne affichagePersonne(long idPersonne);
	public void supprimerPersonne (Personne p);
	public int modifierPersonne (Personne p);
	public List<Personne> findAllPersonnes();

}
