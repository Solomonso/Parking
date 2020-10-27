/**
 * A ParkingGarage class.
 * Address that hold the address of the parking garage.
 * Asphalt color of the parking garage.
 * The parking garage contains cars in 3d array.
 */
public class ParkingGarage {

    //fields for the parking garage.
    private Car[][][] carsInParkingGarage;
    private String address;
    private String asphaltColor;

    public ParkingGarage(String address, String asphaltColor) {
        this.address = address;
        this.asphaltColor = asphaltColor;
        this.carsInParkingGarage = new Car[21][23][3];
    }

    public String getAddress() {
        return this.address;
    }

    public String getAsphaltColor() {
        return this.asphaltColor;
    }

    /**
     * This method gets all the car in parking garage
     * @return Return cars in the parking garage
     */
    public Car[][][] getCarsInParkingGarage() {
        return this.carsInParkingGarage;
    }

    /**
     * This method parks a car on the first available spot in the parking garage
     *
     * @param car accepts a car object
     */
    public Car addCarToParkingGarage(Car car) {
        Car parkedCar = null;
        for (int i = 0; i < carsInParkingGarage.length; i++) {
            for (int row = 0; row < carsInParkingGarage[i].length; row++) {
                for (int column = 0; column < carsInParkingGarage[i][row].length; column++) {
                    if (carsInParkingGarage[i][row][column] == null) {
                        carsInParkingGarage[i][row][column] = car;
                        parkedCar = car;
                        break;
                    }
                }
            }
        }
        return parkedCar;
    }

    /**
     * This method removes a car from the parking garage base on the license plate number.
     *
     * @param licensePlate accepts a string for the license plate number of the car
     */
    public Car removeCarFromParkingGarage(String licensePlate) {
        Car removedCar = null;
        for (int i = 0; i < carsInParkingGarage.length; i++) {
            for (int row = 0; row < carsInParkingGarage[i].length; row++) {
                for (int column = 0; column < carsInParkingGarage[i][row].length; column++) {
                    //check for null and continue so the loops does not break
                    if (this.carsInParkingGarage[i][row][column] == null) {
                        continue;
                    }
                    if (this.carsInParkingGarage[i][row][column].getLicensePlate().equalsIgnoreCase(licensePlate)) {
                        removedCar = this.carsInParkingGarage[i][row][column];
                        this.carsInParkingGarage[i][row][column] = null;

                    }
                }
            }
        }
        return removedCar;
    }

    /**
     * The methods checks if a car space is taken or not in the parking garage.
     *
     * @param i      Accepts an integer to indicate the index.
     * @param row    Accepts an integer to indicate the 3d row.
     * @param column Accepts an integer to indicate the 3d column.
     * @return Returns a string that indicate if the parking Garage is full or occupied.
     */
    public String freeSpotInParkingGarage(int i, int row, int column) {
        return this.carsInParkingGarage[i][row][column] == null ? "Free" : "Occupied";
    }
}
