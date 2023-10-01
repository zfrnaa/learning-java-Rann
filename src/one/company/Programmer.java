//created by zafran

package one.company;

public class Programmer extends Employee
{
    // Private variable to store the programming language and project manager's name
    private String programmingLang;
    private String projectManagerName;

    // Constructor to initialize the programmer's private variables.
    public Programmer(String name, String address, String email, String hpNumber,
                      double salary, String programmingLang, String projectManagerName)
    {
        // Call the constructor of the `Employee` class to initialize the employee's
        // private variables.
        super(name, address, email, hpNumber, salary);

        // Initialize the `programmingLang` and `projectManagerName` private variables.
        this.programmingLang = programmingLang;
        this.projectManagerName = projectManagerName;
    }

    // Getter method
    public String getProgrammingLang()
    {
        return programmingLang;
    }

    // Setter method
    /*public void setProgrammingLang(String programmingLang) {
        this.programmingLang = programmingLang;
    }*/

    // Getter method
    public String getProjectManager()
    {
        return projectManagerName;
    }

    // Setter method
    /*public void setProjectManager(String projectManagerName) {
        this.projectManagerName = projectManagerName;
    }*/
}
