package mesServlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Client;

/**
 * Servlet implementation class ServletComptes: c'est la servlet qui va nous
 * permettre dans un second temps de modifier les données des clients
 * enregistrées dans la base de données (actuellement inactive).
 * 
 * @author Marwa et Maxime
 * 
 */
@WebServlet("/ServletEdition")
public class ServletEdition extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletEdition() {
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

		// Modification des informations relatives au client

		Client clientmodif = new Client();
		if (request.getParameter("idClient") != null) {
			Long num = Long.parseLong(request.getParameter("idClient"));
			clientmodif.setIdClient(num);
		}

		if (request.getParameter("nom") != null) {
			clientmodif.setNom(request.getParameter("nom"));
		}
		if (request.getParameter("prenom") != null) {
			clientmodif.setPrenom(request.getParameter("prenom"));
		}
		if (request.getParameter("rue") != null) {
			clientmodif.setRue(request.getParameter("rue"));
		}
		if (request.getParameter("codePostal") != null) {
			clientmodif.setCodePostal(request.getParameter("codePostal"));
		}
		if (request.getParameter("ville") != null) {
			clientmodif.setVille(request.getParameter("ville"));
		}
		if (request.getParameter("numeroTel") != null) {
			clientmodif.setNumeroTel(request.getParameter("numeroTel"));
		}
		if (request.getParameter("mail") != null) {
			clientmodif.setMail(request.getParameter("mail"));
		}

		System.out.println(clientmodif);

		// TODO Auto-generated method stub

		request.setAttribute("client", clientmodif);

		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("/WEB-INF/ClientModifie.jsp");
		dispatcher.forward(request, response);
		// doGet(request, response);
	}

}
