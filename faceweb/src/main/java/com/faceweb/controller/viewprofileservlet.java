package com.faceweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class viewprofileservlet
 */
public class viewprofileservlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc = getServletContext();
		Object oo = sc.getAttribute("userid");
		String email = oo.toString();
		
		
		
		
		
		Cookie cc[]=request.getCookies();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		for(int i=0;i<cc.length;i++) {
			Cookie c1=cc[i];
			out.println("<br>Cookie Name "+c1.getName());
			out.println("<br>Cookie Value "+c1.getValue());
		}
		
		
		out.println("<html><body>");
			out.println("user id is" + email);
		out.println("<html><body>");
		
		
		
		
	}

}
