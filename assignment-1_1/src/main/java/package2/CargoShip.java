package main.java.package2;

public class CargoShip extends Ship{
    private int tonnage;

    public CargoShip(String name, int year, int tonnage) {
        super(name, year);
        this.tonnage = tonnage;
    }
    
    public int getTonnage(){return this.tonnage;}

    public void setTonnage(int newTonnage){this.tonnage = newTonnage;}

    @Override
    public void print(){
        super.print();
        System.out.println("Cargo Capacity: " + tonnage);
    }
}
