package com.session1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session1")
public class session1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {

		String fname2=rq.getParameter("fname");	
		 rs.setContentType("text/html");
			PrintWriter pw=rs.getWriter();
			pw.print("this is my name" +fname2);
			
			
			HttpSession session=rq.getSession();
			session.setAttribute("name", fname2);
			
		     pw.print("<a href='session2'>visit</a>");  
	}

}
