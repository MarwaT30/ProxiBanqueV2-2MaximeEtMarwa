package persistance;

import java.util.List;

import model.Client;

/**
 * Interface de la DAO permettant, une fois impl�ment�e par MemoryClientDAO, de
 * g�rer les dossiers clients (Operations CRUD pour Create, Read, Update and
 * Delete): Cr�er un client dans une Map, Retrouver un client dans la base de
 * donn�es � partir de sa cl� id, R�cup�rer tous les objets clients cr��s dans
 * une liste, Supprimer un client de la base de donn�e
 * 
 * @author Marwa et Maxime
 */
public interface ClientDAO {

	/**
	 * M�thode: Enregistrer un client c dans la base de donn�es clients.
	 * 
	 */
	public void enregistrerClient(Client client);

	/**
	 * M�thode: Identifier un client dans la base de donn�es clients � partir de son
	 * id.
	 * 
	 */
	public Client identifierClientParID(Long idClient);

	/**
	 * M�thode: Obtenir la liste de tous les clients de la base de donn�es clients.
	 * 
	 */
	public List<Client> trouverTousLesClients();

	/**
	 * M�thode: Supprimer un client de la base de donn�es client
	 * 
	 */
	public void supprimerClient(Client client);

	/**
	 * M�thodes: Apporter des modifications d'un client dans la base de donn�es
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
