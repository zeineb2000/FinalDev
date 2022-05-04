package tn.spring.projet.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tn.spring.projet.Entity.Agent;
import tn.spring.projet.Entity.Reglement;
import tn.spring.projet.Entity.*;
import tn.spring.projet.Repository.ReglementRepository;

import tn.spring.projet.Repository.AgentRepository;
import tn.spring.projet.Repository.*;


@Component
@Service
public class  ReglementService   implements IReglement {




    @Autowired
    private ReglementRepository ReglementRepository;

    @Autowired
    private VisiteRepository visiteRepository;



    public Reglement createReglement(Reglement reglement, Long idViste) {
        Visite Visite=visiteRepository.findById(idViste).orElse(null);
        //p.getComments().add(e);

        reglement.setVisite(Visite);
        ReglementRepository.save(reglement);
        return null;


    }

    public String deleteReglement(Long id_post){
        Reglement reglement = ReglementRepository.findById(id_post).orElseThrow(() -> new RuntimeException("post not found"));
        ReglementRepository.deleteById(reglement.getIdReglemet());
        return null;
    }

    public Reglement updateReglement(Reglement reglement){
        return ReglementRepository.save(reglement);

    }

}
