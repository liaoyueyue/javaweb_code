<%--
  Created by IntelliJ IDEA.
  User: liaoyueyue
  Date: 2023/3/22
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表达式输出Scriptlet</title>
</head>
<body>
<%--由于JSP程序需要进行大量程序计算结果的输出，为了便于数据输出显示，可使用表达式输出Scriptlet结构，利用该结构可以方便的实现变量内容的输出--%>
<%!
  public static final String MESSAGE = "www.yootk.com";
%>
<%--注意：表达式输出语句为一个独立的Scriptlet结构，该结构不允许嵌套在其他Scriptlet之中--%>
<h1><%=MESSAGE%></h1> <%-- 输出全局常量 --%>
<h1><%="edu.yootk.com"%></h1> <%-- 输出字符串常量 --%>
</body>
</html>
