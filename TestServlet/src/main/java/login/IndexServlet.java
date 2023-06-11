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
 * Time: 23:43
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 首页中也获取session，此处的session正是登录页中的session，登录逻辑创建成功的
        // 此处 参数 写作 false, 不新建，如果不存在就返回 null 就行
        HttpSession session = req.getSession(false);
        if (session == null) {
            resp.setStatus(403);
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("您还没有登录，请登录后操作");
            return;
        }
        String username = (String) session.getAttribute("username");


        resp.setContentType("text/html; charset=utf8");
        resp.getWriter().write("欢迎来到主页," + username);

    }
}
