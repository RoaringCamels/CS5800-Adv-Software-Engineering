package main.java.package3;

public class Instructor {
    private String firstName;
    private String lastName;
    private String officeNum;

    public Instructor(String firstName, String lastName, String officeNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNum = officeNum;
    }

    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public String getOfficeNum(){return this.officeNum;}

    public void setFirstName(String newFirstName){this.firstName = newFirstName;}
    public void setLastName(String newLastName){this.lastName = newLastName;}
    public void setOfficeNum(String newOfficeNum){this.officeNum = newOfficeNum;}
}
