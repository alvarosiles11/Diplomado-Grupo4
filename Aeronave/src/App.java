import MODEL.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Marca m_boeing = new Marca("Boeing");
        Modelo m_boeing_737 = new Modelo("737", m_boeing);
        Modelo m_boeing_734 = new Modelo("747", m_boeing);
        
        System.out.println(m_boeing.toJson());
    }
}
