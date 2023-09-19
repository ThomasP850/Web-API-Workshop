import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class WebApisJava {
    public static final String REQUEST_URL = "https://eonet.gsfc.nasa.gov/api/v2.1/categories/8?status=closed&limit=5";

    public static void main(String[] args) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest req = HttpRequest.newBuilder(URI.create(REQUEST_URL)).GET().build();
            
            HttpResponse<String> res = client.send(req, BodyHandlers.ofString());
    
            System.out.println(res.body());
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
