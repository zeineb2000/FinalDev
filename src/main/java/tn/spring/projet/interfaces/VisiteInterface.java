package tn.spring.projet.interfaces;

import java.util.List;

import tn.spring.projet.Entity.Proprety;
import tn.spring.projet.Entity.Visite;



public interface VisiteInterface {
	List<Visite> retrieveAllVisite();
	Visite addVisite (Visite v);
	Visite updateVisite (Visite v);
	Visite retrieveVisite (Long id);
	void removeVisite (Long id);
	
	

}
	




