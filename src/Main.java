import java.util.Scanner;

public class Main {
    public static void printAllEmployees (Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            Employee value = employee[i];
            System.out.println(value);
        }
    }
    public static int sumSalary(Employee[] employee) {
        int sumSalary = 0;
        for(int i = 0; i < employee.length; i++) {
            sumSalary += employee[i].getSalary();
        }
        return sumSalary;
    }
    public static String findEmployeeWithMinSalary(Employee[] employee) {
        int minSalary = employee[0].getSalary();
        String employeeWithMinSalary = employee[0].getName();
        for (int i = 0; i < employee.length; i++) {
            if (minSalary > employee[i].getSalary()) {
                minSalary = employee[i].getSalary();
                employeeWithMinSalary = employee[i].getName();
            }
        }
        return employeeWithMinSalary;
    }
    public static String findEmployeeWithMaxSalary(Employee[] employee) {
        int maxSalary = employee[0].getSalary();
        String employeeWithMaxSalary = employee[0].getName();
        for (int i = 0; i < employee.length; i++) {
            if (maxSalary < employee[i].getSalary()) {
                maxSalary = employee[i].getSalary();
                employeeWithMaxSalary = employee[i].getName();
            }
        }
        return employeeWithMaxSalary;
    }
    public static int calculateAverageSalary(Employee[] employee) {
        int averageSalary;
        int sumSalary = sumSalary(employee);
        averageSalary = sumSalary / employee.length;
        return averageSalary;
    }
    public static void printAllEmployeesName (Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getName());
        }
    }
//    public static void indexSalary (Employee[] employee) {
//        System.out.println("Введите аргумент индексирования зарплаты в %:");
//        Scanner scanner = new Scanner(System.in);
//        int index = scanner.nextInt();
//        int i;
//        for (i = 0; i < employee.length; i++) {
//            int indexSalary = employee[i].getSalary() + (employee[i].getSalary() * index)/100;
//            employee[i].setSalary(indexSalary);
//        }
//    }
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

        printAllEmployees(employee);
        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary(employee));
        System.out.println("Сотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary(employee));
        System.out.println("Сотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary(employee));
        System.out.println("Среднее значение зарплат:  " + calculateAverageSalary(employee));
        printAllEmployeesName(employee);
//        indexSalary(employee);
//        printAllEmployees(employee);
    }
}