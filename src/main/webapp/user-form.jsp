<%--
  Created by IntelliJ IDEA.
  User: Bhargav
  Date: 23-06-2021
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Employee</title>
  <link rel="stylesheet"
        href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

<header>
  <nav class="navbar navbar-expand-md navbar-dark"
       style="background-color: blue">
    <div>
      Employee Database
    </div>
    <%=request.getContextPath()%>
    <ul class="navbar-nav">
      <li><a href="<%=request.getContextPath()%>/list"
             class="nav-link">Users</a></li>
    </ul>
    <ul class="navbar-nav">
      <li><a href="<%=request.getContextPath()%>/insert"
             class="nav-link">Add User</a></li>
    </ul>
  </nav>
</header>
<br>

</body>
</html>