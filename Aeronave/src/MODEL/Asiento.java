package MODEL;

import org.json.JSONObject;

public class Asiento extends DefaultModel {

    private String clase;
    private int numero;

    public Asiento(String clase, int numero) {
        super();
        this.clase = clase;
        this.numero = numero;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getClase() {
        return clase;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "[ Asiento ][ clase:" + this.getClase() + " ]" + super.toString();
    }

    @Override
    public JSONObject toJson() {
        return super.toJson().put("clase", getClase());
    }
}
