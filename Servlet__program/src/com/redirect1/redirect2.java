package com.redirect1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/redirect2")
public class redirect2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int d3=Integer.parseInt(req.getParameter("d3")) ;
	     d3=d3*d3;
		res.setContentType("text/html");  
		PrintWriter pw=res.getWriter();  
		pw.println("<h1> iam mubashir khan redirect 2</h1>" +d3);	
		
		
	}

	
}
