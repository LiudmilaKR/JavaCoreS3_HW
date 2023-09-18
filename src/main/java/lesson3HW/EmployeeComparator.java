package lesson3HW;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int res = o1.getSurName().compareTo(o2.getSurName());
        if (res == 0) {
            if (o1.getName().compareTo(o2.getName()) == 0) {
                return Double.compare(o1.getSalary(), o2.getSalary());
            } else return o1.getName().compareTo(o2.getName());
        }
        return res;
    }
}
