<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023/3/27
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<%!
    public static final String LOGIN_URL = "loginCheck.jsp";
%>
<form action="<%=LOGIN_URL%>" method="post">
    <fieldset>
        <legend>
            <h5>用户登录</h5>
        </legend>

        <div>
            <div>
                <label >用户名</label>
                <div >
                    <input type="text" id="mid" name="mid" placeholder="请输入用户注册的ID编号" required>
                </div>
                <div >
                    <span id="midSpan"></span>
                </div>
            </div>

            <div >
                <label >密码</label>
                <div >
                    <input type="password" id="password" name="password" placeholder="请输入密码" required>
                </div>
                <div >
                    <span id="passwordSpan"></span>
                </div>
            </div>

            <div >
                <div >
                    <button type="submit" class="btn btn-primary btn-sm">登录</button>
                    <button type="reset" class="btn btn-primary btn-sm">重置</button>
                </div>
            </div>

        </div>
    </fieldset>
</form>
</body>
</html>
