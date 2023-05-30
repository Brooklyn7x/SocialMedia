package com.faceweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class logoutservrlet
 */
public class logoutservrlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ss = request.getSession(true);
		ss.invalidate();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("Session has expired");
		try {
			Thread.sleep(5000);
		} catch  (InterruptedException e) {
			e.printStackTrace();
			
		}
		
		response.sendRedirect("login.html");
		
		out.println("<html><body>");
		
		
	
		
	}

}
