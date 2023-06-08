import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/experiment2/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("user") && password.equals("123")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", "用户");
            response.sendRedirect("welcome.html");
        } else {
//            response.sendRedirect("login.html");
            // 登录失败，弹出提示框并重定向到login.html页面
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('用户名或密码错误，将重定向到login.html！');window.location.href='login.html';</script>");
        }
    }
}

