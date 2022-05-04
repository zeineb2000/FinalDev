package tn.spring.projet.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tn.spring.projet.Entity.Agent;
import tn.spring.projet.Entity.Visite;
import tn.spring.projet.* ;
import tn.spring.projet.Repository.AgentRepository;
import tn.spring.projet.Repository.VisiteRepository;


@Component
@Service

public class AgentService implements IAgent {






    @Autowired(required = false)
        private AgentRepository AgentRepository;

    @Autowired(required = false)
        private VisiteRepository visiteRepository;


    @Override
        public Agent createAgent(Agent agent, Long idViste) {
            Visite Visite=visiteRepository.findById(idViste).orElse(null);
            //p.getComments().add(e);

            agent.setVisite(Visite);
         AgentRepository.save(agent);
            return null;


        }

        public String deleteAgent(Long id_post){
            Agent Agent = AgentRepository.findById(id_post).orElseThrow(() -> new RuntimeException("post not found"));
            AgentRepository.deleteById(Agent.getIdAgent());
            return null;
        }

        public Agent updateAgent(Agent Agent){
            return AgentRepository.save(Agent);

        }



}
