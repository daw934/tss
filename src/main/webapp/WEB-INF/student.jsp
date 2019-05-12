
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border-collapse: collapse;
            width: 50%;
        }

        td, th {
            border: 1px solid #dddddd;
        }

        tr:nth-child(even) {
        background-color: #dddddd;
        }
    </style>
</head>
<body>
<div>
    <table>
        <tr>
        <th>FirstName</th>
        <th>Lastname</th>
        <th>Action</th>
        </tr>
<c:forEach items="${studentList}" var="student">
    <tr>
        <td>${student.name}</td>
        <td>${student.lastName}</td>
        <td><form action="/student/delete" method="GET">
            <input type ="hidden" name="id" value="${student.id}"/><br/>
            <input type="submit" value="Delete" />
        </form></td>
    </tr>
</c:forEach>
    </table>
</div>
<div>
    <a href="/studentForm">add student</a><br>
    <a href="/">return to main page</a>
</div>

</body>
</html>
