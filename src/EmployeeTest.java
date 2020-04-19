
import java.io.*;

public class EmployeeTest {
    public static void main(String[] args)
    {
        Employee empOne = new Employee("RUNOOB1", 26, "High Level Programer", 20000.0);
        Employee empTwo = new Employee("RUNOOB2", 16, "Low Level Programer", 10000.0);

        empOne.PrintEmployee();
        System.out.println();
        empTwo.PrintEmployee();
    }
}