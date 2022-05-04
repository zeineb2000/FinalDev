package tn.spring.projet.Entity;


import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;
//import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Agent implements Serializable {
    public Long getIdAgent() {
        return idAgent;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }

    public Visite getVisite() {
        return visite;
    }

    public void setIdAgent(Long idAgent) {
        this.idAgent = idAgent;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setVisite(Visite visite) {
        this.visite = visite;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    Long idAgent;
    String Name;
    String LastName;

    @OneToOne(mappedBy = "agent")
    private Visite visite;
}
