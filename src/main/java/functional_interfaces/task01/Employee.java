package functional_interfaces.task01;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class Employee implements Comparable<Employee> {
    private UUID id;
    private String name;
    private double salary;

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }
}
