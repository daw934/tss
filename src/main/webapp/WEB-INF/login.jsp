<%--
  Created by IntelliJ IDEA.
  User: drzes
  Date: 02.04.2019
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<form action="j_security_check" method="GET">
    First Name: <input type="text" name="j_username">
    Last Name: <input type="password" name="j_password"/>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>
