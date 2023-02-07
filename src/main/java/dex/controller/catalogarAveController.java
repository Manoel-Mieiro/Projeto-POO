package dex.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dex.model.Ave;
import dex.model.Aluno;

/**
 * Servlet implementation class catalogarAveController
 */
@WebServlet("/catalogarAveController")
public class catalogarAveController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public catalogarAveController() {
		super();
	}
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UFT-8");
		
	

		String especie = request.getParameter("especie");
		String familia = request.getParameter("familia");
		String subfamilia = request.getParameter("subfamilia");
		String nomeIngles = request.getParameter("nomeIngles");
		String estado = request.getParameter("estado");
		
		
		System.out.println("[AVE]: " + especie);
		System.out.println("[AVE]: " + familia);
		System.out.println("[AVE]: " + subfamilia);
		System.out.println("[AVE]: " + nomeIngles);
		System.out.println("[AVE]: " + estado);
		


		String onsucess;

		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastrarAve.jsp");

		if (especie != null && !especie.isEmpty() &&familia != null && !familia.isEmpty() && subfamilia != null && !subfamilia.isEmpty() && nomeIngles != null
				&& !nomeIngles.isEmpty() && estado != null && !estado.isEmpty()) {
			boolean salvar = false;
			if (request.getParameter("salvar") != null && request.getParameter("salvar").equals("Catalogar"))
				salvar = true;
			Ave ave = new Ave(especie, familia, subfamilia, nomeIngles, estado);
			ave.salvar();
			onsucess = "Catálogo realizado com sucesso!";
		} else
			onsucess = "Os campos devem ser preenchidos!";
		request.setAttribute("onsucess", onsucess);
		dispatcher.forward(request, response);

	}
}