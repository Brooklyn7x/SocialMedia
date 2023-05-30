package com.faceweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.faceweb.enity.faceuser;
import com.faceweb.service.faceservicefactory;
import com.faceweb.service.faceserviceinterface;

/**
 * Servlet implementation class deleteprofileservlet
 */
public class deleteprofileservlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		HttpSession ss = request.getSession(true);
		Object oo = ss.getAttribute("userid");
		String email = oo.toString();
		
	
		 faceuser fu = new faceuser();
		 fu.setEmail(email);
		
		 
		 
		
		
		 faceserviceinterface fs = faceservicefactory.createObject();
		 int i = fs.deleteuserservice(fu);
		
		
		
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
		

				out.println("<html><body>");
			
				if(i>0) {
				out.println("<br> Deleted Successful !!!!!!!!!");
				out.println("<br><a href=login.html>Continue...</a> ");
				
				
			
		       }
				else {
					out.println("Not Working");
				}
				out.println("<html><body>");
				
				
		}
	}


