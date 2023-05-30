package com.faceweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.faceweb.enity.faceuser;
import com.faceweb.enity.friendlist;
import com.faceweb.service.faceservicefactory;
import com.faceweb.service.faceserviceinterface;

/**
 * Servlet implementation class Loginserverlet
 */
public class Loginserverlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		faceuser fu = new faceuser();
		
		fu.setEmail(email);
		fu.setPassword(password);
		
		
		faceserviceinterface fs = faceservicefactory.createObject();
		int i = fs.loginuserservice(fu);
				
				
				
				
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		
		
		
		out.println("<html><body>");
		
			if(i>0) {
				
				
					ServletContext sc = getServletContext();
					sc.setAttribute("userid",email);			
					HttpSession ss=request.getSession(true); //creating session to share information bydefault session will be valid for 30 minutes
					ss.setAttribute("userid",email);
					
					
					ss.setMaxInactiveInterval(5);
					
					Cookie c =new Cookie("i","123");
					response.addCookie(c);
					
					ArrayList<faceuser> fv = fs.viewallprofileservice();
					
					out.println("invalid id and password ");
					RequestDispatcher rd=getServletContext().getRequestDispatcher("/userhomepage.jsp");
					request.setAttribute("userlist", fv);
					rd.forward(request, response);
					
			
		
	       }
			else {
				out.println("invalid id and password ");
				RequestDispatcher rd=getServletContext().getRequestDispatcher("/login.html");
				rd.include(request, response);
			}
			out.println("<html><body>");
	}
	}


