
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
    <%
        String name = request.getParameter("username");
    %>
    <h1>Welcome <%= name %></h1>
</body>
</html>
