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
public class PropretyLux implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Long idProprety;
	float Surface ;
	String Type;
	String Adresse;
	String Region;
	String Image;
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	@OneToMany(mappedBy="propretyLux", cascade = CascadeType.ALL)
	private Set<Contact>contacts ;	
}
