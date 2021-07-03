package com.been;

import java.sql.*;
import java.util.*;
import com.mysql.jdbc.Connection;

public class Connection1 {
//	public static void main(String[] args) {
//		Connection1.getConnection();
//	}
	
	
	public static Connection getConnection()
	 {  
			     Connection con=null;  
			  
			   try
			   {
				   Class.forName("com.mysql.jdbc.Driver");
				   con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
				     
				   System.out.println("ok");
				   
				   
			   }
			   catch(Exception e)
			   {
				   e.printStackTrace();
				   
				   
			   }
			   return con;  
	 	} 

}
