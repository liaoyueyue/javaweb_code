import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-06-07
 * Time: 22:38
 */

class Score {
    public ArrayList<Integer> scores;
}

class Student {
    public int studentId;
    public String studentName;
    public Score score;
}


@WebServlet("/json")
public class JsonServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //假设请求body的格式为{ studentID = 10, studentName = "张三" }
        // jackson 提供核心类 ObjectMapper
        // 方法 readValue 把json格式转化为java对象
        // 方法 writeAsString 把java对象转化为json格式的字符串
        ObjectMapper objectMapper = new ObjectMapper();
        //readValue 第一个参数可以是字符串也可以是输入流
        //第二个参数是一个类对象需要解析结构的类对象
        Student student = objectMapper.readValue(req.getInputStream(), Student.class);
        System.out.println(student.studentId);
        System.out.println(student.studentName);
        System.out.println(student.score.scores);

        resp.setContentType("text/html; charset=utf8");
        resp.getWriter().write(student.studentId + "," + student.studentName + "," + student.score.scores);
        resp.getWriter().write("\n");

        resp.setContentType("application/json; charset=utf8");
//        objectMapper.writeValue(resp.getWriter(), student);
        resp.getWriter().write(objectMapper.writeValueAsString(student));
    }
}
