<%--
  Created by IntelliJ IDEA.
  User: 郑泽
  Date: 2019/3/29
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty description}">
    ${description.description}
</c:if>
<c:if test="${empty description}">
    数据为空，请检查数据！
</c:if>
</body>
</html>
