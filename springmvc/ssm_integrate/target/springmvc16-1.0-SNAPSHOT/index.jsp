<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/17 0017
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>查询所有用户</h1>
<a href="account">查询</a>
<h1>添加用户</h1>
<form method="post" action="account">
    name:<input type="text" name="name">
    money:<input type="text" name="money">
    <input type="submit" value="添加">
</form>
</body>
</html>
