package GestionPagos;

public class PayPal extends MetodoPago {
    private String email;

    public PayPal(String titular, String email) {
        super(titular);
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("--- PAGO CON PAYPAL ---");
        System.out.println("Redirigiendo a la cuenta de correo: " + email);
        System.out.println("Monto de $" + monto + " autorizado por " + titular);
    }
}
