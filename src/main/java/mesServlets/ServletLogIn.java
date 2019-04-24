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
import model.Conseiller;

/**
 * Servlet implementation class ServletLogIn: c'est la servlet qui va permettre
 * au conseiller de se connecter. Actuellement, s'il renseigne les identifiants
 * et mot de passe indiqués, il pourra accéder à l'application, sinon, une page
 * d'erreur va s'afficher.
 * 
 * @author Marwa et Maxime
 * 
 */
@WebServlet("/ServletLogIn")
public class ServletLogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<Client> listeClients = new ArrayList<Client>();

	// Getters and Setters pour récupérer la liste clients

	public List<Client> getListeClients() {
		return listeClients;
	}

	public void setListeClients(List<Client> listeClients) {
		this.listeClients = listeClients;
	}

	// Constructeur

	/**
	 * Default constructor.
	 */
	public ServletLogIn() {
		// TODO Auto-generated constructor stub
	}

	public ServletLogIn(List<Client> listeClients) {
		super();
		this.listeClients = listeClients;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Conseiller cons = new Conseiller();
		cons.setNom("marwa");
		cons.setPrenom("pastis51");
		String login = request.getParameter("log");
		String pwd = request.getParameter("pwd");

		Client c1 = new Client(0L, "Henry", "Thierry", "rue France", "06400", "Cannes", "0662966256",
				"ThierryHenry@gmail.com", cons);
		Client c2 = new Client(1L, "Deschamps", "Didier", "rue Espagne", "92290", "Chatenay Malabry", "0647866352",
				"DeschampsDidier@gmail.com", cons);
		Client c3 = new Client(2L, "David", "Trezeguet", "rue Italie", "13000", "Marseille", "0662486352",
				"DavidTrezeguet@gmail.com", cons);
		Client c4 = new Client(3L, "Dujardin", "Jean", "rue Grece", "69000", "Lyon", "0662321352",
				"DujardinJean@gmail.com", cons);
		Client c5 = new Client(4L, "Adjani", "Isabelle", "rue Maroc", "06000", "Nice", "0662966123",
				"AdjaniIsabelle@gmail.com", cons);
		Client c6 = new Client(5L, "Marceau", "Sophie", "rue Tunisie", "94130", "Nogent Sur Marne", "0665616352",
				"MarceauSophie@gmail.com", cons);

		// Empêche la redondance lors du retour à la page d'accueil
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

		request.setAttribute("clients", listeClients);

		RequestDispatcher dispatcher;
		if (((cons.getNom()).equalsIgnoreCase(login)) && ((cons.getPrenom()).equalsIgnoreCase(pwd))) {
			dispatcher = request.getRequestDispatcher("/WEB-INF/ListeClients.jsp");

		} else {
			dispatcher = request.getRequestDispatcher("Erreur.html");
		}
		dispatcher.forward(request, response);

	}

}
