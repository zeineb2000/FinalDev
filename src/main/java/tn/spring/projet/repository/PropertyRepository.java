package tn.spring.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.projet.Entity.Proprety;


@Repository
public interface PropertyRepository extends JpaRepository<Proprety ,Long> {

}