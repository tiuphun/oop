package Jsoup;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebsiteCrawler {
    
    public static void main(String[] args) {
        
        String url = "https://www.example.com"; // URL of the website to crawl
        
        try {
            // Connect to the website and retrieve HTML content
            Document document = Jsoup.connect(url).get();
            
            // Extract page title
            String title = document.title();
            System.out.println("Title: " + title);
            
            // Extract all links on the page
            Elements links = document.select("a[href]");
            for (Element link : links) {
                System.out.println("Link: " + link.attr("href"));
            }
            
            // Extract all images on the page
            Elements images = document.select("img[src]");
            for (Element image : images) {
                System.out.println("Image: " + image.attr("src"));
            }
            
            // Extract specific element on the page (e.g. paragraph with class "lead")
            Element leadParagraph = document.select("p.lead").first();
            System.out.println("Lead Paragraph: " + leadParagraph.text());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
