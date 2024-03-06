package main.java.package2;

public class ShipDriver {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Ship1", 2023);
        ships[1] = new CruiseShip("Cruise Ship 2", 1997, 100);
        ships[2] = new CargoShip("Cargo Ship 1", 1730, 23);

        for (Ship x: ships){
            x.print();
            System.out.println("------------------------");
        }
    }
}
