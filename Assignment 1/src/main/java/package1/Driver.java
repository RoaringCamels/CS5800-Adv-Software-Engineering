package main.java.package1;

public class Driver {
    public static void main(String[] args) {
        SalariedEmployee joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee nicole = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        SalariedEmployee renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommissionEmployee mahaz = new CommissionEmployee("Mahaz", "Vaziri", "777-77-7777", 0.22, 40000);

        printInfo(joe);
        printInfo(stephanie);
        printInfo(mary);
        printInfo(nicole);
        printInfo(renwa);
        printInfo(mike);
        printInfo(mahaz);
    }

    private static void printInfo(Employee employee){
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Social Security Number: " + employee.getSSN());

        
        if (employee instanceof SalariedEmployee) {
            System.out.println("Weekly Salary: $" + ((SalariedEmployee) employee).getWeeklySalary());
        } else if (employee instanceof HourlyEmployee) {
            HourlyEmployee hourlyEmployee = (HourlyEmployee) employee;
            System.out.println("Wage: $" + hourlyEmployee.getWage());
            System.out.println("Hours Worked: " + hourlyEmployee.getHoursWorked());
        } else if (employee instanceof CommissionEmployee) {
            CommissionEmployee commissionEmployee = (CommissionEmployee) employee;
            System.out.println("Commission Rate: " + commissionEmployee.getCommissionRate());
            System.out.println("Gross Sales: $" + commissionEmployee.getGrossSales());
        } else if (employee instanceof BaseEmployee) {
            System.out.println("Base Salary: $" + ((BaseEmployee) employee).getBaseSalary());
        }

        System.out.println("------------------------------------");
    }
}
