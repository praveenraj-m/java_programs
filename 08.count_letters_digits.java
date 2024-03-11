import java.util.Scanner;

public class LetterDigitCounter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        // Read the user's input as a sentence
        String sentence = scanner.nextLine();

        // Initialize counters for letters and digits
        int letterCount = 0;
        int digitCount = 0;

        // Iterate through each character in the sentence
        for (char ch : sentence.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                letterCount++;
            }
            // Check if the character is a digit
            else if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        // Display the number of letters and digits in the sentence
        System.out.println("Number of letters: " + letterCount);
        System.out.println("Number of digits: " + digitCount);
    }
}
