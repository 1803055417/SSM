<%--
  Created by IntelliJ IDEA.
  User: 倪云锋
  Date: 2020/12/8
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<c:if test="${not empty LOGIN_USER}">
    您好，欢迎${LOGIN_USER.username}使用XXX系统！
    <a href="${pageContext.request.contextPath}/logout">退出</a><br/>
</c:if>
<c:if test="${empty LOGIN_USER}">
    <a href="${pageContext.request.contextPath}/login">登录</a><br/></c:if>
<a href="${pageContext.request.contextPath}/city/list">城市管理</a><br/>
<a href="${pageContext.request.contextPath}/student/list">学生管理</a><br/>
<a href="${pageContext.request.contextPath}/teacher/list">教师管理</a><br/>
<a href="${pageContext.request.contextPath}/static">静态资源下载</a><br/>
</body>
</html>
