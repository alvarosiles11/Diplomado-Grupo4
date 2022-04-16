package MODEL;

import org.json.JSONObject;

public class Marca extends DefaultModel {

    private String descripcion;

    public Marca(String descripcion) {
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
        return "[ Marca ][ descripcion:"+this.getDescripcion()+" ]" + super.toString();
    }

    @Override
    public JSONObject toJson() {
        return super.toJson().put("descripcion", getDescripcion());
    }
}
