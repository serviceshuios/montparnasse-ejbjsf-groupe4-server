package com.infotel.dao;

import java.util.List;

import javax.ejb.Local;

import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;
@Local
public interface IdaoLocal {
	public void ajouterPersonne(Personne p);
	public Personne getPersonne (long idPersonne);
	public Personne affichagePersonne(long idPersonne);
	public void supprimerPersonne (Personne p);
	public void modifierPersonne (Personne p);
	public List<Personne> findAllPersonnes();
	
	
	public void ajouterLotissement(Lotissement l);
	public Lotissement getLotissement (long idLot);
	public Lotissement affichageLotissement(long idLot);
	public void supprimerLotissement (Lotissement l);
	public int modifierLotissement (Lotissement l);
	public List<Lotissement> findAllLotissements();
}
