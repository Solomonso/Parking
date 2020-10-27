import java.util.Arrays;

/**
 * Main class used for creating all the instances
 */
public class Main {
    public static void main(String[] args) {
        //Create objects
        Car bmw = new Car("gold","fr");
        Car ford = new Car("silver","blue");
        Car benz = new Car("bronze","grey");
        ParkingLane parkingLane = new ParkingLane("fff");
        ParkingLot parkingLot = new ParkingLot("Pz", "purple");
        ParkingGarage parkingGarage = new ParkingGarage("Limit","grey");

        //Added cars to parking lane
        parkingLane.parkCar(bmw);
        parkingLane.parkCar(ford);
        parkingLane.parkCar(benz);

        //Added car to parking garage
        parkingGarage.addCarToParkingGarage(bmw);

        parkingGarage.removeCarFromParkingGarage("gold");

    }
}
