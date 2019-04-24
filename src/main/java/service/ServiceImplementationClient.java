package service;

import java.util.List;

import model.Client;
import model.Compte;
import persistance.ClientDAO;
import persistance.MemoryClientDAO;

/**
 * Classe ServiceImplementationClient qui implemente la classe ClientService
 * assurant la relation entre la base de données et la présentation
 * 
 * @author Marwa et Maxime
 * 
 */
public class ServiceImplementationClient implements ClientService {

	// Attributs

	private ClientDAO daoClient = new MemoryClientDAO();

	// Méthodes relatives au Client

	public void ajouterClient(Client client) {
		if (client != null) {
			daoClient.enregistrerClient(client);
		}

	}

	public Client trouverClientParID(Long idClient) {
		return daoClient.identifierClientParID(idClient);
	}

	@Override
	public void modifierNom(Long idClient, String nom) {
		Client client = trouverClientParID(idClient);
		daoClient.modifiernomClient(client, nom);

	}

	@Override
	public void modifierPrenom(Long idClient, String prenom) {
		Client client = trouverClientParID(idClient);
		daoClient.modifierprenomClient(client, prenom);

	}

	@Override
	public void modifierRue(Long idClient, String rue) {
		Client client = trouverClientParID(idClient);
		daoClient.modifierrueClient(client, rue);

	}

	@Override
	public void modifieradresseMail(Long idClient, String mail) {
		Client client = trouverClientParID(idClient);

	}

	public void modifierrue(Long idClient, String rue) {
		Client client = trouverClientParID(idClient);
		daoClient.modifierrueClient(client, rue);

	}

	public void modifierCodePostalClient(Long idClient, String codePostalClient) {
		Client client = trouverClientParID(idClient);
		daoClient.modifierCodePostalClient(client, codePostalClient);
	}

	public void modifierVilleClient(Long idClient, String villeClient) {
		Client client = trouverClientParID(idClient);
		daoClient.modifierVilleClient(client, villeClient);
	}

	public void modifierTelClient(Long idClient, String telClient) {
		Client client = trouverClientParID(idClient);
		daoClient.modifierTelClient(client, telClient);
	}

	public List<Client> listerLesClients() {
		return daoClient.trouverTousLesClients();
	}

	public void supprimerClient(Client client) {
		daoClient.supprimerClient(client);
		;

	}

	public void ajouterCompte(Compte compte, Client client) {
		if (client.getCompte() != null) {
			client.getCompte().setNumeroCompte(numeroCom());
		}
	}

	/**
	 * Méthode générant un numéro de compte
	 * 
	 */
	private long numeroCom() {
		return (long) ((1 + Math.random()) * 10000000000L);
	}

	/**
	 * Méthode générant un numéro de carte
	 * 
	 */
	private long numeroCar() {
		return (long) ((1 + Math.random()) * 1000000000000000L);
	}

}
