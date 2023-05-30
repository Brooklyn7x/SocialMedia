package com.faceweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.faceweb.enity.faceuser;
import com.faceweb.service.faceservicefactory;
import com.faceweb.service.faceserviceinterface;

/**
 * Servlet implementation class searchprofile
 */
public class searchprofile extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		System.out.println(name);
		
		
		faceuser fu = new faceuser();
		fu.setName(name);
		
		faceserviceinterface fs = faceservicefactory.createObject();
		ArrayList<faceuser> fv = fs.searchprofileService(fu);
		

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		out.println("Number of records present in databasse are:" + fv.size());
		out.println("<html><body>");
		
		for(faceuser fu1 : fv) {
			out.println("<br>---------------------------");
			out.println("<br>Name is " + fu1.getName());
			out.println("<br>Email is " + fu1.getEmail());
			out.println("<br>Password is " + fu1.getPassword());
		}
		  
		out.println("<html><body>");
		out.close();
	}
	
	
			

}

