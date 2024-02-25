import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class HangmanGame {
    public static void main(String[] args) {
        String[] words = {"python", "java", "programming", "computer", "hangman", "developer"};
        String secretWord = words[new Random().nextInt(words.length)];
        Set<Character> guessedLetters = new HashSet<>();
        int maxAttempts = 6;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        while (attempts < maxAttempts) {
            StringBuilder displayWord = new StringBuilder();

            for (char letter : secretWord.toCharArray()) {
                if (guessedLetters.contains(letter)) {
                    displayWord.append(letter);
                } else {
                    displayWord.append("_ ");
                }
            }

            System.out.println("Current Word: " + displayWord);
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (guessedLetters.contains(guess)) {
                System.out.println("You already guessed that letter. Try again.");
            } else if (secretWord.contains(String.valueOf(guess))) {
                System.out.println("Good guess!");
                guessedLetters.add(guess);
            } else {
                System.out.println("Incorrect guess.");
                attempts++;
            }

            if (guessedLetters.size() == new HashSet<>(Arrays.asList(secretWord.toCharArray())).size()) {
                System.out.println("Congratulations! You guessed the word: " + secretWord);
                break;
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you ran out of attempts. The correct word was: " + secretWord);
        }
    }
}
