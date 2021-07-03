package com.Urlre1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Urlre1")
public class Urlre1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
		String s1=rq.getParameter("username");
		String s2=rq.getParameter("pass");
		
		 rs.setContentType("text/html");
			PrintWriter pw=rs.getWriter();
			pw.println("<h2> your name is   "+s1+"</h2>");
			pw.println("<h2> your pass is   "+s2+"</h2>");
			pw.println("<h1>i am servlet urlre1<h1>");
			
			   pw.print("<a href='urlre2?uname=" +s1+"&pass="+s2+"'>visit</a>");  
			   
	}

}
