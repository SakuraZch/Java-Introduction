
import java.io.*;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;
    
    
    // constructor of class "Employee"
    public Employee(String name, int age, String designation, double salary)
    {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    // print message inside
    public void PrintEmployee()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}