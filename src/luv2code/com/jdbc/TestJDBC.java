package luv2code.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC{
    public static void main(String[] args) {
        String jdbc = "jdbc:mysql://localhost:3306";
        String user ="hanna";
        String pas = null;

        try{
            System.out.println("Connecting to database " + jdbc);

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hbsrudent?useSSL=false","root","password");

            System.out.println("Successful!" + connection);

        } catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
