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

    public static void printAllEmployees (Employee[] employee) {
        for (Employee value : employee) {
            System.out.println(value);
        }
    }

    public static int sumSalary(Employee[] employee) {
        int sumSalary = 0;
        for(int i = 0; i < employee.length; i++) {
            sumSalary += employee[i].salary;
        }
        return sumSalary;
    }

    public static String findEmployeeWithMinSalary(Employee[] employee) {
        int minSalary = employee[0].salary;
        String employeeWithMinSalary = employee[0].name;
        for (int i = 0; i < employee.length; i++) {
            if (minSalary > employee[i].salary) {
                minSalary = employee[i].salary;
                employeeWithMinSalary = employee[i].name;
            }
        }
        return employeeWithMinSalary;
    }

    public static String findEmployeeWithMaxSalary(Employee[] employee) {
        int maxSalary = employee[0].salary;
        String employeeWithMaxSalary = employee[0].name;
        for (int i = 0; i < employee.length; i++) {
            if (maxSalary < employee[i].salary) {
                maxSalary = employee[i].salary;
                employeeWithMaxSalary = employee[i].name;
            }
        }
        return employeeWithMaxSalary;
    }

    public static int calculateAverageSalary(Employee[] employee) {
        int averageSalary;
        int sumSalary = Employee.sumSalary(employee);
        averageSalary = sumSalary / employee.length;
        return averageSalary;
    }

    public static void printAllEmployeesName (Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].name);
        }
    }

//    public static void indexSalary (Employee[] employee) {
//        System.out.println("Введите аргумент индексирования зарплаты в %:");
//        Scanner scanner = new Scanner(System.in);
//        int index = scanner.nextInt();
//        int i;
//        for (i = 0; i < employee.length; i++) {
//            employee[i].salary = employee[i].salary * (1 + index/100);
//            employee[i].setSalary(employee[i].salary);
//            System.out.println(employee);
//        }
//    }

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
