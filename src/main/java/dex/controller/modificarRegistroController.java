package dex.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dex.model.Ave;

/**
 * Servlet implementation class modificarRegistroController
 */
@WebServlet("/modificarRegistroController")
public class modificarRegistroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modificarRegistroController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UFT-8");
		
		String apagar = request.getParameter("apagar");
		String alterar = request.getParameter("alterar");
		String id = request.getParameter("id");
		System.out.println(id);
		
		if (apagar!=null && id != null) {
			new Ave().excluir(Integer.valueOf(id));
			RequestDispatcher dispatcher = request.getRequestDispatcher("consultarAve.jsp"); 
			request.setAttribute("onsucess", "Registro eliminado!");
			dispatcher.forward(request, response);
		}else if (alterar != null && id != null) {
			Ave ave = new Ave().buscarAvePorCodigo(Integer.valueOf(id)); 
			System.out.println(ave.getEspecie());
			RequestDispatcher dispatcher = request.getRequestDispatcher("alterarAve.jsp"); 
			request.setAttribute("ave", ave);
			dispatcher.forward(request, response);
			
			/*Teste*/
			/*
			String especie = request.getParameter("especie");
			String familia = request.getParameter("familia");
			String subfamilia = request.getParameter("subfamilia");
			String nomeIngles = request.getParameter("nomeIngles");
			String estado = request.getParameter("estado");
			String onsucess;

			if (especie != null && !especie.isEmpty() &&familia != null && !familia.isEmpty() && subfamilia != null && !subfamilia.isEmpty() && nomeIngles != null
					&& !nomeIngles.isEmpty() && estado != null && !estado.isEmpty()) {
				boolean salvar = false;
				if (request.getParameter("alterar") != null && request.getParameter("alterar").equals("Alterar"))
					salvar = true;
				ave.alterar();
				onsucess = "Alterado com sucesso!";
			}else
				onsucess = "Os campos devem ser preenchidos!";
			request.setAttribute("onsucess", onsucess);
			//RequestDispatcher dispatcher2 = request.getRequestDispatcher("consultarAve.jsp");
			//dispatcher.forward(request, response);
			 */
			/*Fim teste*/
			

		}
	}
}
