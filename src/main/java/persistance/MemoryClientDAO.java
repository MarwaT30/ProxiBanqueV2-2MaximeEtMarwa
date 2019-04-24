package persistance;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Client;

/**
 * Classe ClientMemoireDAO qui implémente l'interface ClientDAO. Cette classe
 * est enffet celle qui va permettre de sauvegarder les clients dans la base de
 * données php via une transaction. Elle permet de sauvegarder, modifier, lire,
 * supprimer les informations des clients dans la base de données clients.
 * 
 * @author Marwa & Maxime
 *
 */
public class MemoryClientDAO implements ClientDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

	// Attributs

	// Méthodes : Création, récupération et suppression d'un client

	public void enregistrerClient(Client client) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
			em.persist(client);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
	}

	public Client identifierClientParID(Long idClient) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
			em.find(Client.class, idClient);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
		return null;
	}

	public List<Client> trouverTousLesClients() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		return null;
	}

	public void supprimerClient(Client client) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
			em.remove(client);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
	}

	// Méthodes : modification des informations d'un client

	@Override
	public void modifiernomClient(Client client, String nom) {
		client.setNom(nom);
	}

	@Override
	public void modifierprenomClient(Client client, String prenom) {
		client.setPrenom(prenom);
	}

	@Override
	public void modifiermailClient(Client client, String mail) {
		client.setMail(mail);
	}

	public void modifierrueClient(Client client, String rue) {
		client.setRue(rue);
	}

	public void modifierCodePostalClient(Client client, String codePostalClient) {
		client.setCodePostal(codePostalClient);

	}

	public void modifierVilleClient(Client client, String villeClient) {
		client.setVille(villeClient);

	}

	public void modifierTelClient(Client client, String telClient) {
		client.setNumeroTel(telClient);

	}

}
