/**
 * A ParkingLot class.
 * Address that hold the address of the parking lot.
 * Asphalt color of the parking lot.
 * The parking lot contains cars in 2d array.
 */
public class ParkingLot {
    //field for parking lot
    private String address;
    private String asphaltColor;
    private Car[][] carsInParkingLot;

    /**
     * Creates a parkingLot
     *
     * @param address of the parkingLot
     * @param asphaltColor color the parkingLot
     */
    public ParkingLot(String address, String asphaltColor) {
        this.address = address;
        this.asphaltColor = asphaltColor;
        this.carsInParkingLot = new Car[24][23];
    }

    /**
     * This method returns the address in the parking lot.
     * @return Return a String.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * This method returns the asphalt color
     * @return Return a String.
     */
    public String getAsphaltColor() {
        return this.asphaltColor;
    }

    /**
     * This method gets all the car in the parking lot
     * @return Returns cars in the parking lot
     */
    public Car[][] getCarsInParkingLot() {
        return this.carsInParkingLot;
    }

    /**
     * This method parks a car on the first available spot in the parking lot and the car gets returned
     *
     * @param car Accepts a car object.
     */
    public Car addCarToParkingLot(Car car) {
        Car parkedCar = null;
        for (int row = 0; row < this.carsInParkingLot.length; row++) {
            for (int column = 0; column < this.carsInParkingLot[row].length; column++) {
                if (this.carsInParkingLot[row][column] == null) {
                    this.carsInParkingLot[row][column] = car;
                    parkedCar = car;
                    break;
                }
            }
        }
        return parkedCar;
    }

    /**
     * This method removes a car from the parking lot base on the license plate number.
     *
     * @param licensePlate Accepts a string for the license plate number of the car.
     */
    public Car removeCarFromParkingLot(String licensePlate) {
        Car removedCarFromParkingLot = null;
        for (int row = 0; row < this.carsInParkingLot.length; row++) {
            for (int column = 0; column < this.carsInParkingLot[row].length; column++) {
                //check for null and continue so the loops does not break
                if (this.carsInParkingLot[row][column] == null) {
                    continue;
                }
                if (this.carsInParkingLot[row][column].getLicensePlate().equalsIgnoreCase(licensePlate)) {
                    removedCarFromParkingLot = this.carsInParkingLot[row][column];
                    this.carsInParkingLot[row][column] = null;
                }
            }
        }
        return removedCarFromParkingLot;
    }

    /**
     * The methods checks if a car space is taken or not in the parking lot.
     *
     * @param row    accept an integer to represent the row of the 2d array.
     * @param column accept an integer to represent the column of the 2d array.
     * @return Returns a string that indicate if the parking Garage is full or occupied.
     */
    public String freeSpotInParkingLot(int row, int column) {
        return this.carsInParkingLot[row][column] == null ? "Free" : "Occupied";
    }

}
