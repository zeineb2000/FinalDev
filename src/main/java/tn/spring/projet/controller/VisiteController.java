package tn.spring.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.spring.projet.services.VisiteService;
import tn.spring.projet.Entity.Proprety;
import tn.spring.projet.Entity.Visite;

@RestController
@RequestMapping("/Visite")
@CrossOrigin("*")
public class VisiteController {@Autowired 
	VisiteService vService ;  

@GetMapping("/retrieve-visite")  
@ResponseBody
public List<Visite> getProprety() {
List<Visite> listVisite = vService.retrieveAllVisite();
return listVisite;
}

@PostMapping("/Add-Visite")
@ResponseBody
public void addVisite(@RequestBody  Visite v)
{
	vService.addVisite(v);
	}

		@PutMapping("/update-Visite")
		@ResponseBody
		public Visite updateVisite(@RequestBody Visite v)
		{
			return vService.updateVisite(v);
			 
		}
		
		@GetMapping("/retrieve-Visite/{idViste}")  
		@ResponseBody
		public Visite getVisite(@PathVariable("idViste") Long idViste ) {
		return vService.retrieveVisite(idViste);
		
		}
		
		@DeleteMapping("/removeVisite/{idViste}")
		@ResponseBody
		public void removeVisite(@PathVariable("idViste") Long idViste)
		{
			vService.removeVisite(idViste);
		}
		


}
