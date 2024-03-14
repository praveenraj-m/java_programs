import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class currency {
    public static void convertCurrency(double amount, String fromCurrency, String toCurrency) {
        try {
            // API URL for fetching exchange rates
            String apiUrl = "https://v6.exchangerate-api.com/v6/79c4fa1306937cdc8e97ba63/latest/USD";

            // Create a URL object and open a connection
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Read the API response
            Scanner scanner = new Scanner(connection.getInputStream());
            StringBuilder response = new StringBuilder();
            while (scanner.hasNextLine()) {
                response.append(scanner.nextLine());
            }
            scanner.close();

            // Parse the JSON response
            JSONObject jsonResponse = new JSONObject(response.toString());

            // Check if the API request was successful
            if (jsonResponse.getString("result").equals("success")) {
                // Get conversion rates from the API response
                JSONObject rates = jsonResponse.getJSONObject("conversion_rates");

                // Check if both source and target currencies are in the conversion rates
                if (rates.has(fromCurrency) && rates.has(toCurrency)) {
                    // Perform the currency conversion
                    double conversionRate = rates.getDouble(toCurrency) / rates.getDouble(fromCurrency);
                    double convertedAmount = amount * conversionRate;
                    System.out.printf("%.2f %s is equal to %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
                } else {
                    // If either the source or target currency is not in the API response, return an error message
                    System.out.println("Invalid currency code");
                }
            } else {
                // If the API request fails or the response indicates an error, print an error message
                System.out.println("Error: " + jsonResponse.getString("error"));
            }

        } catch (Exception e) {
            // Handle other exceptions (e.g., network issues)
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Example usage with user prompts
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the amount: ");
            double amount = Double.parseDouble(scanner.nextLine());

            System.out.println("Please type the currency code listed correctly \n'USD'\n'EUR',\n'GBP'\n'INR'");
            System.out.print("Enter the from currency: ");
            String fromCurrency = scanner.nextLine().toUpperCase();

            System.out.print("Enter the to currency: ");
            String toCurrency = scanner.nextLine().toUpperCase();

            convertCurrency(amount, fromCurrency, toCurrency);

            // Ask if the user wants to perform another conversion
            System.out.print("Do you want to perform another conversion? (yes/no): ");
            String anotherConversion = scanner.nextLine().toLowerCase();
            if (!anotherConversion.equals("yes")) {
                System.out.println("Goodbye!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value for the amount.");
        }
    }
}
