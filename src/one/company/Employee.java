//created by zafran

package one.company;

public class Employee
{// Private variables to store the employee's name, address, email, phone number, and salary.
    private String name;
    private String address;
    private String email;
    private String hpNumber;
    private double salary;

    // Constructor to initialize the employee's private variables.
    public Employee(String name, String address, String email, String hpNumber, double salary)
    {
        this.name = name;
        this.address = address;
        this.email = email;
        this.hpNumber = hpNumber;
        this.salary = salary;
    }

    // Getter method for the employee's name.
    public String getName()
    {
        return name;
    }

    // Setter method for the employee's name. Incase want to change value
    /*public void setName(String name) {
        this.name = name;
    }*/

    // Getter method
    public String getAddress()
    {
        return address;
    }

    // Setter method. Incase want to change value
    /*public void setAddress(String address) {
        this.address = address;
    }*/

    // Getter method
    public String getEmail()
    {
        return email;
    }

    // Setter method. Incase want to change value
    /*public void setEmail(String email) {
        this.email = email;
    }*/

    // Getter method
    public String getHpNumber()
    {
        return hpNumber;
    }

    // Setter method. Incase want to change value
    /*public void setHpNumber(String hpNumber)
    {
        this.hpNumber = hpNumber;
    }*/

    // Getter method
    public double getSalary()
    {
        return salary;
    }

    // Setter method. Incase want to change value
    /*public void setSalary(double salary) {
        this.salary = salary;
    }*/
}
