package MODEL;

import java.util.ArrayList;

// import java.util.ArrayList;
// import java.util.Date;
// import java.util.UUID;


public class Personal {
    private String Nombre;
    private String Apellido;
    private String EmailAddress;

    ArrayList<Cargo> listaPersonal;

    public Personal(){

    }

    public Personal(String nombre, String apellido, String emailAddress) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.EmailAddress = emailAddress;
        this.listaPersonal = new ArrayList<Cargo>(); 
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }
    public String getEmailAddress() {
        return EmailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.EmailAddress = emailAddress;
    }

    public void registrar(Cargo p) {
        System.out.println("\n[PERSONAL]: " + p.getNombre() + " " + p.getApellido() + " - " + p.getEmailAddress());
        System.out.println("\n[CARGO]: " + p.toString() );
    }



    @Override
    public String toString() {
        return "Personal{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", EmailAddress=" + EmailAddress + '}';
    }



}
