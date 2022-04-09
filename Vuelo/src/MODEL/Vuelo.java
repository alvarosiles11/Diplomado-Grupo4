package MODEL;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.json.JSONArray;
import org.json.JSONObject;

public class Vuelo {

    String key;
    String numeroVuelo;
    JSONObject aeronave;
    ArrayList<Tripulante> listaTripulante;
    ArrayList<AsientoDisponible> listaAsiento;
    JSONObject aeropuertoOrigen;
    JSONObject aeropuertoDestino;
    Date fecha_arribe; // INFO: YYYY-MM-DD HH:MM:SS
    Date fecha_salida;
    double precio;

    public Vuelo(Date fecha_salida, Date fecha_arribe, double precio) {
        this.key = UUID.randomUUID().toString();
        this.numeroVuelo = null;// INFO: Solicitar al aeropuerto cuendo se completen los datos requeridos.
        // this.aeronave = aeronave;
        this.aeronave = null;
        this.listaTripulante = new ArrayList<Tripulante>(); // INFO: Luego se asignan tripulantes en el vuelo.
        this.precio = precio;
        this.listaAsiento = crear_acientos_disponibles();
        this.aeropuertoOrigen = null; // TODO
        this.aeropuertoDestino = null; // TODO
        this.fecha_arribe = fecha_arribe;
        this.fecha_salida = fecha_salida;
        System.out.println("Se a creado un nuevo vuelo");

    }

    public ArrayList<AsientoDisponible> crear_acientos_disponibles() {
        if (this.aeronave == null) {
            System.out.println("No existe una aeronave asignada para crear los asientos disponibles.");
            return null;
        }

        JSONArray asientos_de_aeronave = this.aeronave.getJSONArray("asientos");
        ArrayList<AsientoDisponible> arr = new ArrayList<AsientoDisponible>();
        for (int i = 0; i < asientos_de_aeronave.length(); i++) {
            JSONObject asiento = asientos_de_aeronave.getJSONObject(i);
            arr.add(new AsientoDisponible(asiento, this.precio, asiento.getString("clase")));
        }
        System.out.println("Se crearon los asientos disponibles");
        return arr;
    }

    public void setAeronave(JSONObject aeronave) {
        this.aeronave = aeronave;
        this.listaAsiento = crear_acientos_disponibles();
    }

    public void setAeropuertoOrigen(JSONObject aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
    }

    public void setAeropuertoDestino(JSONObject aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
    }

    public void asignarTripulante(Tripulante t) {
        this.listaTripulante.add(t);
    }

    @Override
    public String toString() {
        return "\n[VUELO]: " + this.key + "\n" +
                "Aeronave: " + this.aeronave + "\n" +
                "Tripulantes: " + this.listaTripulante + "\n" +
                "Asientos: " + this.listaAsiento + "\n" +
                "Aeropuerto Origen: " + this.aeropuertoOrigen + "\n" +
                "Aeropuerto Destino: " + this.aeropuertoDestino + "\n" +
                "Fecha Arribe: " + this.fecha_arribe + "\n" +
                "Fecha Salida: " + this.fecha_salida + "\n";
    }
}