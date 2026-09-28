import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {

    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeGrouping {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Ravi", "IT", 50000),
                new Employee(2, "Anitha", "IT", 60000),
                new Employee(3, "Priya", "HR", 45000),
                new Employee(4, "Arjun", "HR", 55000)
        );

        Map<String, Double> averageSalary =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                e -> e.department,
                                Collectors.averagingDouble(e -> e.salary)
                        ));

        System.out.println(averageSalary);
    }
}
