package MODEL;

import org.json.JSONObject;

public class Mantenimiento extends DefaultModel {

    private String descripcion;

    public Mantenimiento(String descripcion, Marca marca) {
        super();
        this.descripcion = descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "[ Mantenimiento ][ descripcion:" + this.getDescripcion() + " ]" + super.toString();
    }

    @Override
    public JSONObject toJson() {
        return super.toJson().put("descripcion", getDescripcion());
    }
}
