<%--
  Created by IntelliJ IDEA.
  User: liaoyueyue
  Date: 2023/3/22
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<html>
<head>
    <title>错误页</title>
</head>
<body>
<%--程序处理不当产生异常，如果没有进行异常处理就是将所有的异常输出。这是非常不安全的。--%>
<%
  int result = 10/0;
%>
</body>
</html>
