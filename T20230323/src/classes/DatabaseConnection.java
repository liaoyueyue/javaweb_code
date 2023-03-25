package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-23
 * Time: 21:22
 */
public class DatabaseConnection {
    public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/yootk";
    public static final String USER = "root";
    public static final String PASSWORD = "123456";

//    利用ThreadLocal实现不同线程的数据库连接存储，这样当前线程就可以通过getConnection()获取一个数据库连接，shiyongclose()即可关闭连接是就会将ThreadLoacal中的相关对象删除
    public static final ThreadLocal<Connection> THREAD_LOCAL = new ThreadLocal<>();

    private DatabaseConnection() {
        super();
    }

    //获取新的数据库连接
    private static Connection rebuildConnection() {
        Connection connection = null;
        try {
            Class.forName(DBDRIVER);
            connection = DriverManager.getConnection(DBURL, USER, PASSWORD);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    //获取数据库连接
    public static Connection getConnection() {
        Connection connection = THREAD_LOCAL.get(); //获取当前线程连接
        if (connection == null) {
            connection = rebuildConnection();
            THREAD_LOCAL.set(connection);
        }
        return connection;
    }

    //关闭数据库连接
    public static void close() {
        Connection connection = THREAD_LOCAL.get();
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            THREAD_LOCAL.remove();  //删除对象
        }
    }
}
