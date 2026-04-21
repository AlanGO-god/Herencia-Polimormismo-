package Polimorfismo;

class Diseñador extends Empleado {

    Diseñador(String nombre) {
        super(nombre);
    }

    @Override
    void trabajar() {
        System.out.println(nombre + " está diseñando interfaces.");
    }
}
