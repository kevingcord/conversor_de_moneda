package modelos;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Conversor {

    private JsonObject tasas;

    public Conversor(String json) {

        JsonObject objeto = JsonParser.parseString(json).getAsJsonObject();
        tasas = objeto.getAsJsonObject("conversion_rates");

    }

    public double convertir(String monedaOrigen, String monedaDestino, double monto) {

        double tasaOrigen = tasas.get(monedaOrigen).getAsDouble();
        double tasaDestino = tasas.get(monedaDestino).getAsDouble();

        double montoUSD = monto / tasaOrigen;

        return montoUSD * tasaDestino;

    }
}