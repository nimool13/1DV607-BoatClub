package Model;

import java.util.ArrayList;

/**
 * The type Model.Member.
 */
public class Member {

    private String memberID;
    private String name;
    private String personalNumber;
    private final ArrayList<Boat> boatArrayList;

    /**
     * Instantiates a new Model.Member.
     *
     * @param name           the name
     * @param personalNumber the personal number
     */
    public Member(String name, String personalNumber) {
        this.name = name;
        this.personalNumber = personalNumber;
        this.memberID = getMemberID();
        boatArrayList = new ArrayList<>();
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }


    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets personal number.
     *
     * @return the personal number
     */
    public String getPersonalNumber() {
        return personalNumber;
    }

    /**
     * Sets personal number.
     *
     * @param personalNumber the personal number
     */
    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    /**
     * Gets boat array list.
     *
     * @return the boat array list
     */
    public ArrayList<Boat> getBoatArrayList() {
        return boatArrayList;
    }

    /**
     * adds boat to the boat Arraylist
     *
     * @param boat
     */
    public void addBoat(Boat boat) {

        boatArrayList.add(boat);

    }


    public boolean check(Registry registry, String memID) {
        boolean cont = false;
        for (Member member : registry.getMemberArrayList()) {
            cont = member.getMemberID().equalsIgnoreCase(memID);

        }

        return cont;
    }

    /**
     * Change boat.
     *
     * @param boatID  the boat id
     * @param bType   the b type
     * @param bLength the b length
     */
    public void changeBoat(String boatID, String bType, double bLength) {
        for (Boat boat : getBoatArrayList()) {
            if (boat.getBoatID().equalsIgnoreCase(boatID)) {
                boat.setBoatSize(bLength);
                boat.setBoatType(bType);
                int index = getBoatArrayList().indexOf(boat);
                boatArrayList.set(index, boat);
            }
        }
    }

}




