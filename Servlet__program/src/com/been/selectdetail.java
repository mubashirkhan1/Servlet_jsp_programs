package com.been;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class selectdetail {
	public static User_detail getalluserdetailsbyid(int id) 
	{
		User_detail u=new User_detail();
			try
			{
				Connection con=Connection1.getConnection();
				 PreparedStatement ps=con.prepareStatement("select * from user where id=?"); 
				  ps.setInt(1,id);  
				  
				  ResultSet rs1=ps.executeQuery();
				  
				  if(rs1.next())
				  {
				      u.setId(rs1.getInt(1));  
	                u.setName(rs1.getString(2));  
	                u.setEmail(rs1.getString(3));  
	                u.setCountry(rs1.getString(4)); 
					  
					  
				  }
				   con.close(); 
				
			}
			catch(Exception e4)
			{
				e4.printStackTrace();
			}
			return u;
		    
	}
	
	

		public static List<User_detail> getalluser()
		{
			List<User_detail> l=new ArrayList();
			
			try 
			{
			   Connection con=Connection1.getConnection();
		        PreparedStatement ps=con.prepareStatement("select * from user");
		        ResultSet rs=ps.executeQuery();
		        
		        while(rs.next())
		        {
				      User_detail  u=new User_detail();	
				      u.setId(rs.getInt(1));  
		              u.setName(rs.getString(2));   
		              u.setEmail(rs.getString(3));  
		              u.setCountry(rs.getString(4));  
		              l.add(u);  
		        	
		        }
		        con.close();
			}
			catch(Exception e6) 
			{
				e6.printStackTrace();
			}
		return l;
		}
	

}
