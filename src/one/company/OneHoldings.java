//created by zafran - 20212022 q2

//get java file from one/company/ folder
package one.company;

import java.util.Locale;
import java.util.Scanner;

public class OneHoldings
{
    //set to final for repeating strings
    private static final String PROMPT_ADDRESS = "Enter Address: ";
    private static final String PROMPT_EMAIL = "Enter Email: ";
    private static final String PROMPT_NUMBER = "Enter Phone number: ";
    private static final String PROMPT_SALARY = "Enter Salary: ";

    private static Employee promptForEmployeeDetails()
    {
        // Create a scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user for the employee's name
        System.out.print("Name of the employee: ");
        String name = input.nextLine();

        // Prompt the user for the employee's address
        System.out.print(PROMPT_ADDRESS);
        String address = input.nextLine();

        // Prompt the user for the employee's email address
        System.out.print(PROMPT_EMAIL);
        String email = input.nextLine();

        // Prompt the user for the employee's phone number
        System.out.print(PROMPT_NUMBER);
        String hpNumber = input.nextLine();

        // Prompt the user for the employee's salary
        System.out.print(PROMPT_SALARY);
        double salary = input.nextDouble();

        input.nextLine();
        // Create an object of the appropriate type
        Employee emp;
        System.out.print("Employee Type (programmer/promoter): ");
        String type = input.nextLine();
        if (type.equals("programmer"))
        {
            System.out.print("Programming Language: ");
            String programmingLang = input.nextLine();
            System.out.print("Project Manager Name: ");
            String projectManager = input.nextLine();
            emp = new Programmer(name, address, email, hpNumber, salary, programmingLang,
                                 projectManager);
        } else if (type.equals("promoter"))
        {
            System.out.print("Total Commission: ");
            double totalCommission = input.nextDouble();
            System.out.print("Total Sales: ");
            double totalSales = input.nextDouble();
            emp = new Promoter(name, address, email, hpNumber, salary, totalCommission, totalSales);
        } else
        {
            emp = null;
        }
        return emp;
    }

    //set to private, so it can only be accessed inside OneHoldings
    //encapsulation
    private static void printEmployeeDetails(Employee emp)
    {
        // Print employee fields
        System.out.println("\nName: " + emp.getName());
        System.out.println("Address: " + emp.getAddress());
        System.out.println("Email: " + emp.getEmail());
        System.out.println("Phone Number: " + emp.getHpNumber());
        System.out.println("Salary: " + emp.getSalary());

        if (emp instanceof Programmer p)
        {
            //Programmer p = (Programmer) emp;
            System.out.println("Language: " + p.getProgrammingLang());
            System.out.println("Manager: " + p.getProjectManager());

        } else if (emp instanceof Promoter p)
        {
            //Promoter p = (Promoter) emp;
            System.out.println("Commission: " + p.getTotalCommission());
            System.out.println("Sales: " + p.getTotalSales());
        }
    }

    public static void main(String[] args)
    {
        // Get employee details
        Employee emp = promptForEmployeeDetails();

        // Print employee details
        if (emp != null)
        {
            printEmployeeDetails(emp);
        }
    }
}
