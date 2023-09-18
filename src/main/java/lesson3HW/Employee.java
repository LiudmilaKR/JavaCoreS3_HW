package lesson3HW;

import java.util.Random;

public abstract class Employee {
    protected static Random random = new Random();
    private static int counter = 1000;
    protected static String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
    protected static String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };


    //region Fields
    /**
     * табельный номер сотрудника
     */
    private int id;
    /**
     * Имя сотрудника
     */
    private String name;
    /**
     * Фамилия сотрудника
     */
    private String surName;
    /**
     * Ставка заработной платы сотрудника
     */
    private double salary;
    //endregion

    //region Getters and Setters
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
    //endregion

    //region Constructors And Initializers
    /**
     * секция инициализации табельного номера
     */
    {
        id = ++counter;
    }

    /**
     * Конструктор по умолчанию
     */
    public Employee() {
        this("#name#", "#serName#", 0);
    }

    /**
     * Конструктор
     * @param name имя сотрудника
     * @param surName фамилия сотрудника
     * @param salary ставка заработной платы сотрудника
     */
    public Employee(String name, String surName, double salary) {
        if (salary < 0){
            throw new RuntimeException("Заработная плата не может быть отрицательной.");
        }
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }
    // endregion

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();
}
