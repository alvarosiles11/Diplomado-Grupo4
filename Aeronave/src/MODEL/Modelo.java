package MODEL;

import org.json.JSONObject;

public class Modelo extends DefaultModel {

    private String descripcion;
    private Marca marca;

    public Modelo(String descripcion, Marca marca) {
        super();
        this.descripcion = descripcion;
        this.marca = marca;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "[ Modelo ][ descripcion:" + this.getDescripcion() + " ]" + super.toString();
    }

    @Override
    public JSONObject toJson() {
        return super.toJson().put("descripcion", getDescripcion());
    }
}
