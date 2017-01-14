<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2017. 1. 9.
  Time: 오전 2:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LoginForm</title>
</head>
<body>
    <form action="doLogin" method="get">
        <label for="customerId"> Customer ID(id001, id002, id003, id004, id005): </label>
        <input id="customerId" type="text" name="customerId" /> <br/>
        <input type="submit" value="press" />
    </form>
</body>
</html>
