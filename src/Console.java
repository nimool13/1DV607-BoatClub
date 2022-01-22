import Model.Boat;
import Model.FileHandler;
import Model.Member;
import Model.Registry;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Console {

    public Console() {

    }
    //Important note:TheMember info will be save in the output.txt after the user added members (or boat info) and presses the 'q' button.

    public void menu() throws FileNotFoundException, InterruptedException {
        Member member = null;
        ShowInfo show_info = new ShowInfo();
        Registry registry = new Registry();
        FileHandler fileHandler = new FileHandler();

        boolean controller = true;

        while (controller == true) {

            Scanner sc = new Scanner(System.in);
            System.out.println(System.getProperty("line.separator"));
            System.out.println("**************************MENU**************************");

            System.out.println(System.getProperty("line.separator"));
            System.out.println("(1) To Add a Model.Member");
            System.out.println("(2) To Delete a Model.Member");
            System.out.println("(3) To Update a Model.Member");
            System.out.println("(4) To See Members info");
            System.out.println("(5) To Add a Model.Boat");
            System.out.println("(6) To Update a Model.Boat");
            System.out.println("(7) To Delete a Model.Boat");
            System.out.println("Please enter (C) for Compact List Or (V) for Verbose List");
            System.out.println("Please enter (Q) to exit the program");
            String input = sc.nextLine();

            if (input.equals("1")) {

                System.out.println("--- Add a Model.Member ---");
                System.out.print("Full name : ");
                String name = sc.nextLine();
                while (!name.matches("[a-zA-Z ]+")) {
                    System.out.println("Invalid name,Please try one more time ");
                    name = sc.nextLine();
                }
                System.out.print("Personal number : ");
                String personalNumber = sc.nextLine();
                while (personalNumber.length() > 10) {
                    System.out.println("TRY AGAIN,enter less than 10 digits ");
                    personalNumber = sc.nextLine();
                }
                while (!personalNumber.matches("[0-9]+")) {
                    System.out.println("Invalid PersonalNumber,Please try one more time ");
                    personalNumber = sc.nextLine();
                }
                member = new Member(name, personalNumber);
                int id = registry.generateMemberID();
                member.setMemberID(String.valueOf(id));
                fileHandler.writeToFileUser(member.getMemberID());
                System.out.println("Model.Member ID: " + member.getMemberID());
                registry.addMember(member);
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                show_info.result();


            } else if (input.equals("2")) {

                System.out.println("--- Delete a Model.Member ---");
                System.out.println(" Model.Member ID :");
                String memberID = sc.nextLine();
                while (!memberID.matches("[0-9]+")) {
                    System.out.println("Invalid Model.Member ID,Please try one more time ");
                    memberID = sc.nextLine();
                }
                if ( registry.deleteMember(memberID)){
                    System.out.println("The member is deleted.");
                }
                else {
                    System.out.println("There is no member with this ID: "+ memberID);
                }
            } else if (input.equals("3")) {

                System.out.println("--- Update a Model.Member ---");

                System.out.println("Model.Member ID :");
                String memberID = sc.nextLine();
                while (!memberID.matches("[0-9]+")) {
                    System.out.println("Invalid member ID,Please try one more time ");
                    memberID = sc.nextLine();
                }

                System.out.print("Name to Update : ");
                String name = sc.nextLine();
                while (!name.matches("[a-zA-Z_]+")) {
                    System.out.println("Invalid name,Please try one more time ");
                    name = sc.nextLine();
                }
                System.out.print("Personal number  to Update : ");
                String personal_Number = sc.nextLine();
                while (!personal_Number.matches("[0-9]+")) {
                    System.out.println("Invalid personal number,Please try one more time ");
                    personal_Number = sc.nextLine();
                }

                registry.memberChangeMemberInfo(memberID, name, personal_Number);


            } else if (input.equals("4")) {
                String answer = "";
                System.out.println("Please enter Model.Member ID: ");
                answer = sc.nextLine();
                if (!answer.matches("[0-9]+")) {
                    System.out.println("Invalid member ID,Please try one more time ");
                }

                else {
                    System.out.println(show_info.getMemberDetails(answer, registry));
                  }


            } else if (input.equals("5")) {
                boolean control = false;
                try {
                    String ownerID = "";
                    System.out.println("--- Add a Model.Boat ---");
                    while (control == false) {
                        System.out.print("Model.Member ID : ");
                        ownerID = sc.nextLine();
                        if (!ownerID.matches("[0-9]+")) {
                            System.out.println("Invalid member ID,Please try one more time ");
                        } else {
                            control = true;
                        }
                    }


                    if (member.check(registry, ownerID)) {

                        System.out.print("Model.Boat Length : ");
                        int boatSize = sc.nextInt();
                        System.out.print("Model.Boat Type: ");
                        System.out.println("Please Enter (1) for Sailboat, (2) for Motorsailer, (3) for Canoe or (4) for other");
                        int boatType = sc.nextInt();
                        String boat = "";
                        String boatTypee = "";
                        if (boatType == 1) {
                            boatTypee = "Sailboat";

                        } else if (boatType == 2) {
                            boatTypee = "Motorsailer";
                        } else if (boatType == 3) {
                            boatTypee = "Canoe";
                        } else if (boatType == 4) {
                            System.out.println("Please write boat's type: \n");

                            boatTypee = "Other";


                        }
                        assert member != null;
                        Boat boat1 = new Boat(ownerID, boatSize, boatTypee);
                        boat1.setBoatID(String.valueOf(registry.generateMemberID()));
                        System.out.println("Model.Boat ID: " + boat1.getBoatID());
                        member.addBoat(boat1);
                        System.out.println(member.getBoatArrayList().size());
                        show_info.result();
                    } else if (!member.check(registry, ownerID)) {
                        System.out.println("No member with this ID, Try again with valid Model.Member ID");
                        TimeUnit.SECONDS.sleep(1);
                    }


                } catch (InputMismatchException e) {
                    System.out.print("That’s not an integer. Try again ");
                    TimeUnit.SECONDS.sleep(1);

                }


            } else if (input.equals("6")) {
                boolean con = false;
                try {
                    String boatID = "";
                    System.out.println("--- Update a Model.Boat ---");
                    while (con == false) {
                        System.out.println("Model.Boat ID :");
                        boatID = sc.nextLine();
                        if (!boatID.matches("[0-9]+")) {
                            System.out.println("Invalid member ID,Please try one more time ");

                        }
                        else {
                            con =true;
                        }
                    }
                    System.out.println("Model.Boat Size : ");
                    double size = sc.nextDouble();
                    System.out.println("Model.Boat type to Update : ");
                    System.out.println("Please Enter (1) for Sailboat, (2) for Motorsailer, (3) for Canoe or (4) for other\n");
                    int boat_Type = sc.nextInt();
                    String boat = "";
                    String boat_typee = "";
                    if (boat_Type == 1) {
                        boat_typee = "Sailboat";

                    } else if (boat_Type == 2) {
                        boat_typee = "Motorsailer";
                    } else if (boat_Type == 3) {
                        boat_typee = "Canoe";
                    } else if (boat_Type == 4) {
                        System.out.println("Please write boat's type: \n");

                        boat_typee = "Other";


                    }

                    member.changeBoat(boatID, boat_typee, size);


                } catch (InputMismatchException e) {
                    System.out.print("That’s not an integer. Try again ");
                    TimeUnit.SECONDS.sleep(1);

                }


            } else if (input.equals("7")) {
                System.out.println("--- Delete a Model.Boat ---");
                boolean cont = false;
                String boatID = "";
                try {


                    while (!cont) {
                        System.out.println("Model.Boat ID :");
                        boatID = sc.nextLine();

                        if (!boatID.matches("[0-9]+")) {
                            System.out.println("Invalid member ID,Please try one more time ");

                        } else {
                            cont = true;
                        }


                    }
                }
                catch(InputMismatchException e){
                    System.out.print("That’s not an integer. Try again ");
                }


                assert member != null;
                registry.removeBoat(boatID,member);
                show_info.deleteResult();

            } else if (input.equalsIgnoreCase("q")) {
                fileHandler.write_To_File(show_info.returnInfo(registry,member));


                controller = false;
                System.exit(0);

            } else if (input.equalsIgnoreCase("v")) {
                ArrayList<Member> members = registry.getMemberArrayList();
                System.out.println("\nVerbose list of members:");

                System.out.println(fileHandler.fileReader());


            } else if (input.equalsIgnoreCase("c")) {

                System.out.println(show_info.displayCompactList(registry,member));;


            }

        }

    }
}
