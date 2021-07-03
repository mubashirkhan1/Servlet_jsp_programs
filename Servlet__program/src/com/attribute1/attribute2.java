package com.attribute1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/attribute2")
public class attribute2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String s1=req.getParameter("n1");
		String s2=req.getParameter("n2");
		
		int ss1=Integer.parseInt(s1);
		int ss2=Integer.parseInt(s2);
		int sum=(int) req.getAttribute("sum");
		
		int p=sum*sum;
		
		//get attribute from req object
			//int sum=(int) req.getAttribute("sum");
			 res.setContentType("text/html");
			  PrintWriter pw=res.getWriter();
			  pw.println("<h1>");
			  pw.print("sum is " +sum);
			  pw.print("product is" + p);
			  pw.println("</h1>");
	
	}

}
