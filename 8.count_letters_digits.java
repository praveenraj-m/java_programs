import java.util.Scanner;

public class LetterDigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int letterCount = 0;
        int digitCount = 0;

        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        System.out.println("Number of letters: " + letterCount);
        System.out.println("Number of digits: " + digitCount);
    }
}
