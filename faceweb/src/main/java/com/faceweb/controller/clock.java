package com.faceweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class clock
 */
public class clock extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalTime it = LocalTime.now();
		
		
		
		
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		
		
		
		out.println("<html><body>");
		
			out.println(it);
		
		 out.println("</body></html>");
	
	}

}
