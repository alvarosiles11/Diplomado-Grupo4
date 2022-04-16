package MODEL;

import org.json.JSONObject;

public class Ruta extends DefaultModel {

    private String inicio;
    private String fin;

    public Ruta(String inicio, String fin) {
        super();
        this.inicio = inicio;
        this.fin = fin;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getInicio() {
        return inicio;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }
    public String getFin() {
        return fin;
    }

    @Override
    public String toString() {
        return "[ Ruta ][ inicio:" + this.getInicio() + ", fin:"+this.getFin()+" ]" + super.toString();
    }

    @Override
    public JSONObject toJson() {
        return super.toJson().put("inicio", this.inicio).put("fin",this.fin);
    }
}
