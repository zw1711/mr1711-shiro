<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/28
  Time: 15:08
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
    <title>employee</title>
</head>
<body>

    <h1>员工管理页面</h1>


    <shiro:hasPermission name="employee:save">
        <a href="/employee/save">员工增加系统</a>
    </shiro:hasPermission>

    <br>
    <shiro:hasPermission name="employee:delete">
        <a href="/employee/delete">员工删除系统</a>
    </shiro:hasPermission>

    <br>
    <shiro:hasPermission name="employee:update">
        <a href="/employee/update">员工修改系统</a>
    </shiro:hasPermission>


</body>
</html>
