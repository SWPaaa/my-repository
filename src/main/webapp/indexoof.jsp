<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/9/10
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%--isELIgnored是否忽略设置EL表达式，为ture像 ${..}这样的直接会原样输出，不会进行EL表达式运算，为false就会进行EL表达式运算，如果不设置默认为false--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Index</h1>
    <table>
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${list}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>
                    <a href="/user/deleteById/${user.id}">删除</a>
                    <a href="/user/findById/${user.id}">修改</a>
                    <a href="/save.jsp">插入</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
