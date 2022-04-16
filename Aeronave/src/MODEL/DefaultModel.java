package MODEL;

import java.util.Date;
import java.util.UUID;

import org.json.JSONObject;

public class DefaultModel {

    private String key;
    private Date fecha_on;
    private int estado;

    public DefaultModel() {
        this.key = UUID.randomUUID().toString();
        this.fecha_on = new Date();
        this.estado = 1;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setFecha_on(Date fecha_on) {
        this.fecha_on = fecha_on;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getEstado() {
        return estado;
    }

    public Date getFecha_on() {
        return fecha_on;
    }

    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "[key:" + key + ", fecha_on:" + fecha_on + ", estado:" + estado + "]";
    }

    public JSONObject toJson(){
        JSONObject obj = new JSONObject();
        obj.put("key", this.getKey());
        obj.put("fecha_on", this.getFecha_on());
        obj.put("estado", this.getEstado());
        return obj;
    }
}
