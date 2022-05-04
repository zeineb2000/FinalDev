package tn.spring.projet.interfaces;

import java.util.List;


import tn.spring.projet.Entity.Proprety;
import tn.spring.projet.Entity.Visite;

public interface PropertyInterface {
	
	//Proprety addProprety (Proprety p);
	List<Proprety> retrieveAllProprety();
	Proprety updateProprety (Proprety p);
	Proprety retrieveProprety (Long idProprety);
	void removeProprety (Long idProprety);
	void addAndassignVisitetoProperty(Proprety p ,Long idProprety, Long idVisite);
	Proprety addProprety(Proprety propretys);

}
