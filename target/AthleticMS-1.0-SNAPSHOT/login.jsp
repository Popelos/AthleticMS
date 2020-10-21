<%-- 
    Document   : login
    Created on : Oct 18, 2020, 11:42:17 PM
    Author     : popelos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <div align="center">
            <%@include file="header.jsp" %>
            <h2>Welcome. Please Login</h2>
            <form action="${pageContext.request.contextPath}/LoginServlet" method="POST">
                <p>
                    Username: <input type="text" name="onoma">
                </p>
                <p>
                    Password: <input type="password" name="kwdikos">
                </p>
                <p>
                    <input type="submit" value="Login">
                </p>
            </form>
        </div>
    </body>
</html>
