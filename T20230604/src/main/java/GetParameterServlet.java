import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-06-07
 * Time: 20:44
 */

@WebServlet("/getParameter")
public class GetParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取 query string 中的键值对
        // 假如浏览器的请求 ?studentId=10&studentName=张三
        String studentId = req.getParameter("studentId");
        String studentName = req.getParameter("studentName");
        System.out.println("studentId = " + studentId);
        System.out.println("studentName = " + studentName);

        resp.setContentType("text/html; charset=utf8");
        resp.getWriter().write(studentId + "," + studentName);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取 query string 中的键值对
        // 假如浏览器的请求 ?studentId=10&studentName=张三
        req.setCharacterEncoding("utf8");
        String studentId = req.getParameter("studentId");
        String studentName = req.getParameter("studentName");
        System.out.println("studentId = " + studentId);
        System.out.println("studentName = " + studentName);

        resp.setContentType("text/html; charset=utf8");
        resp.getWriter().write(studentId + "," + studentName);
    }
}
