import entity.Student;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/experiment3/StudentServlet")
public class StudentServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private static final String URL = "jdbc:mysql://localhost:3306/temp?characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 获取请求参数
        request.setCharacterEncoding("utf8");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        int age = Integer.parseInt(request.getParameter("age"));
        String major = request.getParameter("major");

        // 封装学生信息
        Student student = new Student(name, gender, age, major);
        System.out.println("封装学生信息 = " + student);

        // 添加学生信息到数据库
        insertStudent(student);

        // 获取数据库中学生信息
        List<Student> students = getStudents();
        System.out.println("数据库中学生对象 = " + students);
        request.setAttribute("students", students);// 将查询结果存储到request对象中
        response.setContentType("text/html; charset=utf8");
        request.getRequestDispatcher("show.jsp").forward(request, response);// 转发到show.jsp页面

        // 跳转到显示所有学生信息的页面
        response.sendRedirect("show.jsp");
    }

    private void insertStudent(Student student) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // 加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 获取数据库连接
            conn = DriverManager.getConnection(URL, USER, PASSWORD);

            // 创建PreparedStatement对象
            String sql = "INSERT INTO student(name, gender, age, major) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, student.getName());
            pstmt.setString(2, student.getGender());
            pstmt.setInt(3, student.getAge());
            pstmt.setString(4, student.getMajor());

            // 执行SQL语句
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("学生插入成功");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private List<Student> getStudents() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Student> students = new ArrayList<Student>();

        try {
            // 加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 获取数据库连接
            conn = DriverManager.getConnection(URL, USER, PASSWORD);

            // 创建PreparedStatement对象
            String sql = "SELECT * FROM student";
            pstmt = conn.prepareStatement(sql);

            // 执行SQL语句
            rs = pstmt.executeQuery();

            // 处理查询结果
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setGender(rs.getString("gender"));
                student.setAge(rs.getInt("age"));
                student.setMajor(rs.getString("major"));
                students.add(student);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return students;
    }

}

