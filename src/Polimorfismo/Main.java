package Polimorfismo;

public class Main {

    public static void main(String[] args) {

        Empleado e1 = new Gerente("Ana");
        Empleado e2 = new Programador("Luis");
        Empleado e3 = new Diseñador("María");

        e1.trabajar();
        e2.trabajar();
        e3.trabajar();

    System.out.println("\n");

        Empleado[] empleados = {
            new Gerente("Itzel"),
            new Programador("Dante"),
            new Diseñador("Alan")
        };

        for (Empleado e : empleados) {
            e.trabajar();
        }
    }
}