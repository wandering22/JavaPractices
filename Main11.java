//import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //System.out.println(Driver.class);
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/java14?useSSL=false&characterEncoding=utf8";
        String user = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, user, password);

        //System.out.println(connection);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {

            String sql = scanner.nextLine();
            if (sql.equalsIgnoreCase("quit"))
                break;

//            Statement statement = connection.createStatement();
//            int 受到影响的行数 =  statement.executeUpdate(sql);
//            System.out.println("受到影响的行数是： " + 受到影响的行数);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            for (int i = 0; i < columnCount; i++) {
                String columnName = metaData.getColumnName(i + 1);
                System.out.println(columnName + "");
            }
            System.out.println();

            while (rs.next()) {
                for (int i = 0; i < columnCount; i++) {
                    String value = rs.getString(i + 1);
                    System.out.println(value + "");
                }
                System.out.println();
            }
            statement.close();
        }
            connection.close();

        }
    }

