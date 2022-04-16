package MODEL;

public class Aire extends Cargo {

    private Double Horas_vuelo;
    private Double Nro_millas;

    public Aire(Double sueldo, String descripcion, String nombre, String apellido, String emailAddress,
            Double Horas_vuelo, Double Nro_millas) {
        super(sueldo, descripcion, nombre, apellido, emailAddress);
        this.Horas_vuelo = Horas_vuelo;
        this.Nro_millas = Nro_millas;
    }

    public Double getHoras_vuelo() {
        return Horas_vuelo;
    }

    public void setHoras_vuelo(double horas_vuelo) {
        this.Horas_vuelo = horas_vuelo;
    }

    public Double getNro_millas() {
        return Nro_millas;
    }

    public void setNro_millas(double nro_millas) {
        this.Nro_millas = nro_millas;
    }

    @Override
    public String toString() {
        return "Aire{" + " Sueldo= " + this.getSueldo() + ", descripción_cargo= " + this.getDescripcion() + ", "
                + "Horas_vuelo= " + Horas_vuelo + ", Nro_millas= " + Nro_millas + '}';
    }

}
