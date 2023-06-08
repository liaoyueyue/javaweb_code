<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>计算结果页面</title>
</head>
<body>
<%-- 获取从input.html提交过来的两个数 --%>
<%
    int num1 = Integer.parseInt(request.getParameter("num1"));
    int num2 = Integer.parseInt(request.getParameter("num2"));

    int sum = num1 + num2;
%>

<h1>计算结果：</h1>
<p><%= num1 %> + <%= num2 %> = <%= sum %></p>
</body>
</html>

