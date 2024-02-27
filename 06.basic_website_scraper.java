import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class WebsiteScraper {
    public static void main(String[] args) {
        String url = "https://www.google.com";

        try {
            Document document = Jsoup.connect(url).get();
            Elements links = document.select("a");

            for (Element link : links) {
                System.out.println(link.attr("href"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
