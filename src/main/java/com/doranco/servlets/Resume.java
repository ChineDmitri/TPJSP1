package com.doranco.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doranco.beans.intermediaire.IntermediaireBean;
import com.doranco.beans.resume.ResumeBean;

@WebServlet("/Resume")
public class Resume extends HttpServlet {
	private static final long serialVersionUID = 1L;

	IntermediaireBean intermediaire = new IntermediaireBean();

	public Resume() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String genre = request.getParameter("genre");

		String nom = request.getParameter("nom");

		String entree = request.getParameter("entree");

		String plat = request.getParameter("plat");

		String desert = request.getParameter("desert");

		ResumeBean resume = new ResumeBean(genre, nom, entree, plat, desert);

		IntermediaireBean.addResume(resume);
		// pour test
		System.out.println("NEW POST");
		IntermediaireBean.getAllResume();

		request.setAttribute("resume", resume);

		this.getServletContext().getRequestDispatcher("/WEB-INF/resume.jsp")
				.forward(request, response);

	}

}
