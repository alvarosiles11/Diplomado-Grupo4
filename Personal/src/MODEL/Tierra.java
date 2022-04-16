package MODEL;

public class Tierra extends Cargo {

    public Tierra(Double sueldo, String descripcion, String nombre, String apellido, String emailAddress) {
        super(sueldo, descripcion, nombre, apellido, emailAddress);
    }

    @Override
    public String toString() {
        return "Tierra{" + " Sueldo= " + this.getSueldo() + ", descripción_cargo= " + this.getDescripcion()
                + '}';
    }

}
