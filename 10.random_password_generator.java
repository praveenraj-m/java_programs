import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        // Set the desired password length
        int passwordLength = 12;
        
        // Generate a random password
        String generatedPassword = generateRandomPassword(passwordLength);
        
        // Display the generated password
        System.out.println("Generated Password: " + generatedPassword);
    }

    // Function to generate a random password
    private static String generateRandomPassword(int length) {
        // Define the characters to be used in the password
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_+=<>?/{}[]|";
        
        // StringBuilder to build the password
        StringBuilder password = new StringBuilder(length);
        
        // Generate each character of the password randomly
        for (int i = 0; i < length; i++) {
            // Get a random index within the range of characters
            int randomIndex = new Random().nextInt(characters.length());
            
            // Append the randomly selected character to the password
            password.append(characters.charAt(randomIndex));
        }
        
        // Convert the StringBuilder to a String and return the generated password
        return password.toString();
    }
}
