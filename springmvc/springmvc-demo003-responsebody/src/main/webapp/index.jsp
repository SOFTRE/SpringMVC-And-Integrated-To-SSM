<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/14 0014
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<h1>三,响应json</h1>
<input id="btnId" type="button" value="发送Ajax请求"/><br/>
<script src="js/jquery.min.js"></script>
<script>
    $(function () {
        $("#btnId").click(function () {
            $.post("response/testJson",{name:"zs",age:18},function (result) {
                alert("result="+result.name+result.age);
            },"json");
        });
    });
</script>
</body>
</html>
