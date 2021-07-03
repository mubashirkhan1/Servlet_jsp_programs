package com.login1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login1")
public class login1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("/Html Files/attribute.html").forward(req, res);
		res.setContentType("text/html");
		PrintWriter tw=res.getWriter();
		
		tw.print("<h1> akhlaq hetro</h1>");
	    String n=req.getParameter("userpass");  
	    tw.print("Welcome "+n);  
	}

}
