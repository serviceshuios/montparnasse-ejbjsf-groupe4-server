package com.infotel.dao;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;

@Singleton
public class DaoImpl implements IdaoLocal{
	
	

	@PersistenceContext(unitName="BP_UNIT")
	private EntityManager em;
	
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	

	@Override
	public void ajouterPersonne(Personne p) {
		em.persist(p);
		
	}

	@Override
	public Personne getPersonne(long idPersonne) {
		
		return em.getReference(Personne.class,idPersonne);
	}

	@Override
	public Personne affichagePersonne(long idPersonne) {
		
		return em.find(Personne.class, idPersonne);
	}

	@Override
	public void supprimerPersonne(Personne p) {
		em.remove(p);
		
	}


	@Override
	public List<Personne> findAllPersonnes() {
	
		return em.createQuery("select p from Personne p").getResultList();
	}
	
	@Override
	public void modifierPersonne(Personne p) {
	
		em.merge(p);
	}
	

	@Override
	public void ajouterLotissement(Lotissement l) {
		em.persist(l);
		
	}

	@Override
	public Lotissement getLotissement(long idLot) {
	
		return  em.getReference(Lotissement.class,idLot);
	}

	@Override
	public Lotissement affichageLotissement(long idLot) {
		return em.find(Lotissement.class, idLot);
	}

	@Override
	public void supprimerLotissement(Lotissement l) {
		em.remove(l);
		
	}


	@Override
	public List<Lotissement> findAllLotissements() {
		return em.createQuery("select l from Lotissement l").getResultList();
	}

	

	@Override
	public void modifierLotissement(Lotissement l) {
		
		em.merge(l);
	}

	@Override
	public void acheterLotissement(Personne p, Lotissement l) {
		em.createQuery("Update Lotissement Set Personne_idPersonne=Personne.idPersonne where idLot=?");
		
	}

	@Override
	public void SeMarier(Personne p1, Personne p2) {
	em.createQuery("Update Personne set Personne_idPersonne=Personne.idPersonne where p.idPersonne=?p1");
    em.createQuery("Update Personne set Personne_idPersonne=Personne.idPersonne where p.idPersonne=?p2");
		
	}



	



}
