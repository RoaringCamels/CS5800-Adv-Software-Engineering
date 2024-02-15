package main.java.package1;
public class Employee{
    private String firstName;
    private String lastName;
    private String ssn;

    public Employee (String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getSSN(){return ssn;}

    public void setFirstName(String newFirstName){this.firstName = newFirstName;}
    public void setLastName(String newLastName){this.lastName = newLastName;}
    public void setSSN(String newSSN){this.ssn = newSSN;}
}
