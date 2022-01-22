import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
         Console c = new Console();
           c.menu();


      /*  Model.Registry registry = new Model.Registry();
        ArrayList<Model.Member> members = registry.getMemberArrayList();
        Model.FileHandler fileHandler = new Model.FileHandler();
        ShowInfo show_info = new ShowInfo();

        Model.Member member = new Model.Member("saad", "555");
        Model.Member member2 = new Model.Member("saaaad", "5545");
        member.setMemberID("15");
        member2.setMemberID("10");

        registry.addMember(member2);
        registry.addMember(member);


        Model.Boat boatt = new Model.Boat(member.getMemberID(), 46, "1");
        boatt.setBoatID("78");
        member.addBoat(boatt);

        Model.Boat boatt2 = new Model.Boat(member2.getMemberID(), 69, "3");
        boatt2.setBoatID("32");
        member2.addBoat(boatt2);
        //     registry.addBoat(member,boatt);

        registry.result();
        //  System.out.println(show_info.showInfo(registry,member));
        show_info.displayCompactList(registry, member);*/

        //  List<String> integerList = new ArrayList<>();
        // integerList.add(fileHandler.fileReader_user());
        //  String p  = fileHandler.fileReader_user();
        //  String[] arr = p.split("\n");
        // System.out.println(arr.length);


/*    boolean    duplicates = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j]) ) {
                    System.out.println(arr[j]);
                }
            }

            //System.out.println(arr.length);
        }*/


        // List<String> integerList = new ArrayList<>();
        // integerList.add(fileHandler.fileReader_user());

 /*       boolean test = false;
        for (int i = 0; i < integerList.size(); i++) {
            for (int j = i + 1; j < integerList.size(); j++) {
                if (integerList.get(i).equals(integerList.get(j))) {

                test = true;

                }
                System.out.println(test);
            }
            System.out.println(integerList.get(i));

        }*/
/*
        for (int j=0;j<integerList.size();j++){
            boolean    duplicates=false;
            for (int k=j+1;k<integerList.size();k++){
                if (k!=j && integerList.get(k).equals(integerList.get(j))){
                    duplicates=true;
                }
                System.out.println(duplicates);
            }

        }*/

        // Main main = new Main();
        // int a = main.findDuplicates(integerList).size();
        //  int b = main.findDuplicates(integerList).size()-1;
        // System.out.println(main.findDuplicates(integerList).stream());

        // fileHandler.write_To_File_user(member.getMemberID());
        //  registry.removeBoat(boatt.getBoatID(), member);
     /*   System.out.println(member.getBoatArrayList().size());
        for (int i = 0; i <member.getBoatArrayList().size() ; i++) {
            System.out.println(member.getBoatArrayList().get(i).getBoatSize());
        }*/


        //  System.out.println(registry.getBoatsByMember(member.getName(),registry.getMemberArrayList(),member));
        // show_info.displayCompactList(registry,member);
        //   System.out.println( show_info.getMemberDetails(member.getMemberID(),registry));
        //  System.out.println(show_info.showInfo(registry,member));
        // String s = show_info.showInfo(registry,member);
        //  fileHandler.write_To_File(s);
        //  System.out.println(fileHandler.fileReader());

     /*
        registry.change_Boat_Info(boatt.getBoat_ID(), boatt,member);

        member.setName("saadaaa");
        member.setMember_ID("130");
        registry.Memberchange_Member_Info(member.getMember_ID(),member);*/


        //  registry.delete_Member("133");

        /*

         *//* registry.addBoat("135", "121", 9, "2", registry.getArrayList());
        registry.result();

        registry.addMember("222", "sa", "587");
        registry.result();
        registry.addBoat("444", "222", 20, "1", registry.getArrayList());
        registry.result();
        registry.addBoat("135", "222", 11, "2", registry.getArrayList());
        registry.result();

        registry.addMember("551", "None", "232");
        registry.result();*/

        //     System.out.println(show_info.showInfo(member));
        //    System.out.println(show_info.getMemberDetails(130, registry.getArrayList(),member));

        //  System.out.println(fileHandler.showInfo( registry.getArrayList(),member));

        //   fileHandler.write_To_File(fileHandler.showInfo( registry.getArrayList(),member));

    }

  /*  public Set<String> findDuplicates(List<String> listContainingDuplicates) {
        final Set<String> setToReturn = new HashSet<>();
        final Set<String> set1 = new HashSet<>();

        for (String yourInt : listContainingDuplicates) {
            if (!set1.add(yourInt)) {
                setToReturn.add(yourInt);
            }
        }
        System.out.println(setToReturn);
        return setToReturn;
    }*/
}
