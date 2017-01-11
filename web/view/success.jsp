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
    <title>Success</title>
</head>
<body>
    <%-- JSP Experssion Language --%>
    <ul>
        <li> Id: ${customer.id} </li>
        <li> Name: ${customer.name} </li>
        <li> Email: ${customer.email} </li>
    </ul>
</body>
</html>
