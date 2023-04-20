import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjdbc", "root", "arafath221158");
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from people");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//import java.sql.*;
//
//public class MyJDBC {
//    public static void main(String[] args) {
//
//        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjdbc", "root", "arafath221158");
//            Statement statement = connection.createStatement();
//
//            ResultSet resultSet = statement.executeQuery("select * from people");
//
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("name"));
//            }
//
//        } catch (SQLException e) {
//            if (e.getSQLState().equals("28000")) {
//                System.out.println("Access denied. Invalid username or password.");
//            } else {
//                e.printStackTrace();
//            }
//        }
//    }
//}
