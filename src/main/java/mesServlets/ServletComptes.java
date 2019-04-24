package mesServlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Client;
import model.Compte;

/**
 * Servlet implementation class ServletComptes: c'est la servlet qui va nous
 * permettre dans un second temps d'enregistrer les comptes bancaires associés
 * aux clients pour pouvoir effectuer les virements de compte à compte
 * (actuellement inactive).
 * 
 * @author Marwa et Maxime
 * 
 */
@WebServlet("/ServletComptes")
public class ServletComptes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<Client> listeClients = new ArrayList<Client>();
	private List<Compte> listeComptes = new ArrayList<Compte>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletComptes() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Liste des comptes à associer

		Compte compte1 = new Compte(0L, 0, 100000, null, "Courant");
		Compte compte2 = new Compte(1L, 1, 200000, null, "Courant");
		Compte compte3 = new Compte(2L, 2, 300000, null, "Courant");
		Compte compte4 = new Compte(3L, 3, 400000, null, "Courant");
		Compte compte5 = new Compte(4L, 4, 500000, null, "Courant");
		Compte compte6 = new Compte(5L, 5, 600000, null, "Courant");

		Client c1 = new Client(0L, "Henry", "Thierry", "rue France", "06400", "Cannes", "0662966256",
				"ThierryHenry@gmail.com", compte1);
		Client c2 = new Client(1L, "Deschamps", "Didier", "rue Espagne", "92290", "Chatenay Malabry", "0647866352",
				"DesChampsDidier@gmail.com", compte2);
		Client c3 = new Client(2L, "David", "Trezeguet", "rue Italie", "13000", "Marseille", "0662486352",
				"DavidTrezeguet@gmail.com", compte3);
		Client c4 = new Client(3L, "Dujardin", "Jean", "rue Grece", "69000", "Lyon", "0662321352",
				"DujardinJean@gmail.com", compte4);
		Client c5 = new Client(4L, "Adjani", "Isabelle", "rue Maroc", "06000", "Nice", "0662966123",
				"AdjaniIsabelle@gmail.com", compte5);
		Client c6 = new Client(5L, "Marceau", "Sophie", "rue Tunisie", "94130", "Nogent Sur Marne", "0665616352",
				"MarceauSophie@gmail.com", compte6);

		if (listeClients.size() == 0) {
			listeClients.add(c1);
		}
		if (listeClients.size() == 1) {
			listeClients.add(c2);
		}
		if (listeClients.size() == 2) {
			listeClients.add(c3);
		}
		if (listeClients.size() == 3) {
			listeClients.add(c4);
		}
		if (listeClients.size() == 4) {
			listeClients.add(c5);
		}
		if (listeClients.size() == 5) {
			listeClients.add(c6);
		}

		// Faire une liste de comptes

		if (listeComptes.size() == 0) {
			listeComptes.add(compte1);
		}
		if (listeComptes.size() == 1) {
			listeComptes.add(compte2);
		}
		if (listeComptes.size() == 2) {
			listeComptes.add(compte3);
		}
		if (listeComptes.size() == 3) {
			listeComptes.add(compte4);
		}
		if (listeComptes.size() == 4) {
			listeComptes.add(compte5);
		}
		if (listeComptes.size() == 5) {
			listeComptes.add(compte6);
		}

		RequestDispatcher dispatcher;
		// request.setAttribute("clients", listeClients);
		request.setAttribute("comptes", listeComptes);
		dispatcher = request.getRequestDispatcher("ListeComptes.jsp");
		dispatcher.forward(request, response);

		System.out.println(listeComptes);

		// doGet(request, response);
	}

}
