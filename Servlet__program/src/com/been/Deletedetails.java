package com.been;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Deletedetails")
public class Deletedetails extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
		 rs.setContentType("text/html");  
	        PrintWriter out=rs.getWriter();  
	         String sid=rq.getParameter("id");
	        // out.print("jvjvjjmk");
	         int id=Integer.parseInt(sid);
	         out.print(id);
	          Updateuser.delete(id);
	          rs.sendRedirect("Showalluser");
	          out.close();
	}

}
