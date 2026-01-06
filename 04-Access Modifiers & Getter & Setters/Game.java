import java.util.Random;
import java.util.Scanner;

public class Game {
    private int randomNumber;
    private int userInput;
    private int noOfGuesses;


public Game(){
    Random rand = new Random();
    this.randomNumber = rand.nextInt(100);
}
// Method to take user input
    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number (0-99): ");
        this.userInput = sc.nextInt();
        
        // Har baar input lene par guess counter badhana
        this.noOfGuesses++;
    }
// Method to check the user's guess
    public boolean isCorrectNumber() {
        if (userInput == randomNumber) {
            System.out.println("Congratulations! You guessed it right.");
            return true;
        } else if (userInput < randomNumber) {
            System.out.println("Too low... Guess a higher number.");
            return false;
        } else {
            System.out.println("Too high... Guess a lower number.");
            return false;
        }
    }
// Getter for noOfGuesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter for noOfGuesses
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
}