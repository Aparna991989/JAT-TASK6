package javapackage;

public class Employee {
    // Attributes
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to raise salary by a given percentage
    public void raiseSalary(double percent) {
        if (percent > 0) {
            this.salary += this.salary * (percent / 100);
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Aparna", 50000);
        emp.displayEmployeeDetails();

        System.out.println("\nRaising salary by 10%...");
        emp.raiseSalary(10);
        emp.displayEmployeeDetails();
    }
}
