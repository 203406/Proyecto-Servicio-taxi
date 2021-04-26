import java.util.Scanner;
import java.util.ArrayList;

public class Destino {
    // public static final String getPrecioZonaCiudad = null;
    protected String zonaCiudad;
    protected double precioZonaCiudad;
    protected String direccion;
    Scanner entrada = new Scanner(System.in);
    static ArrayList<String> listaDestino = new ArrayList<>();

    public Destino(String zonaCiudad, double precioZonaCiudad, String direccion) {
        this.zonaCiudad = zonaCiudad;
        this.precioZonaCiudad = precioZonaCiudad;
        this.direccion = direccion;

    }

    public Destino() {
    }

    public String getZonaCiudad() {
        return zonaCiudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getPrecioZonaCiudad() {
        return precioZonaCiudad;
    }

    public void registroDestino() {

        System.out.println("ingrese la zona de la ciudad");
        zonaCiudad = entrada.next();
        System.out.println("Igrese el precio de la ciudad");
        precioZonaCiudad = entrada.nextDouble();
        while (precioZonaCiudad < 0) {
            System.out.println("Ingese una cantidad valida");

        }
        System.out.println("ingrese la direccion");
        direccion = entrada.next();

        // vizualizar();

    }
    /*
     * public String toString(){ return String.format(
     * "%s: %s %s\n%s: %.2f\n%s: %s","Destino. zona ciudad y direccion", zonaCiudad,
     * direccion, "Precio", precioZonaCiudad );
     * 
     * }
     */

    /*
     * public static void vizualizar() { for (int i = 0; i < listaDestino.size();
     * i++) { System.out.println(listaDestino.get(i)); }
     * listaDestino.add("Tuxtla gutierrez"); listaDestino.add("Suchiapa ");
     * listaDestino.add("Comitan"); listaDestino.add("San Cristobal");
     * System.out.println("Seleccione su destino"); for (int i = 0; i <
     * listaDestino.size(); i++) { System.out.println(listaDestino.get(i)); }
     * 
     * }
     */

}