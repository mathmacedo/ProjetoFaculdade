<%-- 
    Document   : index.jsp
    Created on : May 9, 2019, 9:23:25 PM
    Author     : macedo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Variável</h1>
		<c:set value="10" var="variavel" />
		<br />
		<c:out value="${variavel}" />
		<h1>Bean</h1>
		<jsp:useBean id="aluno" class="com.cursojava.beans.Aluno" />
		<c:set target="${aluno}" property="nome" value="Razer" />
		<c:out value="${aluno.nome}" />
		
		<c:catch var="excecao">
			<%
				out.println(5/0);
			%>
		</c:catch>
		${excecao.message}
		<br>
		
		
		<c:catch var="excecao">
			<%
				out.println(5/0);
			%>
		</c:catch>
		<c:if test="${excecao != null}">
			Exceção: <c:out value="${excecao.message}" />
			<br>
		</c:if>
			
			
		<c:catch var="excecao">
			<%
				out.println(5/2);
			%>
		</c:catch>
		<c:if test="${excecao != null}">
			<br>
			Exceção: <c:out value="${excecao.message}" />
			<br>
		</c:if>
			
		<c:set var="idade" value="555" />
		<c:choose>
			<c:when test="${idade >= 60}">
				<br>
				<c:out value="Adulto" />
			</c:when>
			<c:when test="${idade >= 18}">
				<br>
				<c:out value="Jovem" />
			</c:when>
			<c:otherwise>
				<br>
				<c:out value="Crianca" />
			</c:otherwise>
		</c:choose>
    </body>
</html>
