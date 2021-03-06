
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


class HttpClientAPI{
    public static void main(String[] args) {
        String uri="https://httpbin.org/get";
        HttpRequest req=HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .GET()
                .version(HttpClient.Version.HTTP_2)
                .build();
        HttpClient client=HttpClient.newBuilder().build();

        try {
           HttpResponse<String> resp= client.send(req, HttpResponse.BodyHandlers.ofString());
           System.out.println(resp.headers());
            System.out.println("Status code :"+resp.statusCode());
            System.out.println(resp.body());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

	
}