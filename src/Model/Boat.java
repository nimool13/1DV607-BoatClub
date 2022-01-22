package Model;

import java.util.Random;

/**
 * The type Model.Boat.
 */
public class Boat {

    private String boatID;
    private double boatSize;
    private String boatType;
    private final String ownerID;

    /**
     * Instantiates a new Model.Boat.
     *
     * @param boatSize the boat size
     * @param boatType the boat type
     */
    public Boat(String ownerID, double boatSize, String boatType) {

        this.boatSize = boatSize;
        this.boatType = boatType;
        this.ownerID = ownerID;

    }

    /**
     * gets boat ID
     *
     * @return the boat s' ID
     */

    public String getBoatID() {
        return boatID;
    }

    /**
     * sets boat ID
     * @param boatID
     */
    public void setBoatID(String boatID) {
        this.boatID = boatID;
    }

    /**
     * Gets boat size.
     *
     * @return the boat size
     */
    public double getBoatSize() {
        return boatSize;
    }

    /**
     * sets boat size
     *
     * @param boatSize
     */

    public void setBoatSize(double boatSize) {
        this.boatSize = boatSize;
    }

    /**
     * Gets boat type.
     *
     * @return the boat type
     */
    public String getBoatType() {
        return boatType;
    }

    /**
     * sets Model.Boat type
     *
     * @param boatType
     */
    public void setBoatType(String boatType) {
        this.boatType = boatType;
    }

    /**
     * gets owners ID
     *
     * @return
     */
    public String getOwnerID() {
        return ownerID;
    }

}
