package servicios;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    private final String API_KEY = "759130a808cd806fcd31d343";

    public String obtenerDatos() {

        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/USD";

        HttpClient cliente = HttpClient.newHttpClient();

        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        try {

            HttpResponse<String> respuesta = cliente.send(
                    solicitud,
                    HttpResponse.BodyHandlers.ofString()
            );

            return respuesta.body();

        } catch (Exception e) {

            throw new RuntimeException("Error al consultar la API");

        }
    }
}