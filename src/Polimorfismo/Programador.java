package Polimorfismo;

class Programador extends Empleado {

    Programador(String nombre) {
        super(nombre);
    }

    @Override
    void trabajar() {
        System.out.println(nombre + " está programando.");
    }
}