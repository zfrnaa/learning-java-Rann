package one.company;

public class Programmer extends Employee {
    private String programmingLang;
    private String projectManagerName;

    public Programmer(String name, String address, String email, String hpNumber,
                      double salary, String programmingLang, String projectManagerName) {
        super(name, address, email, hpNumber, salary);
        this.programmingLang = programmingLang;
        this.projectManagerName = projectManagerName;
    }

    public String getProgrammingLang() {
        return programmingLang;
    }

    /*public void setProgrammingLang(String programmingLang) {
        this.programmingLang = programmingLang;
    }*/

    public String getProjectManager() {
        return projectManagerName;
    }

    /*public void setProjectManager(String projectManagerName) {
        this.projectManagerName = projectManagerName;
    }*/
}
