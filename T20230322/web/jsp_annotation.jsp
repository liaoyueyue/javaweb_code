<%--
  Created by IntelliJ IDEA.
  User: liaoyueyue
  Date: 2023/3/22
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP程序注释定义</title>
</head>
<body>
<!--  HTML comment -->
<%-- 此为JSP中才可以使用的注释，为隐式注释，不会发送到客户端浏览器之中 --%>
<% //Java 注释，此处用于编写Java程序代码，智能定义在Scriptlet代码中
    out.println("<h1>www.yootk.com</h1>");  //输出HTML代码
%>
<h1><%="沐言科技: www.yootk.com"%>
</h1>
</body>
</html>
