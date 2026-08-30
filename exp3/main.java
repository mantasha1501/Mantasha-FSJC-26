import java.util.Scanner;
import java.util.InputMismatchException;

// -------------------------------------------------------------
// Base Class: Person
// -------------------------------------------------------------
class Person {
    private String name;
    private int age;
    private String gender;
    private String address;

    public Person(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Address: " + this.address);
    }
}

// -------------------------------------------------------------
// Derived Class 1: Employee (inherits from Person)
// -------------------------------------------------------------
class Employee extends Person {
    private int empID;
    private String department;
    private String designation;
    private double salary;

    public Employee(String name, int age, String gender, String address, 
                    int empID, String department, String designation, double salary) {
        super(name, age, gender, address);
        this.empID = empID;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID: " + this.empID);
        System.out.println("Department: " + this.department);
        System.out.println("Designation: " + this.designation);
        System.out.println("Salary: $" + this.salary);
    }
}

// -------------------------------------------------------------
// Derived Class 2: Manager (inherits from Employee)
// -------------------------------------------------------------
class Manager extends Employee {
    private String branch;
    private String managerLevel;

    public Manager(String name, int age, String gender, String address, 
                   int empID, String department, String designation, double salary, 
                   String branch, String managerLevel) {
        super(name, age, gender, address, empID, department, designation, salary);
        this.branch = branch;
        this.managerLevel = managerLevel;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Branch: " + this.branch);
        System.out.println("Manager Level: " + this.managerLevel);
    }
}

// -------------------------------------------------------------
// Public Main Class (Entry Point)
// -------------------------------------------------------------
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            // Collect Personal Details
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // Clear buffer

            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            // Collect Employment Details
            System.out.print("Enter Employee ID: ");
            int empID = sc.nextInt();
            sc.nextLine(); // Clear buffer

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Designation: ");
            String designation = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); // Clear buffer

            // Collect Manager Details
            System.out.print("Enter Branch: ");
            String branch = sc.nextLine();

            System.out.print("Enter Manager Level: ");
            String managerLevel = sc.nextLine();

            System.out.println("\n--- Output Details ---");
            Manager m1 = new Manager(name, age, gender, address, empID, department, designation, salary, branch, managerLevel);
            m1.display();

        } catch (InputMismatchException e) {
            System.out.println("Input Error: Please enter numbers only for Age, Employee ID, and Salary.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
