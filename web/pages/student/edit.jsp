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
    <title>更新修改</title>
</head>
<body>
<%--   点击后去这@RequestMapping("saveUpdate")--%>
<form action="${pageContext.request.contextPath}/student/saveUpdate" method="post">
    <%--等同于update stu set stuName=? where stuId=? ID必须有才能修改--%>
<input name="stuId" type="hidden" value="${student.stuId}"/>
学生姓名:<input name="stuName" value="${student.stuName}"/><br/>
    <%--${student.stuSex eq 0?"checked='checked'":""} 是为了修改的时候弹出页面的时候里面有值--%>
学生性别:<input name="stuSex"  type="radio" value="0" ${student.stuSex eq 0?"checked='checked'":""}/>男,
<input name="stuSex"  type="radio" value="1" ${student.stuSex eq 1?"checked='checked'":""}/>女<br/>

学生状态:<input name="stuStatus" type="radio" value="1" ${student.stuStatus eq 1 ? "checked='checked'":""}/>在校,
<input name="stuStatus" type="radio" value="0" ${student.stuStatus eq 0 ? "checked='checked'":""}/>离校<br/>
        班主任:<select name="teaId">
        <option value="">请选择班主任</option>
        <c:forEach var="teacher" items="${teacherList}">

      <option value="${teacher.teaId}" ${student.teaId eq teacher.teaId ? "selected='selected'" : ""} >${teacher.teaName}</option>
        </c:forEach>

        </select>

        <input type="submit" value="提交"/>
</form>
</body>
</html>
