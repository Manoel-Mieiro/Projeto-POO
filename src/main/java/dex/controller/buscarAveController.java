package dex.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dex.model.Ave;

/**
 * Servlet implementation class buscarAveController
 */
@WebServlet("/buscarAveController")
public class buscarAveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buscarAveController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");
		String nomeIngles = request.getParameter("nomeIngles");
		ArrayList<Ave> aves = new Ave().buscarAvePorNomeIngles(nomeIngles);
		
		for (Ave ave: aves)
			System.out.println("[AVE]: " + ave.getNomeingles());
		
		request.setAttribute("aves", aves);
		RequestDispatcher dispatcher = request.getRequestDispatcher("consultarAve.jsp"); /*era consultarAve.jsp*/
		dispatcher.forward(request, response);
	}

}
