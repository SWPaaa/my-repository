<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/9/11
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/update" method="post">
    <input type="text" name="id" value="${user.id}" readonly><br><%--readonly只读（不可修改）--%>
    <input type="text" name="name" value="${user.name}"><br>
    <input type="submit">
</form>
</body>
</html>
