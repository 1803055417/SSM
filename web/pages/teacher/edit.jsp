<%--
  Created by IntelliJ IDEA.
  User: 倪云锋
  Date: 2020/12/10
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>添加教师</title>
</head>
<body>
添加教师<br/>
<%--
<form action="${pageContext.request.contextPath}/teacher/save" method="post">

    <input name="teaId" type="hidden" value="${teacher.teaId}"/>

    教师姓名： <input name="teaName" value="${teacher.teaName}"/><br/>
    教师性别：
    <input name="teaSex" type="radio" value="男" ${teacher.teaSex eq "男" ? "checked='checked'" : ""} />男,
    <input name="teaSex" type="radio" value="女" ${teacher.teaSex eq "女" ? "checked='checked'" : ""}/>女<br/>
    教师年龄： <input name="teaAge" value="${teacher.teaAge}"/><br/>

    <input type="submit" value="提交"/>


</form>--%>
<%--简化版 不用写el表达式 path是name--%>
<f:form action="${pageContext.request.contextPath}/teacher/save" modelAttribute="teacher">
    <f:hidden path="teaId"/>
    教师姓名：<f:input path="teaName"/><br/>
    教师性别：
    <f:radiobutton path="teaSex" value="男" label="男"/>
    <f:radiobutton path="teaSex" value="女" label="女"/><br/>
    教师年龄:<f:input path="teaAge"/><br/>
    <input type="submit" value="提交"/>
</f:form>
</body>
</html>
