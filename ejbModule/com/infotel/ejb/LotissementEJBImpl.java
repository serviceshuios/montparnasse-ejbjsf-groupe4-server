package com.infotel.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.infotel.dao.IdaoLocal;
import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;
@Stateless
public class LotissementEJBImpl implements ILotissementLocal, ILotissementRemote {
	 @EJB
	 private IdaoLocal dao;


	@Override
	public void ajouterLotissement(Lotissement l) {
		dao.ajouterLotissement(l);
		
	}

	@Override
	public Lotissement getLotissement(long idLot) {
		
		return dao.getLotissement(idLot);
	}

	@Override
	public Lotissement affichageLotissement(long idLot) {
		
		return dao.affichageLotissement(idLot);
	}

	@Override
	public void supprimerLotissement(Lotissement l) {
	dao.supprimerLotissement(l);
		
	}

	

	@Override
	public List<Lotissement> findAllLotissements() {
	
		return dao.findAllLotissements();
	}

	@Override
	public void modifierLotissement(Lotissement l) {
		
		dao.modifierLotissement(l);
	}

	@Override
	public void acheterLotissement(Personne p,Lotissement l) {
		dao.acheterLotissement(p, l);
		
	}


		
	}


