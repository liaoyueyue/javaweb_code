<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: liaoyueyue
  Date: 2023/3/22
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>整合MySQL数据库</title>
    <style>
        #spacing_table, td, th {
            border: 0.5px solid;
        }

        td, th {
            padding: 5px;
        }

        th {
            background-color: yellow;
        }

        #spacing_table {
            border-spacing:0px;
            width: 100%;
        }

    </style>
</head>
<body>
<%!
    public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/yootk";
    public static final String USER = "root";
    public static final String PASSWORD = "123456";
%>
<%
    String sql = "select no, name, loc from dept limit 501";
    Class.forName(DBDRIVER);
    Connection connection = DriverManager.getConnection(DBURL, USER, PASSWORD);
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
    try {
        statement.close();
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        statement = null;
        connection = null;
    }
%>
</body>
</html>
