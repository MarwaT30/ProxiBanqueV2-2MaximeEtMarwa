package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Classe Client caractérisant tous les clients de l'agence
 * 
 * @author Marwa et Maxime
 *
 */
@Entity
public class Client {

	// Attributs de la classe Client
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idClient;
	private String nom;
	private String prenom;
	private String rue;
	private String codePostal;
	private String ville;
	private String numeroTel;
	private String mail;
	@OneToOne
	@JoinColumn(name = "Compte_id", unique = true)
	private Compte compte;

	@ManyToOne
	@JoinColumn(name = "Conseiller_Id", unique = true)
	private Conseiller conseiller;

	// Constructeurs de la classe Client

	public Client() {
		super();
	}

	public Client(Long idClient, String nom, String prenom, String rue, String codePostal, String ville,
			String numeroTel, String mail, Compte compte) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.numeroTel = numeroTel;
		this.mail = mail;
		this.compte = compte;
	}

	public Client(Long idClient, String nom, String prenom, String rue, String codePostal, String ville,
			String numeroTel, String mail, Conseiller conseiller) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.numeroTel = numeroTel;
		this.mail = mail;
		this.conseiller = conseiller;
	}

	// Getteurs et Setteurs de la classe Client

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", rue=" + rue + ", codePostal="
				+ codePostal + ", ville=" + ville + ", numeroTel=" + numeroTel + ", mail=" + mail + "]";
	}



}
