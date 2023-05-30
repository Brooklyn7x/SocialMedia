package com.faceweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.faceweb.enity.country;

/**
 * Servlet implementation class loadcapchtaservlet
 */
public class loadcapchtaservlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int rr = (int)((Math.random())*1000);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		
		
		
		out.println("<html><body>");
		out.println("Captcha Value <input type=text value="+rr+" id=c disabled>");
		out.println("<button type=button onClick=loadcaptcha()>Refresh</button>");
		out.println("<br>Enter The Above Captcha Value <input type=text id=cc1>");
		out.println("<button type=button onClick=validatecaptcha()>Validate</button>");
		out.println("</body></html>");
	
	}
	

}
