package com.faceweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.faceweb.enity.faceuser;
import com.faceweb.service.faceservicefactory;
import com.faceweb.service.faceserviceinterface;

/**
 * Servlet implementation class editprofileservrlet
 */
public class editprofileservrlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		
		HttpSession ss = request.getSession(true);
		Object oo = ss.getAttribute("userid");
		String email = oo.toString();
		
		
		 faceuser fu = new faceuser();
		 fu.setEmail(email);
		
		
		
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		 
		 
		
		 fu.setName(name);
		 fu.setPassword(password);
		 
		 faceserviceinterface fs = faceservicefactory.createObject();
		 int i = fs.edituserservice(fu);
		
		
		
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
		

			out.println("<html><body>");
			if(i>0) {
			out.println("<br>Hello "+name);
			out.println("<br>Your Profile Edited successful ");
					
			}
			else {
				out.println("oops something is wrong");
			}
		out.println("</body></html>");
				
		}
}
	


