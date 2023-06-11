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
 * Date: 2023-06-09
 * Time: 21:13
 */
@WebServlet("/status")
public class StatusServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        约定，浏览器 query string 传个参数过来
//        如果type = 1返回200，2返回404， 3返回50，其他返回504
        String type = req.getParameter("type");
        if (type.equals("1")) {
            resp.setStatus(200);
        } else if (type.equals("2")) {
            resp.setStatus(404);
        } else if (type.equals("3")) {
            resp.setStatus(500);
        }else {
            resp.setStatus(504);
        }

    }
}
