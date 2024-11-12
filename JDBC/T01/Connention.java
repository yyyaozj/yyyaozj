package JDBC.T01;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connention {
    // 数据库 URL、用户名和密码
    private static final String URL = "jdbc:mysql://localhost:3306/book"; // 替换为你的数据库名
    private static final String USER = "root"; // 替换为你的数据库用户名
    private static final String PASSWORD = "123"; // 替换为你的数据库密码

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // 1. 注册 JDBC 驱动
   //         Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. 打开连接
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("连接成功！");

            // 3. 创建一个 Statement 对象来执行 SQL 查询
            statement = connection.createStatement();
            String sql = "SELECT id, name FROM your_table_name"; // 替换为你的表名
            resultSet = statement.executeQuery(sql);

            // 4. 处理结果集
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch ( Exception e) {
            e.printStackTrace();
        } finally {
            // 5. 关闭资源
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
