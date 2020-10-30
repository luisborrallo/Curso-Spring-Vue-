<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejemplo JSP</title>
</head>
<body>
<h1>Ejemplo JSP</h1>
<%!  String crearOL (int v){
	 String ol = "<OL>";
	 int i = v;
	 while (i>0){
		ol +="<LI> Cuenta atrás" +i+ "/5 </LI>";
		i--;
	 }
	 return ol+ "</OL>";
}
%>
<HR>
<% 
Date d =  new Date ();
out.println(d.toString());
if (d.getSeconds() % 2 == 0 ){%>
	<p style ="background-color: red">Nice try, intenta otro impar</p>
<% } else { %>
	<p style ="background-color: blue"></p>
	<%= crearOL(d.getSeconds()) %>
	<%-- Asi se hace un coment 
	<% out.println(crearOL(5));  %>  --%>
	
<HR/>
<% }%>
</body>
</html>