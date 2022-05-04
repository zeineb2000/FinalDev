package tn.spring.projet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.projet.Entity.Reglement;
@Repository
public interface ReglementRepository extends JpaRepository <Reglement , Long > {



}
