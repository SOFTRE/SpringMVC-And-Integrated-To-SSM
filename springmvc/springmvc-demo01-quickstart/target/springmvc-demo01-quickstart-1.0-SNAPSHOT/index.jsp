<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/13 0013
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HelloSpringMVC</title>
</head>
<body>
<a href="hello">跳转</a>
<a href="${pageContext.request.contextPath}/hello">刷新</a>
</body>
</html>
