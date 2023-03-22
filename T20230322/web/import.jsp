<%--
  Created by IntelliJ IDEA.
  User: liaoyueyue
  Date: 2023/3/22
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.time.*, java.util.*" %>
<%@ page import="java.time.format.*" %>
<html>
<head>
    <title>导入包</title>
</head>
<body>
<%!
  //  定义公共的日期格式化格式
  public static final DateTimeFormatter FORMATTER =
                      DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
%>
<%
  List<String> all = new ArrayList<String>(){
      {
          this.add("2006-10-10 21:21:21");
          this.add("2008-08-08 20:08:08");
      }
  };
    for (String str:
         all) {
        try {
            LocalDateTime dateTime = LocalDateTime.parse(str, FORMATTER);
            ZoneId zoneId = ZoneId.systemDefault();
            Instant instant = dateTime.atZone(zoneId).toInstant();
            Date date = Date.from(instant);
%>
            <h1>字符串转日期：<%=date%></h1>
<%
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
%>

</body>
</html>
