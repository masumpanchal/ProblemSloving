import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//Code for finding Min Max and Avg Salary using data from sql
public class MinMaxAvgSql {
    public static void main(String[] args){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Operation7381");

            //Code for Min Salary
            //String q = "select `Emp-City`, min(`Emp-Salary`) from employee.table1 group by `Emp-City`";

            //Code for Max Salary
            //String q = "select `Emp-City`, max(`Emp-Salary`) from employee.table1 group by `Emp-City`";

            //code for Avg Salary
            String q = "select `Emp-City`, avg(`Emp-Salary`) from employee.table1 group by `Emp-City`";

            Statement stmt= con.createStatement();
            ResultSet set = stmt.executeQuery(q);

            while (set.next()){
                String city = set.getString(1);
                double salary = set.getDouble(2);
                System.out.println(city+ " "+salary);
            }
            con.close();


        } catch (Exception e) {
        e.printStackTrace();
        }

    }
}
