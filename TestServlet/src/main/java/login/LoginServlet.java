package login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-06-11
 * Time: 23:25
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 从请求中获取到页面提交的用户名和密码
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // 2. 验证用户名和密码是否正确
        // 为简便此处改成硬编码
        if ("user".equals(username) && "123".equals(password)) {
            //登录成功
            // a) 创建一个会话，用户刚登录是没有会话的，重新分配一个会话给用户
            // getSession()
            //  * 创建 sessionId 和 HttpSession 对象
            //  * 把这两个内容以键值对的形式插入到内存的哈希表中
            //  * 把sessionId 通过 Set-Cookie 写到响应中
            HttpSession session = req.getSession(true);
            // 随意设置键值对（HttpSession 对象自身也相当于是一个 哈希表)
            session.setAttribute("username", "user");
            // b) 让响应重定向到主页
            resp.sendRedirect("index");
        } else {
            //登录失败
            resp.setStatus(403);
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("登录失败，用户名或者密码错误");
        }

    }
}
