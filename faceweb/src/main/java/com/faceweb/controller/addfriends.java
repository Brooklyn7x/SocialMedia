package com.faceweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.faceweb.enity.faceuser;
import com.faceweb.enity.friendlist;
import com.faceweb.service.faceservicefactory;
import com.faceweb.service.faceserviceinterface;

/**
 * Servlet implementation class addfriends
 */
public class addfriends extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String receiverfrinend = request.getParameter("em");
		//String reciverfriendname = request.getParameter("em");
		HttpSession hs = request.getSession(true);
		String senderfriend= hs.getAttribute("userid").toString();
		
		faceuser f = new faceuser();
		f.setEmail(senderfriend);
		
		
		
		
		friendlist f1= new friendlist();
		f1.setReceiverfrinend(receiverfrinend);
		f1.setStatus("inactive");
		f1.setF1(f);
		
		
		
		
		faceserviceinterface fs = faceservicefactory.createObject();
		String i = fs.friendrequestserservice(f1);
				
		
				
				
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		  
		out.println("<html><body><center>");
		if(i!=null) {
		out.println("<br>  Friend Request sent");
		}
		
		out.println("</center></body></html>");
		
		
		
		
	}

}
