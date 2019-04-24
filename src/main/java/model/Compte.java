package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Classe Compte désignant les comptes bancaires des clients de l'agence
 * 
 * @author Marwa et Maxime
 *
 */
@Entity
public class Compte {

	// Attributs de la classe Compte
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCompte;
	private long numeroCompte;
	private double soldeCompte;
	@OneToOne(mappedBy = "compte")
	private Client clientAssocie;
	private String typeCompte;

	// Constructeur de la classe Compte

	public Compte() {
		super();
	}

	public Compte(Long idCompte, long numeroCompte, double soldeCompte, Client clientAssocie, String typeCompte) {
		super();
		this.idCompte = idCompte;
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
		this.clientAssocie = clientAssocie;
		this.typeCompte = typeCompte;
	}

	// Getteurs et Setteurs de la classe Compte

	public Long getId() {
		return idCompte;
	}

	public void setId(Long id) {
		this.idCompte = idCompte;
	}

	public long getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public Client getClientAssocie() {
		return clientAssocie;
	}

	public void setClientAssocie(Client clientAssocie) {
		this.clientAssocie = clientAssocie;
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	@Override
	public String toString() {
		return "Compte [id=" + idCompte + ", numeroCompte=" + numeroCompte + ", soldeCompte=" + soldeCompte
				+ ", clientAssocie=" + clientAssocie + ", typeCompte=" + typeCompte + "]";
	}

}
