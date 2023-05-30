package com.faceweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.faceweb.enity.country;
import com.faceweb.enity.faceuser;
import com.faceweb.service.faceservicefactory;
import com.faceweb.service.faceserviceinterface;

/**
 * Servlet implementation class loadcountryservlet
 */
public class loadcountryservlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		faceserviceinterface fs = faceservicefactory.createObject();
		List<country> i = fs.loadcountryservice();
				
				
				
				
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		
		
		
		out.println("<html><body>");
		out.println("<select>");
		for(country cc: i) {
			out.println("<option>"+cc.getName() +"</option>");
		
					
		}
		out.println("</body></html>");
	
	}

}
