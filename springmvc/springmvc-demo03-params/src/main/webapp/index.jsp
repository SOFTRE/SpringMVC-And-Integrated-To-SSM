<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/14 0014
  Time: 09:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>基本数据类型和字符串类型</h1>
<a href="/user/add?name=张三&age=18">基本数据类型和字符串类型</a>
<h1>JavaBean</h1>
<form method="post" action="/user/account">
    账户id:<input type="text" name="id">
    账户名称:<input type="text" name="name">
    账户金额:<input type="text" name="money">
    省份名称:<input type="text" name="address.provinceName">
    城市名称:<input type="text" name="address.cityName">
    <input type="submit">
</form>
<h1>List</h1>
<form method="post" action="/user/list">
    用户名：<input type="text" name="username">
    密码： <input type="password" name="password">
    年龄： <input type="text" name="age">
    账户id[1]:<input type="text" name="accounts[0].id">
    账户名称[1]:<input type="text" name="accounts[0].name">
    账户金额[1]:<input type="text" name="accounts[0].money">
    省份名称[1]:<input type="text" name="accounts[0].address.provinceName">
    城市名称[1]:<input type="text" name="accounts[0].address.cityName">
    <input type="submit">
</form>
<h1>Map</h1>
<form method="post" action="/user/map">
    用户名：<input type="text" name="username">
    密码： <input type="password" name="password">
    年龄： <input type="text" name="age">
    账户id[1]:<input type="text" name="accountMap['zs'].id">
    账户名称[1]:<input type="text" name="accountMap['zs'].name">
    账户金额[1]:<input type="text" name="accountMap['zs'].money">
    省份名称[1]:<input type="text" name="accountMap['zs'].address.provinceName">
    城市名称[1]:<input type="text" name="accountMap['zs'].address.cityName">
    <input type="submit">
</form>
<h1>自定义类型转换</h1>
<a href="/user/myParam?date=2019-10-14&name=张三">自定义类型转换</a>
</body>
</html>
