package com.been;

public class User_detail {
	private int id;
	private String name;
	private String email;
	 private String country;
	
	 
	 public User_detail() {}
	 
	public User_detail(int id) {
		
		this.id = id;
	}


	public User_detail(String name, String email, String country) 
	{
		
		this.name = name;
		this.email = email;
		this.country = country;
	}
	
	
	public User_detail(int id, String name, String email, String country) {
		
		this.name = name;
		this.id = id;
		this.email = email;
		this.country = country;
	}


	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getCountry() 
	{
		return country;
	}
	public void setCountry(String country) 
	{
		this.country = country;
	}

}
