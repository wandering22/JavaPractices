import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;

public class 查找同学 {
    private static DataSource dataSource;

    public static void main(String[] args) {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setServerName("127.0.0.1");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("");
        mysqlDataSource.setDatabaseName("java14_0321");
        mysqlDataSource.setCharacterEncoding("utf8");
        mysqlDataSource.setUseSSL(false);

        dataSource = mysqlDataSource;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("请输入要查找的姓名> ");
            String name = scanner.nextLine();

            findStudent(name);
        }
    }

    private static void findStudent(String name) {
        try (Connection connection = dataSource.getConnection()) {
            /*
            String sql = String.format(
                    "SELECT id, name, class_name FROM students WHERE name = '%s'", name
            );
            System.out.printf("要执行的 SQL 是 |%s|%n", sql);
            */
            // ? 是占位符
            String sql = "SELECT id, name, class_name FROM students WHERE name = ?";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {

                // 把占位符进行替换
                statement.setString(1, name);
                try (ResultSet rs = statement.executeQuery()) {
                    while (rs.next()) {
                        System.out.println(rs.getString(1));
                        System.out.println(rs.getString(2));
                        System.out.println(rs.getString(3));
                    }
                    System.out.println("=====================");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
