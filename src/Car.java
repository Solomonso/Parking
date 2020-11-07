/**
 * The Car Class represents a car with the licensePlate and color
 */
public class Car {
    private String licensePlate;
    private String color;

    /**
     * Creates a Car with a licensePlate and color
     *
     * @param licensePlate Accepts a String to represent a licensePlate
     * @param color        Accepts a String to represent a color
     */
    public Car(String licensePlate, String color) {
        this.licensePlate = licensePlate;
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.licensePlate + " " + this.color;
    }
}
