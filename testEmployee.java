import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class testEmployee {
    public static void main(String[] args){
        employee emp1 = new employee();
        employee emp2 = new employee();
        employee emp3 = new employee();
        employee emp4 = new employee();
        employee emp5 = new employee();
        employee emp6 = new employee();

        emp1.setName("Chirag");
        emp1.setAge(45);
        emp1.setCity("Ahemdabad");
        emp1.setSalary(60000);

        emp2.setName("Ronak");
        emp2.setAge(45);
        emp2.setCity("Mumbai");
        emp2.setSalary(55000);

        emp3.setName("Masum");
        emp3.setAge(25);
        emp3.setCity("Pune");
        emp3.setSalary(50000);

        emp4.setName("Shree");
        emp4.setAge(60);
        emp4.setCity("Mumbai");
        emp4.setSalary(61000);

        emp5.setName("Joy");
        emp5.setAge(23);
        emp5.setCity("Ahemdabad");
        emp5.setSalary(45000);

        emp6.setName("Vanshi");
        emp6.setAge(65);
        emp6.setCity("Mumbai");
        emp6.setSalary(75000);

        List<employee> empList= new ArrayList<>();

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);

        // List of find max, min and avg salary for each city. (with java 8 streams)

        //code for finding maximum salary
        Map<String, employee> collect = empList.stream().collect(Collectors.groupingBy(e -> e.getCity(), Collectors.collectingAndThen(Collectors.maxBy((o1, o2) -> o1.getSalary() - o2.getSalary()), Optional::get)));

        //code for finding Minimum Salary
        Map<String, employee> collect1 = empList.stream().collect(Collectors.groupingBy(e -> e.getCity(), Collectors.collectingAndThen(Collectors.minBy((o1, o2) -> o1.getSalary() - o2.getSalary()), Optional::get)));

        //code for finding Avg Salary
        Map<String,Double> avg = empList.stream().collect(Collectors.groupingBy(employee::getCity,Collectors.averagingDouble(employee::getSalary)));

        System.out.println(collect);
        System.out.println(collect1);
        System.out.println(avg);

    }
}
