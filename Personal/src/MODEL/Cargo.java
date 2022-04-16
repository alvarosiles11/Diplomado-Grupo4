package MODEL;

import java.util.Date;

public abstract class Cargo extends Personal {
    
    private String descripcion;
    private Double sueldo;
    private Date fecha_ingreso;
    
    public Cargo(){
        
    }

    public Cargo(Double sueldo, String descripcion, String nombre, String apellido, String emailAddress) {
        super(nombre, apellido, emailAddress);
       
        this.descripcion = descripcion;
        this.sueldo = sueldo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public String toString() {
        return "Cargo{" + "descripcion=" + descripcion + ", sueldo=" + sueldo + '}';
    }
}