<%--
  Created by IntelliJ IDEA.
  User: Nikolay
  Date: 16.01.2021
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Underground music</title>
</head>
<body>
    Hello from jsp
    <c:forEach items="${trackList}" var="track">
        <tr>
            <td>${track.name}</td>
            <td>${track.autrhorId}</td>
        </tr>
    </c:forEach>
</body>
</html>
