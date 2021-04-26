import java.util.Scanner;

public class PagoTarjeta extends Pago {
    private String ccv;
    private String numTarjeta;
    private double dineroT;

    Scanner entrada = new Scanner(System.in);

    public double calcularPago() {

        System.out.println("ingrese el numero de su tarjeta");
        numTarjeta = entrada.next();
        int i = 0;
        /*
         * do { int longitud = numTarjeta.length();
         * System.out.println("ingrese un tarjeta valida"); i++;
         * 
         * } while (numTarjeta > length(16) || numTarjeta < length(16));
         */

        System.out.println("ingrese el ccv de su tarjeta");
        ccv = entrada.next();
        System.out.println("ingrese el monto");
        dineroT = entrada.nextDouble();

        return dineroT;

    }

}