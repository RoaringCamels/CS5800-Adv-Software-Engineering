package main.java.package1;

public class CommissionEmployee extends Employee{
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String ssn, double commissionRate, double grossSales) {
        super(firstName, lastName, ssn);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getCommissionRate(){return this.commissionRate;}
    public double getGrossSales(){return this.grossSales;}
    
    public void setCommissionRate(double newCommissionRate){this.commissionRate = newCommissionRate;}
    public void setGrossSales(double newGrossSales){this.grossSales = newGrossSales;}
}
