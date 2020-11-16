<%-- 
    Document   : athleteList
    Created on : Oct 19, 2020, 12:29:19 PM
    Author     : popelos
--%>
<%@page import="popelos.entity.Athlete"%>
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
                <th>Name</th>
                <th>Age</th>
                <th>Heigh</th>
                <th>Weight</th>
                <th>Date of birth</th>
                <th>Team</th>               
                <th colspan="2">Action</th>               
                </thead>
                <c:forEach items="${athletes}" var="a">
                    <tr>
                        <td>${a.id}</td>
                        <td>${a.name}</td>
                        <td>${a.age}</td>
                        <td>${a.height}</td>
                        <td>${a.weight}</td>
                        <td>${a.dateOfBirth}</td>
                        <td>${a.tid.sport}</td>
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
