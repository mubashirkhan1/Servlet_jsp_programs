package com.been;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Updateform")
public class Updateform extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
	
		 rs.setContentType("text/html");  
	        PrintWriter out=rs.getWriter(); 
	        
	        out.print("Update user details");
	        int id=id=Integer.parseInt(rq.getParameter("id"));
	       //  int id=Integer.parseInt(sid);
	         out.println("mubas");
	         
	         
	         User_detail e=selectdetail.getalluserdetailsbyid(id);
	         
	        out.print("<html>");
	        out.println("<body>");
	         out.print("<form action='Updatedetail' method='post'>");  
	         out.print("<table>"); 
	         out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");  
	         out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+e.getName()+"'/></td></tr>");  
	  
	         out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+e.getEmail()+"'/></td></tr>");  
	         out.print("<tr><td>Country:</td><td>");  
	         
	         out.print("<select name='country' style='width:150px'>");  
	         out.print("<option>India</option>");  
	         out.print("<option>USA</option>");  
	         out.print("<option>UK</option>");  
	         out.print("<option>Other</option>");  
	         out.print("</select>");  
	         out.print("</td></tr>");  
	         out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
	         out.print("</table>");  
	         out.print("</form>");  
	           out.println("</body>");
	           out.println("</html>");
	         out.close();  
	        
	        
	}

}
