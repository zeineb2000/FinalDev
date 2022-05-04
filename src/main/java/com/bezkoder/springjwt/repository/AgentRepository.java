package tn.spring.projet.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.projet.Entity.Agent;


@Repository
public interface AgentRepository extends JpaRepository <Agent, Long > {
}
