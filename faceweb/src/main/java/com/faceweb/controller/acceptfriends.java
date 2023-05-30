package com.faceweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
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
 * Servlet implementation class acceptfriends
 */
public class acceptfriends extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String receiverfrinend = request.getParameter("em1");
		HttpSession hs = request.getSession(true);
		String senderfriend= hs.getAttribute("userid").toString();
		
		faceuser f = new faceuser();
	    f.setEmail(senderfriend);
		
		
		
		friendlist f1= new friendlist();
		f1.setStatus("inactive");
		f1.setF1(f);
	
		
		faceserviceinterface fs = faceservicefactory.createObject();
		ArrayList<friendlist> fl = fs.acceptrequestserservice(f1);
		
		
				
		
				
				
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("New Friend Request       --------   " + fl.size());
		
		  
		out.println("<html><body>");
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/friendsrequest.jsp");
		request.setAttribute("friends", fl);
		rd.forward(request, response);
		out.println("</body></html>");
	}

}
