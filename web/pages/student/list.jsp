<%--
  Created by IntelliJ IDEA.
  User: 倪云锋
  Date: 2020/12/8
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生管理</title>
    <style>
        div {
            width: 1000px;
            margin: 0 auto;
        }
    </style>
</head>
<body>
<a href="${pageContext.request.contextPath}/student/add">学生添加</a><br/>
<table width="1000" border="1" cellpadding="0" cellspacing="0" style="margin: 0 auto;">
    <tr>
        <td>学生id</td>
        <td>学生id</td>
        <td>学生姓名</td>
        <td>学生性别</td>
        <td>学生状态</td>
        <td>教师id</td>
    </tr>
<c:forEach var="student" items="${studentList}">
    <tr>
        <td>${student.stuId}</td>
        <td>${student.stuName}</td>
        <td> ${student.stuSex eq 0 ? "男" : "女"}</td>
        <td>${student.stuStatus eq 0 ? "离校" : "在校"}</td>
        <td>${student.teaId}</td>
    </tr>
    <%--根据stuId删除 修改--%>
    <a href="${pageContext.request.contextPath}/student/edit?stuId=${student.stuId}">修改</a>
    <a href="${pageContext.request.contextPath}/student/del?stuId=${student.stuId}">删除</a>
    <br/>
</c:forEach>
</table>
</body>
</html>
