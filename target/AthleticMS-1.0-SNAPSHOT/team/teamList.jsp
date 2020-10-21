<%-- 
    Document   : teamList
    Created on : Oct 19, 2020, 5:29:41 PM
    Author     : popelos
--%>

<%@page import="popelos.entity.Team"%>
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
            <th>Sport</th>           
            <th>Action</th>               
            <th></th>               
            </thead>
            <c:forEach items="${teams}" var="t">
                <tr>
                    <td>${t.id}</td>
                    <td>${t.sport}</td>
                    <td >
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