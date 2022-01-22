import Model.Member;
import Model.Registry;

/**
 * The type Show info.
 */
public class ShowInfo {


    /**
     * Gets full details.
     *
     * @param enteredID the user ID
     * @return the member details as strings
     */
    public String getMemberDetails(String enteredID, Registry registry) {

        String text = "";
        for (Member member : registry.getMemberArrayList()) {
            if (member.getMemberID().equals(enteredID)) {
                text = "ID: " + member.getMemberID() + System.getProperty("line.separator") + "Name: " + member.getName() + System.getProperty("line.separator") + "Personal Number: " + member.getPersonalNumber();

            }


        }
        return text;
    }

    /**
     * displays the compact list
     *
     * @param registry
     */

    public String displayCompactList(Registry registry, Member member) {
        StringBuilder saveTo = new StringBuilder();

        for (int i = 0; i < registry.getMemberArrayList().size(); i++) {
            saveTo.append("\n");
            saveTo.append("\nNumber of boats: ").append(registry.getNumOfBoatsByMember(registry.getMemberArrayList().get(i).getName(), registry.getMemberArrayList(), member)).
                    append(("\nID: " + registry.getMemberArrayList().get(i).getMemberID() + System.getProperty("line.separator") + "Name: " +
                            registry.getMemberArrayList().get(i).getName() + System.getProperty("line.separator")));

        }
        return saveTo.toString();
    }

    public String returnInfo(Registry registry, Member member) {
        StringBuilder saveTo = new StringBuilder();
        for (int i = 0; i < registry.getMemberArrayList().size(); i++) {
            saveTo.append("ID: ").append(registry.getMemberArrayList().get(i).getMemberID()).append(System.getProperty("line.separator")).append("Name: ").
                    append(registry.getMemberArrayList().get(i).getName()).append(System.getProperty("line.separator")).append("Personal Number: ").
                    append(registry.getMemberArrayList().get(i).getPersonalNumber()).append("\n");
            saveTo.append("\n" + "------------------------------------------------------------" + "\n");

        }

        saveTo.append(System.getProperty("line.separator"));
        for (int i = 0; i < member.getBoatArrayList().size(); i++) {
            saveTo.append("\n");
            saveTo.append("Model.Boat id: ").append(member.getBoatArrayList().get(i).getBoatID()).append("\n").
                    append("Size: ").append(member.getBoatArrayList().get(i).getBoatSize()).append("\n").
                    append("Type: ").append(member.getBoatArrayList().get(i).getBoatType()).append("\n");


        }
        saveTo.append("\n" + "------------------------------------------------------------").append(System.getProperty("line.separator"));

        return saveTo.toString();
    }

    /**
     * Result.
     */
    public void result() {
        System.out.println("registration was successful");
    }

    /**
     * deleting results
     */

    public void deleteResult() {
        System.out.println("The boat was successfully deleted");
    }
}
