import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SqlDemo {
        public static void main(String[] args){
            try {
                //load the driver
                Class.forName("com.mysql.jdbc.Driver");

                //create a connection
                String url = "jdbc:mysql://localhost:3306/employee";
                String username = "root";
                String password = "Operation7381";
                Connection con= DriverManager.getConnection(url,username,password);

                //create a query

                String q = "create table table1(tID int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400), tAge int(60))";

                // Create a Statement
                Statement stmt= con.createStatement();
                stmt.executeUpdate(q);

                System.out.println("Table Created....");
                con.close();

                if (con.isClosed()){
                    System.out.println("Connection is closed");
                }else {
                    System.out.println("Connection created.....");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
