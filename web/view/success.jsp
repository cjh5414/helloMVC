<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2017. 1. 11.
  Time: 오전 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <title>Success</title>
</head>
<body>
    <%-- JSP Experssion Language --%>
    <%--@elvariable id="customer" type="Customer"--%>
    <%--@elvariable id="customerList" type="ArrayList<Customer>"--%>
    <ul>
        <li> Id: ${customer.id} </li>
        <li> Name: ${customer.name} </li>
        <li> Email: ${customer.email} </li>
    </ul>

    <%-- JSTL --%>

    <table style="border: 1px solid red; padding:10px;">
        <c:forEach var="customer" items="${customerList}">
            <tr>
                <td>${customer.id}</td>
                <td>${customer.name}</td>
                <td>${customer.email}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
