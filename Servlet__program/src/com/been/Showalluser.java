package com.been;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Showalluser")
public class Showalluser extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException
	{
		 rs.setContentType("text/html");  
	        PrintWriter out=rs.getWriter();  
	        
	        out.println("<th><a href='crud1.html'> add new user </a></th>");
	        out.println("<h1> show user details </h1>");
	        
	       List<User_detail> li= selectdetail.getalluser();
	       out.println("<table border=1 width=5% height=5%>");  
           out.println("<tr><th>Id</th><th>name</th><th>Email id</th><th>Country</th></tr>");  
           for (User_detail l:li) 
           {    
              
               out.print("<tr><td>" + l.getId() + "</td><td>" + l.getName() + "</td><td>" + l.getEmail() + "</td><td>" +l.getCountry()+"</td><td><a href='Updateform?id="+l.getId()+"'> Edit</a>  <td><a href='Deletedetails?id="+l.getId()+"'>Delete</a></td></tr>");   
           }  
           out.println("</table>");  
           out.println("</html></body>");  
           out.close();
	       }
	       
	        
	}


