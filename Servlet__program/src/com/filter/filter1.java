package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class filter1 implements Filter{

	

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest rq, ServletResponse rs, FilterChain c)
			throws IOException, ServletException {
		   PrintWriter out=rs.getWriter();  
		String s= rq.getParameter("password");
		if(s.equals("admin")) {
		System.out.println("before servler ");
			
		c.doFilter(rq, rs);
		}
		else {
			out.print("your password is wrong");
		    RequestDispatcher rd=rq.getRequestDispatcher("p.html");  
	        rd.include(rq, rs);
		   }
	
	
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

		
	}

	
	}


