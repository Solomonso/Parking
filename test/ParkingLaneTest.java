import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLaneTest {

    @Test
    void testParkCar() {
        ParkingLane parkingLane = new ParkingLane("limit");

        Car bmw = new Car("gold","purple");
        Car ford = new Car("silver","blue");

        parkingLane.parkCar(bmw);
        parkingLane.parkCar(ford);

        assertEquals(ford,parkingLane.parkCar(ford));
    }

    @Test
    void testFreeSpot() {
        ParkingLane parkingLane = new ParkingLane("limit");

        Car bmw = new Car("gold","purple");
        Car ford = new Car("silver","blue");

        parkingLane.parkCar(bmw);
        parkingLane.parkCar(ford);

        assertEquals("Free",parkingLane.freeSpot(2));
    }

    @Test
    void testRemoveCar() {
        ParkingLane parkingLane = new ParkingLane("limit");

        Car bmw = new Car("gold","purple");
        Car ford = new Car("silver","blue");

        parkingLane.parkCar(bmw);
        parkingLane.parkCar(ford);

        assertEquals(bmw,parkingLane.removeCar("gold"));

    }
}
