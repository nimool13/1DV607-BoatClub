package Model;

import java.io.*;
import java.util.Scanner;


/**
 * The type File handler.
 */
public class
FileHandler {


    /**
     * Instantiates a new File handler.
     */
    public FileHandler() throws FileNotFoundException {

    }



    /**
     * Write to file.
     *
     * @param string the string with data to be weiten to txt file
     * @throws FileNotFoundException the file not found exception
     */
    public void write_To_File(String string) throws FileNotFoundException {

        File file = new File("output.txt");
        FileOutputStream fo = new FileOutputStream(file, true);
        PrintWriter pw = new PrintWriter(fo);
        pw.println(string);
        pw.close();
        pw.flush();

    }
    public void writeToFileUser(String string) throws FileNotFoundException {

        File file = new File("user.txt");
        FileOutputStream fo = new FileOutputStream(file, true);
        PrintWriter pw = new PrintWriter(fo);
        pw.println(string);
        pw.close();
        pw.flush();

    }
    public  String fileReader(){
        String data ="";
        try {
            File myObj = new File("output.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data += myReader.nextLine()+ System.getProperty("line.separator");


            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;


    }

        public  String fileReaderUser(){
        String data ="";
        try {
            File myObj = new File("user.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data += myReader.nextLine()+ System.getProperty("line.separator");


            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;


    }





}
