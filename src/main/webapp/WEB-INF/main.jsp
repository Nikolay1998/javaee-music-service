<%--
  Created by IntelliJ IDEA.
  User: Nikolay
  Date: 14.01.2021
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Music Service</title>
</head>
<body>
    <c:forEach items="${trackList}" var="track">
        <tr>
            <td>${track.name}</td>
            <td>${track.author.name}</td>
            <td>${track.year}</td>
        </tr>
    </c:forEach>
</body>
</html>
