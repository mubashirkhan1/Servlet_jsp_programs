package com.Urlre1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/urlre2")
public class urlre2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
		 rs.setContentType("text/html");
			PrintWriter pw=rs.getWriter();
			pw.println("<h1 style='color:blue;'>  iam urlre2   <h1>");
			
			//url ffetch
			String uname1=rq.getParameter("uname");
			String pass1=rq.getParameter("pass");
			//String s2=rq.getParameter("s2");
			pw.println(uname1);
			pw.println(pass1);
	}

}
