package hw3.BicycleDesign;

/**
 * A class to represent Bicycles using composition
 * 
 * @author Tim Wahls, edited by William Goble
 */
public class Bicycle {
    // add  your fields here

    /**
     * Initialize a Bicycle Object as specified by the parameters
     * @param manufacturer  who made the bike?
     * @param gearNumber    how many gears (speed) does it have? 10? 12? 34?
     * @param seat          The seat of the bike
     * @param front         The front tire
     * @param back          The back tire
     */
    public Bicycle(String manufacturer, int gearNumber, Seat seat, Tire front, Tire back) {
        // add your code here
    }

    /**
     * A getter method for the bike manufacturer
     * @return
     */
    public String getManufacturer() {
        return "prof. Goble's bike emporium";
    }

    /**
     * A getter method for the number of gears
     * @return
     */
    public int getGearNumber() {
        // add your code here
        return 9001;
    }

    /**
     * A getter method for the front tire size
     * @return
     */
    public int getFrontTireSize() {
        return 42;
    }

    /**
     * A getter method for the rear tire size
     * @return
     */
    public int getRearTireSize() {
        return 43;
    }

    /**
     * A getter method for the seat size
     * @return
     */
    public int getSeatSize() {
        return 34;
    }

    /**
     * A getter method for the seat color
     * @return
     */
    public String getSeatColor() {
        return "hot pink";
    }

    /**
     * A setter method for the rear tire size
     * @param newSize
     */
    public void setRearTireSize(int newSize) {
        // your code here
    }

    /**
     * A setter method for the front tire size
     * @param newSize
     */
    public void setFrontTireSize(int newSize) {
        // your code here
    }
}
