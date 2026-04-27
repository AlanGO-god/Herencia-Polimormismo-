package GestionPagos;

import java.util.ArrayList;
import java.util.List;

public class GestionTienda {
    public static void main(String[] args) {
        // Creamos una lista de la clase padre
        List<MetodoPago> pasarelaDePagos = new ArrayList<>();

        // Creamos objetos de las clases hijas 
        MetodoPago pago1 = new TarjetaCredito("Carlos Ramirez", "4111-2222-3333-4444");
        MetodoPago pago2 = new PayPal("Laura Martinez", "l.martinez@email.com");
        MetodoPago pago3 = new CriptoMoneda("Vitalik", "0xDEF456UVW...");

        // Agregamos diferentes objetos de clases hijas (Upcasting)
        pasarelaDePagos.add(new TarjetaCredito("Juan Perez", "4540-1234-5678-9012"));
        pasarelaDePagos.add(new PayPal("Maria Lopez", "m.lopez@email.com"));
        pasarelaDePagos.add(new CriptoMoneda("Satoshi", "0xABC123XYZ..."));

        System.out.println("=== INICIANDO PROCESAMIENTO POR LOTES ===");
        
        for (MetodoPago pago : pasarelaDePagos) {
            // Se ejecuta el método sobreescrito de cada hijo (Polimorfismo Dinámico)
            pago.procesarPago(1500.00);
            System.out.println("-----------------------------------------");
        }

        // Ejemplo de SOBRECARGA (usando la referencia del padre)
        System.out.println("\n=== CASO ESPECIAL: PAGO CON SEGURO ===");
        MetodoPago pagoEspecial = new TarjetaCredito("Ana Gomez", "5500-0000-1111-2222");
        pagoEspecial.procesarPago(2000.00, 50.00); // Llama al método con dos parámetros
    }
}
