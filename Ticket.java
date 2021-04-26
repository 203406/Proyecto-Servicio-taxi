import java.util.Calendar;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
//import java.util.Scanner;
import java.io.BufferedWriter;

public class Ticket {
    static BufferedWriter bw;

    public static void facturar() {
        try {
            generarArchivo();
        } catch (IOException e) {
            System.out.println("NO SE PUDO ESCRIBIR EN EL ARCHIVO");
        }

    }

    public static void generarArchivo() throws IOException {
        File factura = new File("factura.txt");
        Pasajero pasajero = new Pasajero();
        Destino destino = new Destino();
        bw = new BufferedWriter(new FileWriter(factura, true));
        Calendar fechaActual = Calendar.getInstance();
        String fechaHoy = obtenerFecha(fechaActual);

        int folio = 0;
        folio = (int) (Math.random() * 1000 + 9999);

        bw.write("_______________________________________________________" + "\r\n");
        bw.write(" ¨SERVICIO TAXI PLUS¨ " + "\r\n");
        bw.write("Nombre: " + pasajero.getNombre() + "\r\n");
        bw.write("apellido: " + pasajero.getApellido() + "\r\n");
        bw.write("Numeros de pasajeros: " + pasajero.getNumPasajeros() + "\r\n");
        bw.write("Ciudad: " + "\r\n");
        bw.write("Zona de la ciudad: " + destino.getZonaCiudad() + "\r\n");
        bw.write("Precio : " + destino.getPrecioZonaCiudad() + "\r\n");
        bw.write("Numero de folio: " + folio + "   " + "unidad asiganadad" + "\r\n");
        bw.write(fechaHoy + "\r\n");
        bw.write("Chiapa de corzo, Chiapas, Mexico" + "\r\n");
        bw.write("GRACIAS POR SU PREFERENCIA" + "\r\n");
        bw.write("_______________________________________________________" + "\r\n");
        bw.close();
    }

    public static String obtenerFecha(Calendar fechaActual) {
        int fmes = fechaActual.get(Calendar.MONTH);
        int fanio = fechaActual.get(Calendar.YEAR);
        int fdia = fechaActual.get(Calendar.DAY_OF_MONTH);
        System.out.println("numero de mes: " + fmes + " Anio: " + fanio + " Dia:" + fdia);
        fmes = fmes + 1;
        String fechaHoy = "Dia: " + fdia + "/" + "Mes: " + fmes + "/" + "Anio: " + fanio;
        return fechaHoy;

    }

}