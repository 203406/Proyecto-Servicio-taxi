import java.util.Scanner;

public class PagoEfectivo extends Pago {
    private double efectivo;
    Scanner entrada = new Scanner(System.in);

    public double calcularPago() {
        double monto;
        System.out.println("ingrese el monto en efectivo");
        monto = entrada.nextInt();
        while (monto < 0) {
            System.out.println("Ingrese una cantidad vaida");

        }
        double cambio;
        cambio = monto - efectivo;
        System.out.println("su cambio es: " + cambio);
        return efectivo;
    }

}
