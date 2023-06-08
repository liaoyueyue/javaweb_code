<%@ page import="java.util.List" %>
<%@ page import="entity.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>学生信息</title>
</head>
<body>
<h1>学生信息</h1>
<table>
  <tr>
    <th>编号</th>
    <th>姓名</th>
    <th>性别</th>
    <th>年龄</th>
    <th>专业</th>
  </tr>
  <% for (Student student : (List<Student>) request.getAttribute("students")) { %>
  <tr>
    <td><%= student.getId() %></td>
    <td><%= student.getName() %></td>
    <td><%= student.getGender() %></td>
    <td><%= student.getAge() %></td>
    <td><%= student.getMajor() %></td>
  </tr>
  <% } %>
</table>
</body>
</html>

