package lesson3HW;

import java.util.ArrayList;
import java.util.List;

public class ListEmployee {
    /**
     * Список сотрудников
     */
    private List<Employee> listEmployee;
    /**
     * Конструктор списка сотрудников
     */
    public ListEmployee() { this.listEmployee = new ArrayList<>(); }

    /**
     * Добавление сотрудников из готового списка
     * @param num число добавляемых сотрудников
     */
    public void add (int num) {
        for (int i = 0; i < num; i++) {
            int a = Employee.random.nextInt(2);
            if (a == 0) listEmployee.add(Freelancer.getInstance());
            else listEmployee.add(Worker.getInstance());
        }
    }
    /**
     * Печать списка сотрудников
     */
    public void printListEmployee() {
        System.out.println("Список сотрудников");
        for (Employee item : listEmployee) {
            System.out.println(item);
        }
    }
}
