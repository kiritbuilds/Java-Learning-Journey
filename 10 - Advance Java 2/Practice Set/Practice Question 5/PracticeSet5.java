// Q.5 Write a Program to Generate Multiplication Table and a write it to a file.
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class PracticeSet5 {
    public static void main(String[] args) {
        System.out.println("Enter Number ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String table = "";
        for (int j = 1; j <= 10; j++) {
            table += i + "X" + j + "=" + (i * j);
            table += "\n";
        }

        try {
            FileWriter fileWriter = new FileWriter("Kirit1635.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Unable to write file");
            e.printStackTrace();
        }
    }
}
