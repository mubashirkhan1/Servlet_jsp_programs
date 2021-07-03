package com.stateless1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/stateless1")
public class stateless1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
		String name=rq.getParameter("name");
	 rs.setContentType("text/html");
	 PrintWriter pw=rs.getWriter();
	 pw.println("<h1>i am stateless                 <h1>"+name);
	 pw.println("<h1><a href='stateless2'> go to the stateless 2</a></h1>");
	}

}
