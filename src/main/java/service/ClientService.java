package service;

import java.util.List;

import model.Client;
import model.Compte;

/**
 * Interface ClientService incluant les signatures de m�thode assurant le lien
 * avec la base de donn�es pour la cr�ation des clients (ajout, supression,
 * modification...)
 * 
 * @author Marwa et Maxime
 * 
 */
public interface ClientService {

	/**
	 * Lien avec la base de donn�es
	 * 
	 */

	public void ajouterClient(Client client);

	public Client trouverClientParID(Long idClient);

	public void modifierNom(Long idClient, String nom);

	public void modifierPrenom(Long idClient, String prenom);

	public void modifierRue(Long idClient, String rue);

	public void modifierCodePostalClient(Long idClient, String codePostalClient);

	public void modifierVilleClient(Long idClient, String villeClient);

	public void modifierTelClient(Long idClient, String telClient);

	public void modifieradresseMail(Long idClient, String mail);

	public List<Client> listerLesClients();

	public void supprimerClient(Client client);

	/**
	 * M�thode: Associer un compte epargne � un client.
	 * 
	 */
	public void ajouterCompte(Compte compte, Client client);

}
