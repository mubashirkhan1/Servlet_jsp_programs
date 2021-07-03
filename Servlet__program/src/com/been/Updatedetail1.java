package com.been;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Updatedetail")
public class Updatedetail1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
		 rs.setContentType("text/html");  
	        PrintWriter out=rs.getWriter();  
	        
	        
	        out.println("<h1> Update user details</h1>");
	        

	        String sid=rq.getParameter("id");
	        int id1=Integer.parseInt(sid);
	       

	     
	        String name=rq.getParameter("name");
	        String email=rq.getParameter("email");
	        String country=rq.getParameter("country");
	        
	        User_detail u=new User_detail();
	        u.setId(id1);
	        u.setName(name);
	        u.setEmail(email);
	        u.setCountry(country);
	        out.print("<h1> sBEFOR</h1>");
	      int status = Updateuser.update(u);
	      
	      if(status>0)
	      {
	    	  rs.sendRedirect("Showalluser");
	      }
	      else {out.print("<h1> sorry unable to update record</h1>");}
	      out.close();
	        
	}

}
