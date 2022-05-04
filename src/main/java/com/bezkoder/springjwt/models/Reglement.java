package tn.spring.projet.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Reglement implements Serializable {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    Long idReglemet;
    String frais ;
    String LastName;


    @OneToOne(mappedBy = "reglement")
    private Visite visite;
}
