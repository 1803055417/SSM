<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>静态资源的加载</title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/static.css">
    <script src="${pageContext.request.contextPath}/js/static.js"></script>
</head>
<body>


<div>

    静态资源的加载

</div>


<img src="${pageContext.request.contextPath}/images/timg.jpg"/>

</body>
</html>
