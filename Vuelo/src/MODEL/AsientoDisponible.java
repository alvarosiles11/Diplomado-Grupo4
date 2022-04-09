package MODEL;

import org.json.JSONObject;

public class AsientoDisponible {

    JSONObject asiento; // INFO: DEL MICROSERVICIO AERONAVE.
    Double precio;
    String clase;

    public AsientoDisponible(JSONObject asiento, Double precio, String clase) {
        this.precio = precio;
        this.clase = clase;
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "\n[ASIENTOS_DISPONIBLES]: " + this.precio + " - " + this.clase + " - " + this.asiento.toString();
    }
}
