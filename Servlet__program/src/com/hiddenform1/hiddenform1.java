package com.hiddenform1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hiddenform1")
public class hiddenform1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
		String fname1=rq.getParameter("fname");	
	
		 rs.setContentType("text/html");
			PrintWriter pw=rs.getWriter();
     
			pw.println("<h2> your name is   "+fname1+"</h2>");
	        pw.print("<form action='hiddenform2'>");  
	        pw.print("<input type='hidden' name='uname' value='"+fname1+"'>");  
	        pw.print("<input type='submit' value='go'>");  
	        pw.print("</form>");  
		
}}
