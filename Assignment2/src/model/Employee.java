package model;

public class Employee {

    private int id;
    private String name;
    private double salary;

    private static int employeeCount = 0;
    private static int nextId = 1000;
    private static double totalSalary = 0;

    public static String companyName = "TechCorp";

    // constructor
    public Employee(String name, double salary) {
        this.id = nextId;
        nextId++;

        this.name = name;
        this.salary = salary;

        employeeCount++;
        totalSalary += salary;
    }

    // getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {

        totalSalary -= this.salary;

        this.salary = salary;

        totalSalary += this.salary;
    }

    // static methods
    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static double getTotalSalary() {
        return totalSalary;
    }

    public static double getAverageSalary() {

        if (employeeCount == 0) {
            return 0;
        }

        return totalSalary / employeeCount;
    }
}
