<%--
  Created by IntelliJ IDEA.
  User: liaoyueyue
  Date: 2023/3/22
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>结构定义Scriptlet</title>
</head>
<body>
<%--结构定义Scriptlet--%>
<%!
  public static final String MESSAGE = "www.yootk.com";
  public int count = 0;
%><%!
  public int sum(int ... args) {
    int all = 0;
    for (int num:
         args) {
      all += num;
    }
    return all;
  }
%><%!
  class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
      this.title = title;
      this.author = author;
      this.price = price;
    }

    @Override
    public String toString() {
      return "Book{" +
              "title='" + title + '\'' +
              ", author='" + author + '\'' +
              ", price=" + price +
              '}';
    }
  }
%>

<%--代码编写Scriptlet--%>
<%
  out.println("<h1>" + MESSAGE + "</h1>");
  out.println("<h1>count = " + (count++) + "</h1>");
  out.println("<h1>1 + 2 + 3 = " + sum(1, 2, 3) + "</h1>");
  out.println("<h1>" + new Book("JavaWeb", "Yootk", 99.8) + "</h1>");

%>
</body>
</html>
