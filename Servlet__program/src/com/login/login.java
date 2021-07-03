package com.login;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
	  
		rs.setContentType("text.html");
		PrintWriter pw=rs.getWriter();
		//pw.println("<h1> hello login servlet</h1>");
		
		String r1=rq.getParameter("fname");
		String r2=rq.getParameter("userpass");
		
	//	if(r1 !=null && r2 !=null) {
		
		
		pw.println("name is   :" +r1);
		pw.println("password is   :" +r2);
//		
//	    if(r1.equals("servlet")){  
//	        RequestDispatcher rd=rq.getRequestDispatcher("webt3");  
//	        rd.forward(rq, rs);  
//	    }  
//	    else {
//	    	  pw.print("Sorry UserName or Password Error!");  
//	          RequestDispatcher rd=rq.getRequestDispatcher("webt3");  
//	          rd.include(rq, rs);  
//	                        
//	    	
//	    }
	}
}
	


