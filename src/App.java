public class App {
    public static void main(String[] args) throws Exception {
        Conversor c = new Conversor();
        c.mostrarTipo(10); // int   
        c.mostrarTipo(10.5); // double
        c.mostrarTipo(10.5f); // float
                                
        /*
         * Conversor c = new Conversor();
         * c.mostrarTipo(10); // int
         * c.mostrarTipo(10.5); // double
         * c.mostrarTipo(10.5f); // float
         * 
         * // Conversión implícita
         * int a = 5;
         * c.mostrarTipo(a); // int → exact match
         * 
         * // Conversión implícita a tipo mayor
         * c.mostrarTipo(5); // puede ir a int o double → elige int (más específico)
         */

        /*
         * Cuenta c1 = new Cuenta();
         * Cuenta c2 = new Cuenta();
         * 
         * c1.depositar(1000);
         * c1.depositar(500, "Pago nómina");
         * c1.depositar(c2, 200);
         */

        /*
         * Vector v1 = new Vector(2, 3);
         * Vector v2 = new Vector(1, 4);
         * 
         * Vector resultado = v1.sumar(v2);
         * resultado.mostrar(); // (3,7)
         */

        /*
         * Gerente g = new Gerente();
         * g.nombre = "Ana";
         * g.salario = 15000;
         * System.out.println(g.nombre.toString());
         * 
         * 
         * g.trabajar();
         * g.supervisar();
         */

        //int resultado = 10 / 0;
        try {
            int resultado = 10 / 1; // Esto genera una excepción
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero.");
        }
        System.out.println("El programa continúa.");

    }
}
