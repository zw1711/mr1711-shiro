<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/28
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>部门管理系统</h1>

    <shiro:hasPermission name="department:save">
        <a href="/department/save">部门增加系统</a>
    </shiro:hasPermission>

    <br>
    <shiro:hasPermission name="department:delete">
        <a href="/department/delete">部门删除系统</a>
    </shiro:hasPermission>

    <br>
    <shiro:hasPermission name="department:update">
        <a href="/department/update">部门修改系统</a>
    </shiro:hasPermission>


</body>
</html>
