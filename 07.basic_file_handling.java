import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        // Specify the file path
        String file_path = "example.txt";

        // Writing to a file
        try (FileWriter writer = new FileWriter(file_path)) {
            // Write the specified string to the file
            writer.write("Hello, this is a sample file.\n");
        } catch (IOException e) {
            // Handle IOException if it occurs during writing
            e.printStackTrace();
        }

        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(file_path))) {
            String line;
            // Read each line from the file and print to the console
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle IOException if it occurs during reading
            e.printStackTrace();
        }
    }
}
