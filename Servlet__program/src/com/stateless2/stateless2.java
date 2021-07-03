package com.stateless2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/stateless2")
public class stateless2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
		String name=rq.getParameter("name");
		String no1=rq.getParameter("no1");
		int n1=Integer.parseInt(no1);
		 rs.setContentType("text/html");
		 PrintWriter pw=rs.getWriter();
		 for(int i=1;i<=10;i++) {
		 pw.println("<h1>i am stateless 2 welcom back my websites                <h1>"+name        +i*n1);
		 }
	}

}
