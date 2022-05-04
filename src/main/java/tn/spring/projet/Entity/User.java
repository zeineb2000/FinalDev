package tn.spring.projet.Entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Long idUser;
	String Email;
	String UserName;
	String Password;
	String Role;
	boolean OffreAide ;
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	private Set<Proprety>propreties ;	
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	private Set<PropretyLux>propretielux ;
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	private Set<Report>Reports ;
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	private Set<Recrutement>Recrutements ;
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	private Set<Annonce>annonces ;
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	private Set<SousTraitance> traitances;
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	private Set<Aide> aides;
}
