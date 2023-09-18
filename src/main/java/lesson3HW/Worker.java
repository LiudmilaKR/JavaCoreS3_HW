package lesson3HW;

import java.util.ArrayList;
import java.util.List;

public class Worker extends Employee {
    /**
     * Конструкто рабочего
     * @param name имя  рабочего
     * @param surName фамилия  рабочего
     * @param salary ставка заработной платы  рабочего
     */
    public Worker(String name, String surName, double salary) {
        super(name, surName, salary);
    }
    /**
     * Расчет среднемесячной заработной платы = фиксированная месячная оплата
     * @return
     */
    @Override
    public double calculateSalary() {
        return super.getSalary();
    }
    /**
     * Создание нового сотрудника из списков имен и фамилий с произвольной зп
     * @return новый сотрудник-рабочий
     */
    public static Employee getInstance(){
        return new Worker (
                names[random.nextInt(surNames.length)],
                surNames[random.nextInt(surNames.length)],
                random.nextInt(30000, 150000));
    }
    /**
     * Создание заполненного списка новых сотрудников
     * @param count количество создаваемых сотрудников
     * @return список новых сотрудников-рабочих
     */
    public static List<Employee> getEmployees(int count){
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < count; i++)
            employees.add(getInstance());
        return employees;
    }
    /**
     * Вывод на печать сотрудника-рабочего
     * @return формат вывода
     */
    @Override
    public String toString() {
        return String.format("id=%d Worker %s %s, зп = %.1f",
                super.getId(), super.getSurName(), super.getName(), calculateSalary());
    }
}
