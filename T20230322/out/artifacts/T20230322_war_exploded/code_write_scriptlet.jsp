<%--
  Created by IntelliJ IDEA.
  User: liaoyueyue
  Date: 2023/3/22
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>在Scriptlet中编写代码</title>
</head>
<body>
<%-- 代码编写Scriptlet --%>
<%
    StringBuffer buffer = new StringBuffer();
    buffer.append("www.yootk.com");
    out.println("<h1>" + buffer + "</h1>");
%>
</body>
</html>
