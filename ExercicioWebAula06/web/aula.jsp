<%-- 
    Document   : aula
    Created on : Apr 25, 2019, 7:47:23 PM
    Author     : macedo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import='java.util.*' %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <b>Página HTML</b><br/>
		<%
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(10);
			arr.add(20);
			arr.add(30);
			for (Integer i: arr)
			out.println("<h2>" + i + "</h2>");
		%>
    </body>
</html>
