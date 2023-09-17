package lesson3HW;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int a = Employee.random.nextInt(2);
            if (a == 0) employees.add(Freelancer.getInstance());
            else employees.add(Worker.getInstance());
        }
        for (Employee item : employees) {
            System.out.println(item);
        }
    }
}
