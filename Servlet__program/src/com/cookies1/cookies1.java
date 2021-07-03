package com.cookies1;

import java.io.IOException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookies1")
public class cookies1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
		String name2=rq.getParameter("name");
		 rs.setContentType("text/html");
		 PrintWriter pw=rs.getWriter();
		 pw.println("<h1>i am cooki 1                 <h1>"+name2);
		// pw.println("<h1><a href='cookies2'> go to the cooki 2</a></h1>");
		 Cookie ck=new Cookie("username" ,name2);
		 rs.addCookie(ck);
		 
		pw.println("<h1><a href='cookies2'> go to the cooki 2</a></h1>");
		 
//		 pw.print("<form action='com.cookies2./cookies2.java'>");  
//		    pw.print("<input type='submit' value='go'>");  
//		    pw.print("</form>");  
		          
		    pw.close();  
	}
     
}
