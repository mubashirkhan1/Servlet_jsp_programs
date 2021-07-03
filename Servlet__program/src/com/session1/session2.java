package com.session1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/session2")
public class session2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
		
        response.setContentType("text/html");  
        PrintWriter pw = response.getWriter();
        
      HttpSession session=  request.getSession(false);
       String name1= (String) request.getAttribute("name");
       pw.print("welcom back    " +name1);
	} 

}
