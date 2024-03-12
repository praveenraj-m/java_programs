import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class hangman_game {
    public static void main(String[] args) {
        // List of words to choose from
        String[] words = {"python", "java", "programming", "computer", "hangman", "developer"};

        // Randomly select a word from the list
        String secretWord = words[new Random().nextInt(words.length)];

        // Set to store guessed letters
        Set<Character> guessedLetters = new HashSet<>();

        // Maximum attempts allowed
        int maxAttempts = 6;
        int attempts = 0; // Counter for the number of attempts

        Scanner scanner = new Scanner(System.in);

        // Main game loop
        while (attempts < maxAttempts) {
            StringBuilder displayWord = new StringBuilder();

            // Build the word to display, replacing unguessed letters with underscores
            for (char letter : secretWord.toCharArray()) {
                if (guessedLetters.contains(letter)) {
                    displayWord.append(letter);
                } else {
                    displayWord.append("_ ");
                }
            }

            // Print the current state of the word
            System.out.println("Current Word: " + displayWord);

            // Get a letter guess from the user
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            // Check if the letter has already been guessed
            if (guessedLetters.contains(guess)) {
                System.out.println("You already guessed that letter. Try again.");
            }
            // Check if the guessed letter is in the secret word
            else if (secretWord.contains(String.valueOf(guess))) {
                System.out.println("Good guess!");
                guessedLetters.add(guess);
            } else {
                System.out.println("Incorrect guess.");
                attempts++;
            }

            // Check if all letters in the secret word have been guessed
            if (guessedLetters.containsAll(toCharacterSet(secretWord))) {
                System.out.println("Congratulations! You guessed the word: " + secretWord);
                break;
            }
        }

        // If the maximum attempts are reached
        if (attempts == maxAttempts) {
            System.out.println("Sorry, you ran out of attempts. The correct word was: " + secretWord);
        }
    }

    // Utility method to convert a string to a set of characters
    private static Set<Character> toCharacterSet(String word) {
        Set<Character> characterSet = new HashSet<>();
        for (char ch : word.toCharArray()) {
            characterSet.add(ch);
        }
        return characterSet;
    }
}
