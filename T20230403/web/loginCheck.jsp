<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>test</title>
</head>
<body>
<%@page pageEncoding="UTF-8" %>
<%@page import="com.yootk.dbc.DatabaseConnection" %>
<%@page import="java.sql.*" %>
<%
    String mid = request.getParameter("mid");
    String password = request.getParameter("password");
    String sql = "select name from users where mid = ? and password = ?";
    PreparedStatement statement = DatabaseConnection.getConnection().prepareStatement(sql);
    statement.setString(1, mid);
    statement.setString(2, password);
    ResultSet resultSet = statement.executeQuery();
    String name = null;
    if (resultSet.next()) {
        name = resultSet.getString("name");
    }
    statement.close();
    DatabaseConnection.close();
    if (name == null) {
%> <h1>用户登录失败，用户名错误或者密码错误</h1>
<% } else { %>
<h1>用户登录成功</h1>
<% }%>
</body>
</html>