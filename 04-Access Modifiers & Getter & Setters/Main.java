public class Main {
    public static void main(String[] args) {
        
        // 1. Game ka object banaya
        Game g = new Game();
        
        boolean gameOn = true;

        // 2. Game ko loop mein chalaya
        while (gameOn) {
            // 3. User se input liya
            g.takeUserInput();
            
            // 4. Check kiya ki guess sahi hai ya nahi
            boolean isCorrect = g.isCorrectNumber();
            
            if (isCorrect) {
                gameOn = false; // Guess sahi hai, game band karo
            }
        }
        
        // 5. Game khatam hone par score print kiya
        System.out.println("You took " + g.getNoOfGuesses() + " guesses to win.");
    }
}

