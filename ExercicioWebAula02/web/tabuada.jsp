<%-- 
    Document   : index
    Created on : Mar 11, 2019, 10:45:42 AM
    Author     : macedo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table style="width:100%"> .
            <tr>
                <th>Tabuada 1</th>
                <th>Tabuada 2</th>
                <th>Tabuada 3</th>
                <th>Tabuada 4</th>
                <th>Tabuada 5</th>
                <th>Tabuada 6</th>
                <th>Tabuada 7</th>
                <th>Tabuada 8</th>
                <th>Tabuada 9</th>
            </tr>
            <tr style="text-align: center;">
                <% for (int i = 1; i <= 9; i++) {
                        out.println("<td>" + i + " x 1 = " + i * 1 + "</td>");
                    } %>
            </tr>
            <tr style="text-align: center;">
                <% for (int i = 1; i <= 9; i++) {
                        out.println("<td>" + i + " x 2 = " + i * 2 + "</td>");
                    } %>
            </tr>
            <tr style="text-align: center;">
                <% for (int i = 1; i <= 9; i++) {
                        out.println("<td>" + i + " x 3 = " + i * 3 + "</td>");
                    } %>
            </tr>
            <tr style="text-align: center;">
                <% for (int i = 1; i <= 9; i++) {
                        out.println("<td>" + i + " x 4 = " + i * 4 + "</td>");
                    } %>
            </tr>
            <tr style="text-align: center;">
                <% for (int i = 1; i <= 9; i++) {
                        out.println("<td>" + i + " x 5 = " + i * 5 + "</td>");
                    } %>
            </tr>
            <tr style="text-align: center;">
                <% for (int i = 1; i <= 9; i++) {
                        out.println("<td>" + i + " x 6 = " + i * 6 + "</td>");
                    } %>
            </tr>
            <tr style="text-align: center;">
                <% for (int i = 1; i <= 9; i++) {
                        out.println("<td>" + i + " x 7 = " + i * 7 + "</td>");
                    } %>
            </tr>
            <tr style="text-align: center;">
                <% for (int i = 1; i <= 9; i++) {
                        out.println("<td>" + i + " x 8 = " + i * 8 + "</td>");
                    } %>
            </tr>
            <tr style="text-align: center;">
                <% for (int i = 1; i <= 9; i++) {
                        out.println("<td>" + i + " x 9 = " + i * 9 + "</td>");
                    } %>
            </tr>
            <tr style="text-align: center;">
                <% for (int i = 1; i <= 9; i++) {
                        out.println("<td>" + i + " x 10 = " + i * 10 + "</td>");
                    }%>
            </tr>
        </table>
    </body>
</html>
