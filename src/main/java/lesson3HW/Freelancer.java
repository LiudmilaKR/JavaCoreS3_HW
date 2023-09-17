package lesson3HW;

import ru.geekbrains.lesson3V2.Worker;

import java.util.ArrayList;
import java.util.List;

public class Freelancer extends Employee {
    public Freelancer(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    /**
     * Расчет среднемесячной заработной платы = 20.8 * 8 * почасовая ставка
     * @return
     */
    @Override
    public double calculateSalary() {
        return 20.8 * 8 * super.getSalary();
    }

    /**
     * Создание нового сотрудника из списков имен и фамилий с произвольной зп
     * @return новый сотрудник-фрилансер
     */
    public static Employee getInstance(){
        return new Freelancer (
                names[random.nextInt(surNames.length)],
                surNames[random.nextInt(surNames.length)],
                random.nextDouble(300.0, 1500.0));
    }

    /**
     * Создание заполненного списка новых сотрудников
     * @param count количество создаваемых сотрудников
     * @return список новых сотрудников-фрилансеров
     */
    public static List<Employee> getEmployees(int count){
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < count; i++)
            employees.add(getInstance());
        return employees;
    }

    /**
     * Вывод на печать сотрудника-фрилансера
     * @return формат вывода
     */
    @Override
    public String toString() {
        return String.format("id=%d Freelancer %s %s, зп = %.1f",
                super.getId(), super.getSurName(), super.getName(), calculateSalary());
    }
}
