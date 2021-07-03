package com.ragister;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/ragister1")
public class ragister1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
	 rs.setContentType("text/html");
	PrintWriter pw=rs.getWriter();
	//getting all the informatiom from the request

	String uname=rq.getParameter("username");
	String pass=rq.getParameter("userpassword");
	String email=rq.getParameter("useremail");
	pw.println("<html>");
	pw.println("<body>");
	pw.println(uname);
	pw.println(pass);
	pw.println(email);
	
	//connection create
	try {
		Class.forName("com.mysql.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?characterEncoding=latin1","root","root");
		 pw.print("<h1>done connection<h1>");
		String qu="insert into user1(name,password,email) values(?,?,?)";
		// String uqu="update  user set name=? where id=?";
	    PreparedStatement pst=	 con.prepareStatement(qu);
	   // BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	   // pw.println("<h1>enetr your new name <h1>");
	   
	    
	   // String news=bf.readLine();
	   // pw.println("Enter the id number");
	  //  int ids= bf.read();
	    pst.setString(1,rq.getParameter("username"));
	    pst.setString(2, rq.getParameter("userpassword"));
	    pst.setString(3, rq.getParameter("useremail"));
	 //   pst.setString(3, email);
	   
	    pst.executeUpdate();
	    pw.print("<h1> done  </h1>");
	    
	} 
		catch (Exception e) 
		{
			
		e.printStackTrace();
		pw.print("<h1> error...........</h1>");
		}
	pw.print("</body>");
	pw.print("</html>");
	}

}
