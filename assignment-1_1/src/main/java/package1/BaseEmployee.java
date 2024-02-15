package main.java.package1;

public class BaseEmployee extends Employee{
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String ssn, double baseSalary) {
        super(firstName, lastName, ssn);
        this.baseSalary = baseSalary;
    }
    
    public double getBaseSalary(){return this.baseSalary;}

    public void setBaseSalary(double newBaseSalary){this.baseSalary = newBaseSalary;}
}
