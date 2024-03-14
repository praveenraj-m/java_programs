import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class WebsiteScraper {
    public static void main(String[] args) {
        // Define the URL of the website to be scraped
        String url = "https://www.google.com";

        try {
            // Connect to the website and get the HTML document
            Document document = Jsoup.connect(url).get();
            
            // Select all anchor elements (links) in the HTML document
            Elements links = document.select("a");

            // Iterate over each link and print its href attribute
            for (Element link : links) {
                System.out.println(link.attr("href"));
            }

        } catch (IOException e) {
            // Handle IOException by printing the stack trace
            e.printStackTrace();
        }
    }
}
