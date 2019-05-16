package com.infotel.ejb;

import java.util.List;

import javax.ejb.Remote;

import org.jboss.logging.Param;

import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;
@Remote
public interface ILotissementRemote {
	public void ajouterLotissement(Lotissement l);
	public Lotissement getLotissement (long idLot);
	public Lotissement affichageLotissement(long idLot);
	public void supprimerLotissement (Lotissement l);
	public void modifierLotissement (Lotissement l);
	public List<Lotissement> findAllLotissements();
	
   public void acheterLotissement(Personne p,Lotissement l);
	
	//public int acheterLotissementPersonne(@Param("x") Long idPersonne, @Param("y") Long idLot);
}
