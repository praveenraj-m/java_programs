import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherTest {
    public static void main(String[] args) {
        // Get user input for the city name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the city name: ");
        String city = scanner.nextLine();

        // Replace with actual OpenWeatherMap API key
        String apiKey = "c9988ab52aacedc0c0533b4287c2a35d";

        // Construct the URL for the OpenWeatherMap API request
        String weatherUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;

        try {
            // Make the API request
            String response = getWeatherData(weatherUrl);

            // Print the weather information
            System.out.println(response);
        } catch (FileNotFoundException e) {
            // Handle FileNotFoundException and print a user-friendly error message
            System.out.println("Error: City not found. Please enter a valid city name.");
        } catch (Exception e) {
            // Handle other exceptions (e.g., network issues, JSON parsing errors)
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static String getWeatherData(String url) throws Exception {
        // Make the API request
        return new java.util.Scanner(new java.net.URL(url).openStream(), "UTF-8").useDelimiter("\\A").next();
    }
}
