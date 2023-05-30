package com.faceweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.faceweb.enity.faceuser;
import com.faceweb.service.faceservicefactory;
import com.faceweb.service.faceserviceinterface;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class viewallprofile
 */
public class viewallprofile extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		faceserviceinterface fs = faceservicefactory.createObject();
		ArrayList<faceuser> fv = fs.viewallprofileservice();

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
				
			out.println("Number of records present in databasse are:" + fv.size());
				
				out.println("<html><body>");
			
				for(faceuser fu:fv ) {
				   out.println("<br>---------------------------");
				   out.println("<br>Name is " + fu.getName());
				   out.println("<br>Email is " + fu.getEmail());
				   out.println("<br>Password is " + fu.getPassword());
				  
		  out.println("<html><body>");
	}
				
	}
	
}
	
