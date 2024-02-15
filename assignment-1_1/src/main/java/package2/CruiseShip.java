package main.java.package2;

public class CruiseShip extends Ship{
    private int maxNumPassengers;

    public CruiseShip(String name, int year, int maxNumPassengers) {
        super(name, year);
        this.maxNumPassengers = maxNumPassengers;
    }

    public int getMaxNumPassengers(){return this.maxNumPassengers;}

    public void setMaxNumPassengers(int newMaxNumPassengers){this.maxNumPassengers = newMaxNumPassengers;}
    
    @Override
    public void print(){
        super.print();
        System.out.println("Max Number of Passenegers: " + maxNumPassengers);
    }
}
