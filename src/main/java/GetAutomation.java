import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetAutomation {
    public static void main(String [] args) throws Exception {

        String url = "https://jsonplaceholder.typicode.com/posts/1";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();

        HttpResponse <String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println("Status code: "+response.statusCode());
        System.out.println("Status Body: "+response.body());
    }
}
