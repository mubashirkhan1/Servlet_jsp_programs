package com.redirect;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import javax.servlet.http.*;

//@WebServlet("/redirect1")
public class redirect1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 int d1=Integer.parseInt(req.getParameter("no1"));
		 int d2=Integer.parseInt(req.getParameter("no2"));
		 int d3=d1+d2;
		// res.sendRedirect("web0?d3="+d3);
//		res.setContentType("text/html");  
    	PrintWriter pw=res.getWriter();  
//		pw.println("<h1> iam mubashir khan</h1>");
		pw.println("<h1> add vlaue</h1>" +d3);
//		  
//		pw.close();
	}

}
