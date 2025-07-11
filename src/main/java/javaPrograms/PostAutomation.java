package javaPrograms;

import java.net.URI;
import java.net.http.*;

public class PostAutomation {
    public static void main(String [] args) throws Exception {

        String url = "https://jsonplaceholder.typicode.com/posts";
        String json = """
				{
                    "title": "Java HTTP",
                    "body": "HttpClient is awesome!",
                    "userId": 101
                }
                """;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type","application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();

        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println("Status code: "+response.statusCode());
        System.out.println("Status Body: "+response.body());
    }

}
