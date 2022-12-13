import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Query {
    public static void main(String[] args){
        try {

            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Operation7381");

            //create a query

            String q = "select * from table1";

            // get the PreparedStatement object
            Statement stmt= con.createStatement();
            ResultSet set = stmt.executeQuery(q);

            while (set.next()){
                int id = set.getInt(1);
                String name= set.getString(2);
                String city = set.getString(3);
                int salary = set.getInt(4);
                int age = set.getInt(5);
                System.out.println(id  + " " + name + " "+ city + " " + salary + " " + age);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

