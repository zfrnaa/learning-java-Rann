package one.company;

public class Employee {
    private String name;
    private String address;
    private String email;
    private String hpNumber;
    private double salary;

    public Employee(String name, String address, String email, String hpNumber, double salary) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.hpNumber = hpNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    public String getAddress() {
        return address;
    }

    /*public void setAddress(String address) {
        this.address = address;
    }*/

    public String getEmail() {
        return email;
    }

    /*public void setEmail(String email) {
        this.email = email;
    }*/

    public String getHpNumber() {
        return hpNumber;
    }

    /*public void setHpNumber(String hpNumber)
    {
        this.hpNumber = hpNumber;
    }*/

    public double getSalary() {
        return salary;
    }

    /*public void setSalary(double salary) {
        this.salary = salary;
    }*/
}
