package one.company;

public class Promoter extends Employee {
    private double totalCommission;
    private double totalSales;

    public Promoter(String name, String address, String email, String hpNumber, double salary,
                    double totalCommission, double totalSales)
    {
        super(name, address, email, hpNumber, salary);
        this.totalCommission = totalCommission;
        this.totalSales = totalSales;
    }

    public double getTotalCommission() {
        return totalCommission;
    }

    /*public void setTotalCommission(double totalCommission) {
        this.totalCommission = totalCommission;
    }*/

    public double getTotalSales() {
        return totalSales;
    }

    /*public void setTotalSales(double totalSales)
    {
        this.totalSales = totalSales;
    }*/
}
