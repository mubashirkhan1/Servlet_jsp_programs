package com.attribute;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/attribute1")
public class attribute1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String s1=req.getParameter("n1");
		String s2=req.getParameter("n2");
		
		int ss1=Integer.parseInt(s1);
		int ss2=Integer.parseInt(s2);
		
		//adding 
		  int ss3=ss1+ss2;
	  res.setContentType("text/html");
	  PrintWriter pw=res.getWriter();
	  pw.println("<h1> hello  sameer</h1>"+ss3);
	 
	  req.setAttribute("sum", ss3);
	  
	  RequestDispatcher rd=req.getRequestDispatcher("attribute2");
	  rd.forward(req, res);
	}

}
