package persistance;

import java.util.List;

import model.Client;

/**
 * Interface de la DAO permettant, une fois implémentée par MemoryClientDAO, de
 * gérer les dossiers clients (Operations CRUD pour Create, Read, Update and
 * Delete): Créer un client dans une Map, Retrouver un client dans la base de
 * données à partir de sa clé id, Récupérer tous les objets clients créés dans
 * une liste, Supprimer un client de la base de donnée
 * 
 * @author Marwa et Maxime
 */
public interface ClientDAO {

	/**
	 * Méthode: Enregistrer un client c dans la base de données clients.
	 * 
	 */
	public void enregistrerClient(Client client);

	/**
	 * Méthode: Identifier un client dans la base de données clients à partir de son
	 * id.
	 * 
	 */
	public Client identifierClientParID(Long idClient);

	/**
	 * Méthode: Obtenir la liste de tous les clients de la base de données clients.
	 * 
	 */
	public List<Client> trouverTousLesClients();

	/**
	 * Méthode: Supprimer un client de la base de données client
	 * 
	 */
	public void supprimerClient(Client client);

	/**
	 * Méthodes: Apporter des modifications d'un client dans la base de données
	 *
	 * 
	 */

	public void modifierrueClient(Client client, String rue);

	public void modifiernomClient(Client client, String telClient);

	public void modifierprenomClient(Client client, String telClient);

	public void modifiermailClient(Client client, String telClient);

	public void modifierCodePostalClient(Client client, String codePostalClient);

	public void modifierVilleClient(Client client, String villeClient);

	public void modifierTelClient(Client client, String telClient);

}
