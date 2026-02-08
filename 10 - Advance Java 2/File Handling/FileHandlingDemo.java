import java.io.IOException;
// import java.util.Scanner;
import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileWriter;

public class FileHandlingDemo {
    public static void main(String[] args) {

        // Creating a New File
        File myFile = new File("Kirit1635.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file ");
            e.printStackTrace();
        }

        /*
         * // Code to write a file
         * try {
         * FileWriter fileWriter = new FileWriter("Kirit1635.txt");
         * fileWriter.
         * write("This is our first file from this java course\nOkay This Is Java");
         * fileWriter.close();
         * } catch (IOException e) {
         * System.out.println("Unable to write file");
         * e.printStackTrace();
         * }
         * 
         * //Reading a File
         * File myFile = new File("Kirit1635.txt");
         * try {
         * Scanner sc = new Scanner(myFile);
         * while (sc.hasNextLine()) {
         * String Line = sc.nextLine();
         * System.out.println(Line);
         * }
         * sc.close();
         * } catch (FileNotFoundException e) {
         * e.printStackTrace();
         * }
         * 
         */

        // // Delete File
        // File myFile = new File("Kirit1635.txt");
        // if(myFile.delete()){
        // System.out.println("This FIle Deleted " + myFile.getName());
        // }
        // else{
        // System.out.println("Some Problem Occured Delete File");
        // }

    }
}
