package br.univel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.univel.comum.AutoService;
import br.univel.qualifiers.Bmw;
import br.univel.qualifiers.Ford;
import br.univel.qualifiers.Honda;

@WebServlet("/ExemploQualifier")
public class ExemploQualifier extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
    @Inject
    @Bmw
    private AutoService bmwAutoService;
 
    @Inject
    @Honda
    private AutoService hondaAutoService;
 
    @Inject
    @Ford
    private AutoService fordAutoService;
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		
		writer.println(bmwAutoService.getService());
		writer.println(hondaAutoService.getService());
		writer.println(fordAutoService.getService());
		writer.flush();
	}

}
