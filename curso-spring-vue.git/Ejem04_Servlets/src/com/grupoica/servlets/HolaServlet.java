package com.grupoica.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hola")
public class HolaServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

    public HolaServlet() {
     super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String strNombre=req.getParameter("nombre");
		System.out.println("Parametro:" + strNombre);
		String html="<html><head><title>Formulario envio</title></html><body>";
		
		if(strNombre == null || "".equals(strNombre)) {
			html += "<h2>Pon el nombre</h2>";
		}
		else {
			html += "<form action='./hola.do' method='post'>" + 
			"Veces: <input type='number' name='veces' />" + 
			"<input type='submit' value='POST' /></form>";
		}
		html +="</body></html>";
		
		resp.getWriter().append(html);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		/**
		 * 1 vez
		 * 2 vez
		 * 3 vez
		 * .....
		 */
		String strVeces=req.getParameter("veces");
		int iVeces = Integer.parseInt(strVeces);
		
		String htmlVeces = "";
		for (int i=0; i<=iVeces; i++) {
			htmlVeces += "<p>  vez " + i +"</p>";
		}
		
		resp.getWriter().append(htmlVeces);
	}

}
