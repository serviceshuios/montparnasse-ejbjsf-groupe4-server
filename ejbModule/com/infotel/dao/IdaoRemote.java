package com.infotel.dao;

import java.util.List;

import javax.ejb.Remote;

import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;
@Remote
public interface IdaoRemote {
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
	public void modifierLotissement (Lotissement l);
	public List<Lotissement> findAllLotissements();
	
	
	

	public void acheterLotissement(Personne p,Lotissement l);
	public void SeMarier(Personne p1,Personne p2);
}
