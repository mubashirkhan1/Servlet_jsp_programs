package com.hiddenform2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hiddenform2")
public class hiddenform2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException
	
	{
		String fname2=rq.getParameter("uname");	
		 rs.setContentType("text/html");
			PrintWriter pw=rs.getWriter();
			pw.println("<h2> your name is   "+fname2+"</h2>");
		
		
	}

}
