package com.been;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.been.User_detail;



@WebServlet("/Save1")
public class Save1 extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
	   
	    rs.setContentType("text/html");  
        PrintWriter out=rs.getWriter();  
          
        String name=rq.getParameter("name"); 
        String email=rq.getParameter("email");  
        String country=rq.getParameter("country");  
//        out.println(name);
//        out.println(email);
//        out.println(country);
        
        User_detail u=new User_detail();  
	        u.setName(name);    
	        u.setEmail(email);  
	        u.setCountry(country); 
	        
	        int status=Savedetails.save(u);
	        if(status>0)
	        {  
	            out.print("<p>Record saved successfully!</p>"); 
	            rq.getRequestDispatcher("crud1.html").include(rq, rs); 
	        }
	            else 
	            {
	            	   out.println("Sorry! unable to save record");  	
	            }
	        out.close();
    }
	      }


