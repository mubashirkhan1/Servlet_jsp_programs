package com.been;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Savedetails {
	
	
	  public static int save(User_detail u) 
      {
    	  int status =0;
    	  try
    	  {
	    	  Connection con=Connection1.getConnection();
	    	  PreparedStatement ps=con.prepareStatement( "insert into user(name,email,country) values(?,?,?)");
	    	  
	    	  ps.setString(1, u.getName());
	    	  ps.setString(2, u.getEmail());
	    	  ps.setString(3, u.getCountry());
//	    	  if(con !=null) {System.out.println("mubashir");}else {System.out.println("error");}
//	    	  ps.setString(1, "mubashir");
//	    	  ps.setString(2, "mubashir@123gmail.com");
//	    	  ps.setString(3, "india");
	    	   
	    	  status=ps.executeUpdate();
	    	 
	    	  con.close(); 
	    	
	    	  
    	  }
    	  catch(Exception e1)
    	  {
    		  
    		  e1.printStackTrace();
    	  }
		return status;
		
      }

}
