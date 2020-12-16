<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 倪云锋
  Date: 2020/12/8
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
添加/插入学生<br/>
<%--pageContext.request.contextPath是根目录http://localhost:8080/--%>
<form action="${pageContext.request.contextPath}/student/save" method="post">
    学生姓名:<input name="stuName"/><br/>
    学生性别:<input name="stuSex" type="radio" value="0"/>男,
    <input name="stuSex" type="radio" value="1"/>女<br/>
    学生状态:<input name="stuStatus" type="radio" value="1">在校,
    <input name="stuStatus" type="radio" value="0"/>离校<br/>
    班主任：<select name="teaId">
    <option value="">请选择班主任</option>
    <c:forEach var="teacher" items="${teacherList}">
        <option value="${teacher.teaId}">${teacher.teaName}</option>
    </c:forEach>
</select>
    <input type="submit" value="提交">
</form>
</body>
</html>
