package tn.spring.projet.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@ToString 
@NoArgsConstructor
public class Commentaire  implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Long idUser;
	String paragraphe ;
	@ManyToOne(cascade = CascadeType.ALL)
	private Annonce annonces;
	
}
