package main.java.package2;

public class Ship {
    private String name;
    private int year;

    public Ship(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getName(){return this.name;}
    public int getYear(){return this.year;}

    public void setName(String newName){this.name = newName;}
    public void setYear(int newYear){this.year = newYear;}

    public void print(){
        System.out.println("Ship name: " + name);
        System.out.println("Year built: " + year);
    }
}
