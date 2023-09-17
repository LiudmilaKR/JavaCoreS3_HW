package ru.geekbrains.lesson3;

import java.util.Random;

public class Employee {
    protected static String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
    protected static String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
    private static Random random = new Random();
    private static int counter = 1000;
    /**
     * табельный номер сотрудника
     */
    private int id;
    /**
     * Имя  сотрудника
     */
    private String name;
    /**
     * Фамилия  сотрудника
     */
    private String surName;
    /**
     * Ставка заработной платы  сотрудника
     */
    private double salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * секция инициализации
     * кодовый блок, который всегда выполняется перез вызовом конструктора
     */
    {
        id = ++counter;
    }

    /**
     * Создаем конструкторы
     * Всегда есть конструктор по умолчанию
     * Конструкторы можно перегружать
     * this - указывает на экземляр текущего класса
     */
    private Employee() {
        this("#SurName#", "#Name#");
    }
    private Employee(String surName, String name) {
        this(surName, name, 30000);
//        this.surName = surName;
//        this.name = name;
    }
    public Employee(String name, String surname, double salary) {
        if (salary < 30000) {
            throw new RuntimeException("Уровень заработной платы должен быть не ниже 30.000");
        }
        this.name = name;
        this.surName = surname;
        this.salary = salary;
    }

    /**
     * Служебный метод для создания сотрудника, если, например, все конструкторы "private"
     * Пример фабричного метода
     * @return
     */
    public static Employee getInstance() {
        return new Employee(surNames[random.nextInt(surNames.length)],
                names[random.nextInt(surNames.length)],
                random.nextInt(30000, 250000));
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
