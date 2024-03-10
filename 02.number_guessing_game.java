import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100 (inclusive)
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;

        // Counter to keep track of the number of attempts
        int attempts = 0;

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Game loop
        while (true) {
            // Prompt the user to guess the number
            System.out.print("Guess the number (1-100): ");
            // Read the user's guess
            int userGuess = scanner.nextInt();
            // Increment the attempts counter
            attempts++;

            // Check if the user's guess is correct
            if (userGuess == numberToGuess) {
                // Display a congratulatory message and the number of attempts
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                // Exit the loop (end the game)
                break;
            } else if (userGuess < numberToGuess) {
                // Inform the user that their guess is too low
                System.out.println("Too low. Try again.");
            } else {
                // Inform the user that their guess is too high
                System.out.println("Too high. Try again.");
            }
        }

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
