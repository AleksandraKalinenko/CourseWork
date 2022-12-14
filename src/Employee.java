import org.w3c.dom.css.Counter;

import java.util.Scanner;

public class Employee {
    private String  name;
    private int section;
    private int salary;
    private static int counter;
    private int id = 1;

    public Employee(String name, int section, int salary) {
        this.name = name;
        this.section = section;
        this.salary = salary;
        id = id + counter++;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", ФИО: " + name + ", Отдел: " + section + ", Зарплата: " + salary;
    }

    public String getName() {
        return name;
    }

    public int getSection() {
        return section;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
