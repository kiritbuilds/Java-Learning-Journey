// Q.6 Write Multiplication Number 2 to 9 And Save All in These Multiplication Folder Inside.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeSet6 {
    public static void main(String[] args) {
        // Create A Folder
        File folder = new File("MyMultipicationTables");
        if (!folder.exists()) {
            folder.mkdir(); // mkdir = Make Directory . (folder)
            System.out.println("Folder Cretaed: " + folder.getName());
        }

        int i, j;
        for (i = 2; i <= 9; i++) {

            // New Table For Each Loop Number
            String table = "";
            for (j = 1; j <= 10; j++) {
                table += i + " X " + j + " = " + (i * j);
                table += "\n";
            }

            // Step 4: File Write Karna
            // File ka naam dynamic hoga: "MyMultiplicationTables/Table_2.txt"
            File myFile = new File(folder, "Table_Of_" + i + ".txt");

            try {
                FileWriter fw = new FileWriter(myFile);
                fw.write(table);
                fw.close(); // Close karna mat bhoolna!
                System.out.println("Generated: " + myFile.getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("Mission Accomplished! Saari files ban gayi.");
    }
}
