import java.util.Date;
import java.util.UUID;


import MODEL.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola vamos a crear un PERSONAL!");
        System.out.println("");

        Personal personal = new Personal();
        Aire personalAire = new Aire(3000.99, "Piloto", "Javier ", "Flores","javi@gmail.com",125.5,236.8);
        Tierra personalTierra = new Tierra(4500.99, "Logística", "Ricardo ", "Paz","pz@gmail.com");
       
        personal.registrar(personalAire);
        personal.registrar(personalTierra);
        System.out.println("");

    }

}
