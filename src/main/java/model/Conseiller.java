package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Classe Conseiller spécifique aux employés de la banque
 * 
 * @author Marwa et Maxime
 *
 */
@Entity
public class Conseiller {

	// Attributs de la classe Employee
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idEmployee;
	private String nom;
	private String prenom;
	@OneToMany(mappedBy = "conseiller")
	private Set<Client> listeClient = new HashSet<Client>();


	// Constructeur de la classe Employee

	public Conseiller() {
		super();
	}

	public Conseiller(Long idEmployee, String nom, String prenom, Set<Client> listeClient) {
		super();
		this.idEmployee = idEmployee;
		this.nom = nom;
		this.prenom = prenom;
		this.listeClient = listeClient;
	}

	// Getteurs et Setteurs de la classe Employee

	public Long getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(Long idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Set<Client> getListeClient() {
		return listeClient;
	}

	public void setListeClient(Set<Client> listeClient) {
		this.listeClient = listeClient;
	}

	@Override
	public String toString() {
		return "Conseiller [idEmployee=" + idEmployee + ", nom=" + nom + ", prenom=" + prenom + ", listeClient="
				+ listeClient + "]";
	}

}
