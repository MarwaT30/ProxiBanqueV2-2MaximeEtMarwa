package service;

import model.Client;
import model.Compte;

/**
 * Interface MetiersService incluant les r�gles m�tiers : Les virements de
 * compte � compte, L'audit de l'agence, La gestion du patrimoine, La simulation
 * de cr�dit
 * 
 * @author Marwa et Maxime
 * 
 */
public interface MetiersSevice {

	/**
	 * M�thode: Virement depuis le compte courant vers le compte �pargne.
	 * 
	 * 
	 */
	public void virementCourantAEpargne(Client c, double montantVirement);

	/**
	 * M�thode: Virement depuis le compte �pargne vers compte courant.
	 * 
	 * 
	 */
	public void virementEpargneACourant(Client c, double montantVirement);

	/**
	 * M�thode: Virement d'un compte courant vers un autre compte courant
	 * 
	 */
	public void virementClientAClient(Client c1, Client c2, double montantVirement);

	/**
	 * M�thode permettant de r�aliser l'audit d'une agence
	 * 
	 * 
	 */

	public void passerVirement(double montant, Compte emetteur, Compte recepteur);

	/**
	 * M�thode permettant de r�aliser de gerer le patrimoine des clients fortunes
	 * 
	 *
	 */
	public boolean patrimony(Client client);

}
