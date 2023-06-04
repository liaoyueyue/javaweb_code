<%@ page import="classes.DatabaseConnection" %>
<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: liaoyueyue
  Date: 2023/3/23
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JavaBean定义与使用</title>
    <style>
        table, td, th {
            border: solid 0.5px;
        }
    </style>
</head>
<body>
<%--为提高代码的可重用性，往往会将一些重复执行的代码封装在类结构之中，而这样的类也被称为JavaBean.--%>
<%--所有的Web项目中*.class文件都需要保存在Web-INF/classes目录中--%>

<%
    String sql = "select no, name, loc from dept limit 501";
    Connection connection = DatabaseConnection.getConnection();
    PreparedStatement statement = connection.prepareStatement(sql);
    ResultSet resultSet = statement.executeQuery();
%>
<table id="spacing_table" >
    <thead>
    <tr>
        <th>部门编号</th>
        <th>部门名词</th>
        <th>部门位置</th>
    </tr>
    </thead>
    <tbody>
    <%
        while (resultSet.next()) {
            long no = resultSet.getLong("no");
            String name = resultSet.getString("name");
            String loc = resultSet.getString("loc");
    %>
    <tr>
        <td><%=no%></td>
        <td><%=name%></td>
        <td><%=loc%></td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>
<%
    DatabaseConnection.close();
%>
</body>
</html>
