package tn.spring.projet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.spring.projet.Entity.Visite;


@Repository
public interface VisiteRepository extends JpaRepository <Visite ,Long> { 

}
