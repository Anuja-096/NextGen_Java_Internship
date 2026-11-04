
import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.io.OutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Task13RestAPI {

    public static void main(String[] args) throws IOException {

        HttpServer server = HttpServer.create(
                new InetSocketAddress(8080), 0);

        server.createContext("/hello", exchange -> {
            String response = "{\"message\":\"Hello! Welcome to Java REST API\"}";
            exchange.getResponseHeaders().set(
                    "Content-Type", "application/json");
            byte[] data = response.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(200, data.length);

            try (OutputStream os = exchange.getResponseBody()) {
                os.write(data);
            }
        });

        server.createContext("/student", exchange -> {
            String response =
                    "{\"name\":\"Anuja\",\"course\":\"ENTC\",\"year\":2027}";
            exchange.getResponseHeaders().set(
                    "Content-Type", "application/json");
            byte[] data = response.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(200, data.length);

            try (OutputStream os = exchange.getResponseBody()) {
                os.write(data);
            }
        });

        server.start();

        System.out.println("REST API Server Started!");
        System.out.println("Open http://localhost:8080/hello");
        System.out.println("Open http://localhost:8080/student");
    }
}
