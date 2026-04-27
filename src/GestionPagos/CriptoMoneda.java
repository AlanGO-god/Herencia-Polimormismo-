package GestionPagos;

public class CriptoMoneda extends MetodoPago {
    private String walletAddress;

    public CriptoMoneda(String titular, String walletAddress) {
        super(titular);
        this.walletAddress = walletAddress;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("--- PAGO CON CRIPTO ---");
        System.out.println("Generando hash de transacción para la billetera: " + walletAddress);
        System.out.println("Transferencia de $" + monto + " en progreso...");
    }
}
