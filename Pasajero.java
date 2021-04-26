import java.util.Scanner;

public class Pasajero {
    private String nombre;
    private String apellido;
    private int numPasajeros; // solo pueden ir hasta 4 personas
    Scanner entrada = new Scanner(System.in);

    public Pasajero(String nombre, String apellido, int numPasajeros) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.numPasajeros = numPasajeros;

    }

    public Pasajero() {
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    /*
     * @Override public String toString() { return "Pasajero [ nombre" + nombre +
     * "apellido" + apellido + "numeros de pasajero " + numPasajeros + "]"; }
     */

    public void registroPasajero() {
        System.out.println("ingrese su nombre");
        nombre = entrada.next();
        System.out.println("ingrese su apellido");
        apellido = entrada.next();
       do{
            System.out.println("ingrese la cantidad de pasajeros");
            numPasajeros = entrada.nextInt();

       }while(numPasajeros < 0 && numPasajeros < 5);
      //  System.out.println("Ingrese un dato valido");



    }
}