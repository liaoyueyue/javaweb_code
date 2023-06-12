package upload;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-06-12
 * Time: 21:46
 */
@WebServlet("/uploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Part part = req.getPart("myfile");
        System.out.println(part.getSubmittedFileName());
        System.out.println(part.getSize());
        System.out.println(part.getContentType());
        part.write("C:/Users/liaoyueyue/Desktop/UploadPicture.jpg");
        resp.setContentType("text/html; charset=utf8");
        resp.getWriter().write("<h1>提交文件 " + part.getSubmittedFileName() + " 成功</h1>");
    }
}
