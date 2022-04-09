package MODEL;

import java.util.UUID;
import org.json.JSONObject;

public class Tripulante {
    String key;
    String descripcion;
    JSONObject personal;

    public Tripulante(String descripcion, JSONObject personal) {
        this.key = UUID.randomUUID().toString();
        this.descripcion = descripcion;
        this.personal = personal;
    }

    @Override
    public String toString() {
        return "\n[TRIPULANTE]: " + this.descripcion + " - " + this.personal.toString();
    }
}
