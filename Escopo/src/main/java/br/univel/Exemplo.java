package br.univel;

import java.io.IOException;

import javax.enterprise.context.RequestScoped;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exemplo
 */

@RequestScoped
@WebServlet("/Exemplo")
public class Exemplo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.getWriter().append("Este é um exemplo utilizando o escopo RequestScoped");
	}

}
