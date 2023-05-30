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
 * Servlet implementation class checkemailservlet
 */
public class checkemailservlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("emailvalue");
		faceuser fu = new faceuser();
		fu.setEmail(email);
		
		faceserviceinterface fs = faceservicefactory.createObject();
		int i = fs.checkemailservice(fu);
				
				
				
				
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		
		
		
		out.println("<html><body>");
		if(i>0) {
			out.println("<font color=red>Email already have taken choose another email id</font>");
		
					
		}
		else {
			out.println("<font color=green>Valid Email</font>");
		}
		out.println("</body></html>");
	}
	
}


