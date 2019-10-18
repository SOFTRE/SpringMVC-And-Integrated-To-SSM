<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/14 0014
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试</title>
</head>
<body>
<h1>@RequestParam</h1>
<a href="/user/param?username=王五">测试RequestParam</a>
<h1>@RequestBody</h1>
<form action="/user/body" method="post">
    用户名：<input type="text" name="username">
    密码：<input type="password" name="password">
    <input type="submit" value="测试RequestBody">
</form>
</body>
</html>
