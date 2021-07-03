package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Intex
 */
//@WebServlet("/Intex")
public class Intex extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Intex() {
     System.out.println("hello");
    }

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		  System.out.println("hello mubashir");
		// TODO Auto-generated method stub
		 res.setContentType("text/html");
		   PrintWriter out=res.getWriter();
		   out.println("<h1>welcom servlet 4</h1>");
		   String d=req.getParameter("uname");
		   out.print(d);
	}

}
