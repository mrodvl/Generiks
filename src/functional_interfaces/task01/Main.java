package functional_interfaces.task01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                Employee.builder().name("Clark").id(UUID.randomUUID()).salary(100000.0).build(),
                Employee.builder().name("Andrew").id(UUID.randomUUID()).salary(200000.0).build(),
                Employee.builder().name("Blake").id(UUID.randomUUID()).salary(150000.0).build()
        );

        Collections.sort(employees, new EmployeeNameComparator());
        System.out.println(employees);
    }
}
