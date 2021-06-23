<%--
  Created by IntelliJ IDEA.
  User: Bhargav
  Date: 23-06-2021
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<form action="addUser" method="post">
    <label for="name">Name: </label>
    <input type="text" name="name" id="name" /><br>
    <label for="email">Email: </label>
    <input type="email" name="email" id="email" /><br>
    <label for="country">Country: </label>
    <input type="text" name="country" id="country" /><br>
    <input type="submit" value="Add User" />
</form>
</body>
</html>
