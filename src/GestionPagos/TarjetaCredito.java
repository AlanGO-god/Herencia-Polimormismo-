package GestionPagos;

public class TarjetaCredito extends MetodoPago {
    private String numeroTarjeta;

    public TarjetaCredito(String titular, String numeroTarjeta) {
        super(titular);
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("--- PAGO CON TARJETA ---");
        System.out.println("Validando tarjeta: " + numeroTarjeta);
        System.out.println("Cobro exitoso de $" + monto + " a la cuenta de " + titular);
    }
}
