package com.cookies2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookies2")
public class cookies2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
		//String name=rq.getParameter("name");
		 rs.setContentType("text/html");
		 PrintWriter pw=rs.getWriter();
		Cookie[] ck=  rq.getCookies();
		boolean f=false;
		String pol="";
		if(ck==null) {
			
			pw.print("<h1>ymera peche aao <h1>");
			return;
		}
		else {
			for(Cookie co1: ck) {
				
				String tname=co1.getName();
				if(tname.equals("username"))
				{
					 f=true;
					 pol =co1.getValue();
				}
				
				}
			
				
			}
		      if(f) {
		    		pw.print("<h1>ywelcom back my website <h1>"+ pol);
		    	    pw.println("<h1>thank you<h1>");
		      }else {
		    	  pw.print("<h1>your are new user go to home page and submit your name<h1>");
		    	  
		      }
		}
	}


