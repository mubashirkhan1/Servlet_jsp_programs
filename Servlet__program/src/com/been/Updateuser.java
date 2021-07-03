package com.been;
import java.util.*;

import com.been.User_detail;

import java.sql.*; 


public class Updateuser
{
 

      
        public static int  update(User_detail e)
        {int status=0;
        	Connection con=Connection1.getConnection();
        	try
        	{
        		PreparedStatement ps=con.prepareStatement(" update user set name=? ,email=?,country=? where id=?;");
        		ps.setString(1,e.getName());   
                ps.setString(2,e.getEmail());  
                ps.setString(3,e.getCountry());  
                ps.setInt(4,e.getId());  
                  
                status=ps.executeUpdate();  
        		
        	}
        	catch(Exception e3)
        	{
        		e3.printStackTrace();
        	}
			return status;
        	
        	
        	
        }
      		public static int delete(int id)
      		{    int status=0;
      			Connection con=Connection1.getConnection();
      			try
      			{
      			
      			 PreparedStatement ps=con.prepareStatement("delete from user where id=?");  
                 ps.setInt(1,id);  
                 status=ps.executeUpdate();  
                 
                 con.close(); 
      			}
      			catch(Exception e) 
      			{
      			  e.printStackTrace();	
      			}
				return status;
      			
      			
      		}
}


