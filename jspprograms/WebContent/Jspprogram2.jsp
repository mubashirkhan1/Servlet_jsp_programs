<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%  
out.print("Welcome "+request.getParameter("name"));  
  
String driver=config.getInitParameter("dname");  
out.print("driver name is="+driver);  
  /*
response.sendRedirect("http://www.google.com"); 
*/
/*
/*
String name=request.getParameter("uname");
String name1=request.getParameter("fname");
out.print("welcome to jsp"+" "+name);
sout.print("welcome to jsp"+" "+name1);
*/%>  


</body>
</html>