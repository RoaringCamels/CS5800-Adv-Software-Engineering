package main.java.package1;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hoursWorked) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public double getWage(){return wage;}
    public double getHoursWorked(){return hoursWorked;}
    
    public void setWage(double newWage){this.wage = newWage;}
    public void setHoursWorked(double newHoursWorked){this.hoursWorked = newHoursWorked;}
}
