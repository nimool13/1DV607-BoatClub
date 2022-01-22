package Model;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

/**
 * The type Model.Registry.
 */
public class Registry {
    private final ArrayList<Member> memberArrayList;

    /**
     * Instantiates a new Model.Registry.
     */
    public Registry() {
        memberArrayList = new ArrayList<>();

    }

    /**
     * Gets boat array list.
     *
     * @return the boat array list
     */


    /**
     * Gets array list.
     *
     * @return the array list
     */
    public ArrayList<Member> getMemberArrayList() {
        return memberArrayList;
    }

    /**
     * Add member.
     *
     * @param member the member
     */
    public void addMember(Member member) {

        memberArrayList.add(member);
    }

    /**
     *
     * @param name
     * @param members
     * @param member
     * @return the number
     */
    public int getNumOfBoatsByMember(String name, ArrayList<Member> members, Member member) {


        int number = 0;
        for (int i = 0; i < member.getBoatArrayList().size(); i++) {
            for (int j = 0; j < members.size(); j++) {
                if (member.getBoatArrayList().get(i).getOwnerID().equals(members.get(j).getMemberID()) && name.equals(members.get(j).getName())) {

                    return member.getBoatArrayList().size();


                }
            }
        }

        return number;
    }

    /**
     * Memberchange member info member.
     *
     * @param id     the id
     * @param name   the name
     * @param perNum the per num
     * @return the member
     */
    public Member memberChangeMemberInfo(String id, String name, String perNum) {
        for (Member member : memberArrayList) {
            if (member.getMemberID().equalsIgnoreCase(id)) {
                member.setName(name);
                member.setPersonalNumber(perNum);
                int index = memberArrayList.indexOf(member);
                memberArrayList.set(index, member);
            }
        }
        return null;
    }


    public void removeBoat(String boatID, Member member) {
        member.getBoatArrayList().removeIf(boat -> boat.getBoatID().equalsIgnoreCase(boatID));
        for (Boat b : member.getBoatArrayList()) {
            if (b.getBoatID().equalsIgnoreCase(boatID)) {

                int index = member.getBoatArrayList().indexOf(b);

                member.getBoatArrayList().set(index, b);
            }
        }


    }

    /**
     * Delete member.
     *
     * @param personID the person id
     */
    public boolean deleteMember(String personID) {

      return memberArrayList.removeIf(member -> member.getMemberID().equalsIgnoreCase(personID));

    }


    public boolean checkDuplicated(int num) throws FileNotFoundException {
        boolean check = false;
        FileHandler fileHandler = new FileHandler();
        String p = fileHandler.fileReaderUser();
        String[] arr = p.split("\n");
        for (String s : arr) {

            if (s.contains(String.valueOf(num))) {
                check = true;

            }


        }
        return check;
    }

    public int generateMemberID() throws FileNotFoundException {
        boolean cont = true;
        int randomNum = 0;
        while (cont) {
            Random random = new Random();
            randomNum = random.nextInt(900) + 100;
            if (checkDuplicated(randomNum)) {
                cont = true;


                randomNum   = random.nextInt(900) + 100;


            } else if (!checkDuplicated(randomNum)) {
                cont = false;

            }

        }

        return randomNum;

    }



}



