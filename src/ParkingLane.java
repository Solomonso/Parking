/**
 * The ParkingLane Class contains 23 cars that are parked in a row.
 * Street name of the parking lane.
 * Parking lane only accepts 23 cars.
 */
public class ParkingLane {
    private String streetName;
    private final int MAX_SIZE_OF_PARK_LANE = 23;
    private Car[] cars;

    /**
     * Creates a Parking Lane
     *
     * @param streetName accepts a string to represent the name of the street
     */
    public ParkingLane(String streetName) {
        this.streetName = streetName;
        this.cars = new Car[MAX_SIZE_OF_PARK_LANE];
    }

    public String getStreetName() {
        return this.streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * This method parks a car on the first available spot and the car gets returned.
     *
     * @param car accepts a car object
     */
    public Car parkCar(Car car) {
        Car parkedCar = null;
        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null) {
                this.cars[i] = car;
                parkedCar = car;
                break;
            }
        }
        return parkedCar;
    }

    /**
     *
     * @return Returns the cars in the ParkingLane.
     */
    public Car[] getCars()
    {
        return this.cars;
    }

    /**
     * This method removes a car from a parking lane base on the license plate number.
     *
     * @param licensePlate Accepts a string to represent the license plate number for the car.
     */
    public Car removeCar(String licensePlate) {
        for (int i = 0; i < this.cars.length; i++) {
            //check for null and continue so the loops does not break
            if (this.cars[i] == null) {
                continue;
            }

            if (this.cars[i].getLicensePlate().equalsIgnoreCase(licensePlate)) {
                Car carRemoved = this.cars[i];
                this.cars[i] = null;
                return carRemoved;
            }
        }
        return null;
    }

    /**
     * This method checks if there is a free spot in the parking lane
     *
     * @param index Accepts an integer to represent the index of the array
     * @return Returns a string that represent if the parking lane is free or occupied
     */
    public String freeSpot(int index) {
        String result = "";
        result = this.cars[index] == null ? "Free" : "Occupied";
        return result;
    }
}
