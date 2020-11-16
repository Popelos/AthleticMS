<%-- 
    Document   : performanceList
    Created on : Oct 20, 2020, 5:03:31 PM
    Author     : popelos
--%>

<%@page import="popelos.entity.Performances"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of athletes</title>
        <style><%@include file="/WEB-INF/css/tableStyle.css"%></style>
    </head>
    <body>
        <%@include file="../header.jsp" %>
        <div class="t_holder">   
            <table class="content-table">
                <thead>
                <th>Id</th>
                <th>Performance</th>
                <th>Athlete</th>
                <th>Game</th>             
                <th colspan="2">Action</th>               
                </thead>
                <c:forEach items="${performances}" var="p">
                    <tr>
                        <td>${p.id}</td>
                        <td>${p.performance}</td>
                        <td>${p.aid.name}</td>
                        <td>${p.gid.gameDate}</td>
                        <td>
                            <a href="product/editProduct?id=${a.id}">Edit</a>
                        </td>
                        <td>
                            <a href="product/deleteProduct?id=${a.id}"
                               onclick="return confirm('Do you realy want to delete product:' +${a.id} + '????')">Delete</a>

                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body> 
</html>
