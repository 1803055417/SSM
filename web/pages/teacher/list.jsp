<%--
  Created by IntelliJ IDEA.
  User: 倪云锋
  Date: 2020/12/10
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>教师管理</title>
    <style>
        div {
            width: 1000px;
            margin: 0 auto;
        }
    </style>
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/js/datePicker/WdatePicker.js"></script>

<script>
    function del(id) {
        //弹窗确认是否删除
        if (confirm("确认执行删除吗?")){
            //执行删除
            window.location.href="${pageContext.request.contextPath}/teacher/delete?teaId="+id;
        }
    }
    function  delBatch() {
        if($("[name=\"teaIds\"]:checked").length > 0){
            //说明用户至少选择了一项
            if(confirm("确认删除这批教师吗？操作一旦提交不可撤消！")){
                //提交批量删除
                $("#teaForm").submit();

            }

        }else{
            //说明用户一项都没选
            alert("请选择一项进行删除！");
        }
    }
/*全选、取消*/
$(function () {
        $("#selectAll").click(function () {
            // $("[name=\"teaIds\"]").prop("checked",this.checked);
            /*jQuery*/
            $("[name=\"teaIds\"]").prop("checked",$(this).prop("checked"));
        });



    });
</script>
</head>
<body>
<table width="1000" border="1" cellpadding="0" cellspacing="0" style="margin: 0 auto;">
    <tr>
        <td><input type="checkbox" id="selectAll"/>全选/取消</td><br/>
        <td>教师id</td>
        <td>教师姓名</td>
        <td>教师性别</td>
        <td>教师年龄</td>
    </tr>
<form action="${pageContext.request.contextPath}/teacher/list1" modelAttribute="teacher">
   <%-- 教师姓名：<input name="teaName" value="${param.teaName}"/><br/>
    教师性别：<input name="teaSex" type="radio" value="" ${empty param.teaSex?"checked='checked'":" "}/>不限
    <input name="teaSex" type="radio" value="" ${empty param.teaSex?"checked='checked'":" "} />男
    <input name="teaSex" type="radio" value="" ${empty param.teaSex?"checked='checked'":" "} />女<br/>
    教师年龄：<input name="teaAge" value="${param.teaAge}"/><br/>--%>
    <%--springform的表单回填--%>

       教师姓名：<input name="teaName" value="${teacher.teaName}"/><br/>
       教师性别：
       <input name="teaSex" type="radio" value="" ${empty teacher.teaSex ?"checked='checked'":""}/>不限,
       <input name="teaSex" type="radio" value="男" ${ teacher.teaSex  eq "男" ?"checked='checked'":""}/>男，
       <input name="teaSex" type="radio" value="女" ${ teacher.teaSex  eq "女" ?"checked='checked'":""}/>女<br/>
       教师年龄：<%--<input name="teaAge" value="${teacher.teaAge}"/>--%>
       <input name="teaAgeBegin" value="${teacher.teaAgeBegin}"/>到 <input name="teaAgeEnd" value="${teacher.teaAgeEnd}"/>岁<br/>
       入职时间：<input name="teaDateBegin" value="${teacher.teaDateBegin}" class="Wdate" onclick="WdatePicker();" readonly="readonly"/>到
       <input name="teaDateEnd" value="${teacher.teaDateEnd}" class="Wdate" onClick="WdatePicker();" readonly="readonly"/> <br/>
       <input type="submit" value="查询"/>
</form>

<a href="${pageContext.request.contextPath}/teacher/edit">教师添加</a>
<a href="javascript:delBatch();">批量删除</a><br/>

<%--<input type="checkbox" id="selectAll"/>全选/取消<br/>--%>
<form id="teaForm" action="${pageContext.request.contextPath}/teacher/deleteBatch" method="post">
    <c:forEach var="teacher" items="${teacherList}">
    <%-- <input type="checkbox" name="teaIds" value="${teacher.teaId}"/>--%>
        <tr>
            <td><input type="checkbox" name="teaIds" value="${teacher.teaId}"/></td>
            <td>${teacher.teaId}</td>
            <td>${teacher.teaName}</td>
            <td>${teacher.teaSex}</td>
            <td>${teacher.teaAge}</td>
            <td><a href="${pageContext.request.contextPath}/teacher/edit?teaId=${teacher.teaId}">修改</a></td>
            <td><a href="javascript:del(${teacher.teaId});">删除</a><br/></td>
        <br/>
        </tr>
    </c:forEach>
</form>
</table>
当面第${pager.no}页,总共${pager.totalPageNo}页,总共条${pager.totalRowCount}记录
<%--如果当前页号是1的话，就去首页--%>
<c:if test="${pager.no ne 1}">
    <a href="${pageContext.request.contextPath}/teacher/list?no=1">首页</a>
</c:if>

<c:if test="${pager.no eq 1}">
    首页
</c:if>
<%--是首页就不让点上一页--%>
<c:if test="${pager.no ne 1}">
    <a href="${pageContext.request.contextPath}/teacher/list?no=${pager.no-1}">上一页</a>
</c:if>
<c:if test="${pager.no ne pager.totalPageNo}"><a href="${pageContext.request.contextPath}/teacher/list?no=${pager.no+1}">下一页</a> </c:if>
<c:if test="${pager.no eq pager.totalPageNo}">
    下一页
</c:if>
<c:if test="${pager.no ne pager.totalPageNo}">
    <a href="${pageContext.request.contextPath}/teacher/list?no=${pager.totalPageNo}">尾页</a>
</c:if>
<c:if test="${pager.no eq pager.totalPageNo}"> 尾页</c:if>
<%--去 <input />页

去<select>

    <option value="1">1</option>

</select>页--%>
</body>
</html>
