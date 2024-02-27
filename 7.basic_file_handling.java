import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        String file_path = "example.txt";

        // Writing to a file
        try (FileWriter writer = new FileWriter(file_path)) {
            writer.write("Hello, this is a sample file.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(file_path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
