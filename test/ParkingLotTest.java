import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    @Test
    void addCarToParkingLot() {
        Car bmw = new Car("gold","purple");
        Car ford = new Car("silver","blue");
        ParkingLot parkingLot = new ParkingLot("NL","red");

        assertEquals(bmw, parkingLot.addCarToParkingLot(bmw));

    }

    @Test
    void removeCarFromParkingLot() {
        Car bmw = new Car("gold","purple");
        Car ford = new Car("silver","blue");
        ParkingLot parkingLot = new ParkingLot("NL","red");

        parkingLot.addCarToParkingLot(ford);
        parkingLot.addCarToParkingLot(bmw);
        assertEquals(ford, parkingLot.removeCarFromParkingLot("silver"));
    }
}
