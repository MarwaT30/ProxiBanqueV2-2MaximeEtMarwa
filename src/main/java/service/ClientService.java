package service;

import java.util.List;

import model.Client;
import model.Compte;

/**
 * Interface ClientService incluant les signatures de méthode assurant le lien
 * avec la base de données pour la création des clients (ajout, supression,
 * modification...)
 * 
 * @author Marwa et Maxime
 * 
 */
public interface ClientService {

	/**
	 * Lien avec la base de données
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
	 * Méthode: Associer un compte epargne à un client.
	 * 
	 */
	public void ajouterCompte(Compte compte, Client client);

}
