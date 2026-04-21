class Cuenta {

    double saldo;

    // Depositar efectivo
    void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito en efectivo: " + monto);
    }

    // Depositar con referencia
    void depositar(double monto, String referencia) {
        saldo += monto;
        System.out.println("Depósito con referencia: " + referencia);
    }

    // Depositar desde otra cuenta
    void depositar(Cuenta origen, double monto) {
        origen.saldo -= monto;
        saldo += monto;
        System.out.println("Transferencia recibida: " + monto);
    }
}