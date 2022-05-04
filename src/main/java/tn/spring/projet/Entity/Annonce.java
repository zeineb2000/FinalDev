package tn.spring.projet.Entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@ToString 
@NoArgsConstructor
public class Annonce implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Long idUser;
	Long idannonce;
	String pays;
	String adresse;
	String Proxemite;
	String quartier;
	String transport;
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	@OneToMany(mappedBy="annonces", cascade = CascadeType.ALL)
	private Set<Commentaire>Commentaires ;
}
