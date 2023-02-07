package dex.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dex.model.Aluno;

/**
 * Servlet implementation class entrarAlunoController
 */
@WebServlet("/entrarAlunoController")
public class entrarAlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public entrarAlunoController() {
		super();
		//
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

		/*
		 * String matricula = request.getParameter("matricula"); String nomeCompleto =
		 * request.getParameter("nomeCompleto"); String dataNascimento =
		 * request.getParameter("dataNascimento"); String emailResponsavel =
		 * request.getParameter("emailResponsavel"); String endereco =
		 * request.getParameter("endereco");
		 */

		String matricula = request.getParameter("matricula");
		String nomeCompleto = request.getParameter("nomeCompleto");
		String emailResponsavel = request.getParameter("emailResponsavel");
		String endereco = request.getParameter("endereco");
		String dataNascimento = request.getParameter("dataNascimento");

		System.out.println("[ALUNO]: " + matricula);
		System.out.println("[ALUNO]: " + nomeCompleto);
		System.out.println("[ALUNO]: " + emailResponsavel);
		System.out.println("[ALUNO]: " + endereco);
		System.out.println("[ALUNO]: " + dataNascimento);

		String msg;
		RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");

		if (matricula != null && !matricula.isEmpty() && nomeCompleto != null && !nomeCompleto.isEmpty()
				&& emailResponsavel != null && !emailResponsavel.isEmpty() && endereco != null && !endereco.isEmpty()
				&& dataNascimento != null && !dataNascimento.isEmpty()) {
			boolean entrar = false;
			if (request.getParameter("entrar") != null && request.getParameter("entrar").equals("Login"))
				entrar = true;
			Aluno aluno = new Aluno(matricula, nomeCompleto, emailResponsavel, endereco,  dataNascimento);
			aluno.logar();
			msg = "Bem vindo(a)!";
		} else
			msg = "Há campos pendentes!";
		request.setAttribute("msg", msg);
		dispatcher.forward(request, response);
	}
}
