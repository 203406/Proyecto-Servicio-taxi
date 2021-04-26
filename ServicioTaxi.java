
import java.util.Scanner;
import java.util.ArrayList;

public class ServicioTaxi {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pasajero pasajero = new Pasajero();
        int opcionSalir = 1;
        do {
            System.out.println("BIENVENIDO(A)");
            System.out.println("SERVICIO TAXI ´PLUS´ ");
            pasajero.registroPasajero();
            registrar();

            System.out.println("Desea seguir registrando usuarios");
            System.out.println("SI precione cualquier numero \n NO presione el numero 0");
            opcionSalir = entrada.nextInt();

        } while (opcionSalir != 0);
        System.out.println("Cerrando programa ...");

    }

    public static void registrar() {

        Scanner entrada = new Scanner(System.in);
        // pasajero.registroPasajero();
        ArrayList<Destino> listaDestino = new ArrayList<>();

        Ticket ticket1 = new Ticket();

        Tuxtla tuxtla = new Tuxtla();
        Suchiapa suchiapa = new Suchiapa();
        Comitan comitan = new Comitan();
        Sancris sanCris = new Sancris();

        listaDestino.add(tuxtla);
        listaDestino.add(suchiapa);
        listaDestino.add(comitan);
        listaDestino.add(sanCris);

        int opcionD;

        do {

            System.out.println("Seleccione su destino");
            System.out.println("1. Tuxtla \n 2.Suchiapa \n 3.San cris \n 4. Comitan ");
            opcionD = entrada.nextInt();


        } while (opcionD < 0 && opcionD >=5);


        switch (opcionD) {
        case 1:
            if (opcionD == 1) {
                System.out.println("...................................");
                System.out.println("Tuxtla Gutierrez");
                System.out.println("Zona Sur: $300 \n Zona Centro: $330 \n Zona Norte: $350");
                tuxtla.registroDestino();
                System.out.println("...................................");
            }
            break;
        case 2:
            if (opcionD == 2) {
                System.out.println(".................................");
                System.out.println("Suchiapa");
                System.out.println("Zona Sur: $200 \n Zona Centro: $250 \n Zona Norte: $280");
                suchiapa.registroDestino();
                System.out.println("..................................");
            }
            break;
        case 3:
            if (opcionD == 3) {
                System.out.println("...............................,");
                System.out.println("San Cristobal");
                System.out.println("Zona Sur: $720 \n Zona Centro: $750 \n Zona Norte: $800");
                sanCris.registroDestino();
                System.out.println("..........................,....");
            }
            break;
        case 4:
            if (opcionD == 4) {
                System.out.println("..............................");
                System.out.println("Comitan");
                System.out.println("Zona Sur: $1500 \n Zona Centro: $1600 \n Zona Norte: $1650");
                comitan.registroDestino();
                System.out.println("................................");
            }
            break;
        default:
            System.out.println("INgrese una opcion valida");
        }
        int opcionP;
        System.out.println("Ingrese el metodo con el que desea pagar");
        System.out.println("1.Pago con Tarjeta \n 2. Pago Efectivo");
        opcionP = entrada.nextInt();
        switch (opcionP) {
        case 1:
            if (opcionP == 1) {
                PagoTarjeta pt = new PagoTarjeta();
                pt.calcularPago();
            }
            break;
        case 2:
            if (opcionP == 2) {
                PagoEfectivo pe = new PagoEfectivo();
                pe.calcularPago();
            }
            break;
        default:
            System.out.println("Ingrese una opcion valida");
        }
        ticket1.facturar();
        System.out.println("...............................");
        System.out.println("se ha completado su registro");
        System.out.println("Se Esta imprimiendo su factura");
        System.out.println("...............................");

    }

}