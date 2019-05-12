<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: drzes
  Date: 10.05.2019
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Student</h1>
<form action="/student" method="post">
    <input name="name" placeholder="name" /><br/>
    <input name="lastName" placeholder="lastName" /><br/>
    <input type="submit" value="Add" />
</form>
<a href="/main">return to main page</a>
</body>
</html>
