package ru.geekbrains.lesson3;

public class Program {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Surname1", "Name1", 50000);
        Employee employee2 = Employee.getInstance();
        System.out.println(employee2);
    }
}
