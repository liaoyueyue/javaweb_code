import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-06-06
 * Time: 21:33
 */

@WebServlet("/showRequest")
public class ShowRequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(req.getProtocol());
        stringBuilder.append("\n");
        stringBuilder.append(req.getMethod());
        stringBuilder.append("\n");
        stringBuilder.append(req.getRequestURI());
        stringBuilder.append("\n");
        stringBuilder.append(req.getContextPath());
        stringBuilder.append("\n");
        stringBuilder.append(req.getQueryString());
        stringBuilder.append("\n");

        //header
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            String value = req.getHeader(name);
            stringBuilder.append(name + ": " + value);
            stringBuilder.append("\n");
        }

        resp.getWriter().write(stringBuilder.toString());
    }
}
