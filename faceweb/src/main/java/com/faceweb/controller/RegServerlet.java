package com.faceweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.faceweb.enity.faceuser;

import com.faceweb.service.faceservicefactory;
import com.faceweb.service.faceserviceinterface;

/**
 * Servlet implementation class RegServerlet
 */
public class RegServerlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		faceuser fu = new faceuser();
		fu.setName(name);
		fu.setEmail(email);
		fu.setPassword(password);
		
		
		faceserviceinterface fs = faceservicefactory.createObject();
		int i = fs.regsuserservice(fu);
				
				
				
				
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		
		
		
		out.println("<html><body>");
		
			if(i>0) {
			out.println("<br> Hello user ---> " + name);
			out.println("<br> Your sign up was successful!");
			out.println("<br><a href=login.html>Please click the button below to continue to the login page.</a> ");
		out.println("<html><body>");
			
		
	       }
			else {
				out.println("Not Working");
			}
			out.println("<html><body>");
	}
}

