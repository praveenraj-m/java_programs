import java.util.HashMap;

public class CurrencyConverter {
    public static void main(String[] args) {
        double amount = 100;
        String fromCurrency = "USD";
        String toCurrency = "INR";

        // Replace with actual conversion rates
        HashMap<String, Double> conversionRates = new HashMap<>();
        conversionRates.put("USD", 1.20);
        conversionRates.put("EUR", 1.00);
        conversionRates.put("GBP", 0.85);
        conversionRates.put("INR", 90.0);  // Example conversion rate for INR

        double result = convertCurrency(amount, fromCurrency, toCurrency, conversionRates);
        System.out.printf("%.2f %s is equal to %.2f %s\n", amount, fromCurrency, result, toCurrency);
    }

    private static double convertCurrency(double amount, String fromCurrency, String toCurrency, HashMap<String, Double> conversionRates) {
        if (conversionRates.containsKey(fromCurrency) && conversionRates.containsKey(toCurrency)) {
            return amount * (conversionRates.get(toCurrency) / conversionRates.get(fromCurrency));
        } else {
            System.out.println("Invalid currency code");
            return -1;
        }
    }
}
