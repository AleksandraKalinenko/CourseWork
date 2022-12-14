import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];

        employee[0] = new Employee("Иванов Иван Иванович", 2, 30_000);
        employee[1] = new Employee("Петров Петр Петрович", 1, 25_000);
        employee[2] = new Employee("Васильев Василий Васильевич", 3, 40_000);
        employee[3] = new Employee("Скворцов Андрей Витальевич", 4, 37_000);
        employee[4] = new Employee("Шипилова Мария Сергеевна", 5, 34_000);
        employee[5] = new Employee("Сидоров Иван Васильевич", 2, 28_000);
        employee[6] = new Employee("Торопов Николай Викторович", 1, 42_000);
        employee[7] = new Employee("Сорокина Анастасия Дмитриевна ", 4, 35_000);
        employee[8] = new Employee("Шишкина Екатерина Алексеевна ", 5, 29_000);
        employee[9] = new Employee("Бобров Александр Семенович ", 3, 45_000);

        Employee.printAllEmployees(employee);
        System.out.println("Сумма затрат на зарплаты в месяц: " + Employee.sumSalary(employee));
        System.out.println("Сотрудник с минимальной зарплатой: " + Employee.findEmployeeWithMinSalary(employee));
        System.out.println("Сотрудник с максимальной зарплатой: " + Employee.findEmployeeWithMaxSalary(employee));
        System.out.println("Среднее значение зарплат: " + Employee.calculateAverageSalary(employee));
        Employee.printAllEmployeesName(employee);
//        System.out.println("Введите аргумент индексирования зарплаты в %:");
//        Scanner scanner = new Scanner(System.in);
//        int index = scanner.nextInt();
//        Employee.indexSalary(index);

    }
}