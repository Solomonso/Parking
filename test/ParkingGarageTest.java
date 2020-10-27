import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingGarageTest {

    @Test
    void addCarToParkingGarage() {
        Car bmw = new Car("gold","purple");
        Car ford = new Car("silver","blue");
        ParkingGarage parkingGarage = new ParkingGarage("NL","red");

        assertEquals(ford, parkingGarage.addCarToParkingGarage(ford));
    }

    @Test
    void removeCarFromParkingGarage() {
        Car bmw = new Car("gold","purple");
        Car ford = new Car("silver","blue");
        ParkingGarage parkingGarage = new ParkingGarage("NL","red");

        parkingGarage.addCarToParkingGarage(ford);
        parkingGarage.addCarToParkingGarage(bmw);

        assertEquals(bmw, parkingGarage.removeCarFromParkingGarage("gold"));
    }
}
