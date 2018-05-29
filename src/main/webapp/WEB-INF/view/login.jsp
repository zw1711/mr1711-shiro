<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/25
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登录页面</h1>

    <form href="/login" method="post">
        ${errorMsg}
        <br>
        用户名:<input name="username">
        <br>
        密码:<input type="password" name="password">
        <br>
        <input type="submit" value="提交">

    </form>
</body>
</html>
