import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Guess the number (1-100): ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }
    }
}
