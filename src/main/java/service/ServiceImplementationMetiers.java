package service;

import model.Client;
import model.Compte;

/**
 * Classe ServiceImplementationMetiers qui implemente la classe MetiersService
 * et qui renferme les methodes utilisées pour assurer les différents services
 * proposés par la banque.
 * 
 * @author Marwa et Maxime
 * 
 */
public class ServiceImplementationMetiers implements MetiersSevice {

	@Override
	public void virementCourantAEpargne(Client c, double montantVirement) {
		// TODO Auto-generated method stub

	}

	@Override
	public void virementEpargneACourant(Client c, double montantVirement) {
		// TODO Auto-generated method stub

	}

	@Override
	public void virementClientAClient(Client c1, Client c2, double montantVirement) {
		// TODO Auto-generated method stub

	}

	@Override
	public void passerVirement(double montant, Compte emetteur, Compte recepteur) {

		double nouveauMontantEmetteur = emetteur.getSoldeCompte() - montant;
		emetteur.setSoldeCompte(nouveauMontantEmetteur);

		double nouveauMontantRecepteur = recepteur.getSoldeCompte() + montant;
		recepteur.setSoldeCompte(nouveauMontantRecepteur);

	}

	@Override
	public boolean patrimony(Client client) {

		double a = 0;
		double b = 0;

		a = client.getCompte().getSoldeCompte();

		double total = a + b;

		if (total > 500000.0) {
			return true;
		} else {
			return false;
		}

	}

}
