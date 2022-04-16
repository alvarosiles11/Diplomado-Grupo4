package MODEL;

import org.json.JSONObject;

public class Aeronave extends DefaultModel {

    private String descripcion;
    private Modelo modelo;

    public Aeronave(String descripcion, Modelo modelo) {
        super();
        this.descripcion = descripcion;
        this.modelo = modelo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "[ Aeronave ][ descripcion:" + this.getDescripcion() + " ]" + super.toString();
    }

    @Override
    public JSONObject toJson() {
        return super.toJson().put("descripcion", getDescripcion());
    }
}
