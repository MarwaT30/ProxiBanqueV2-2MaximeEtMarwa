package mesServlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Client;
import service.ServiceImplementationClient;

/**
 * Servlet implementation class CreerClient: C'est la servlet qui nous permet
 * d'enregistrer le client et ses attributs associés dans la base de donnée via
 * la couche service et ceci à partir des informations que l'utilisateur a
 * fourni sur le site de l'application. Un seul client est enregistré
 * actuellement.
 * 
 * @author Marwa et Maxime
 * 
 */
@WebServlet("/CreerClient")
public class CreerClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServiceImplementationClient service = new ServiceImplementationClient();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreerClient() {
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

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String rue = request.getParameter("rue");
		String codepostal = request.getParameter("codepostal");
		String ville = request.getParameter("ville");
		String mail = request.getParameter("mail");
		String numerodetel = request.getParameter("numerodetel");

		Client c1 = new Client();
//		request.setAttribute(nom, c1);
//		request.setAttribute(prenom, c1);
//		request.setAttribute(rue, c1);
//		request.setAttribute(codepostal, c1);
//		request.setAttribute(ville, c1);
//		request.setAttribute(mail, c1);
//		request.setAttribute(numerodetel, c1);

		c1.setNom(nom);
		c1.setPrenom(prenom);
		c1.setRue(rue);
		c1.setCodePostal(codepostal);
		c1.setVille(ville);
		c1.setMail(mail);
		c1.setNumeroTel(numerodetel);

		service.ajouterClient(c1);
		System.err.println("essai Client" + c1);

		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("clientcree.html");
		// dispatcher = request.getRequestDispatcher("Erreur.html");
		dispatcher.forward(request, response);
	}

}
