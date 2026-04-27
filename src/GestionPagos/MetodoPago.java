package GestionPagos;

public class MetodoPago {
    protected String titular;

    public MetodoPago(String titular) {
        this.titular = titular;
    }

    // Método que será sobreescrito (Polimorfismo Dinámico)
    public void procesarPago(double monto) {
        System.out.println("Procesando pago genérico de $" + monto + " para: " + titular);
    }

    // SOBRECARGA: Mismo nombre, diferente firma (Polimorfismo Estático)
    public void procesarPago(double monto, double seguro) {
        double total = monto + seguro;
        System.out.println("Procesando pago con SEGURO incluido.");
        System.out.println("Titular: " + titular + " | Total a cobrar: $" + total);
    }
}