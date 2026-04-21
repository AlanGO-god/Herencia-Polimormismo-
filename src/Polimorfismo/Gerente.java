package Polimorfismo;

class Gerente extends Empleado {

    Gerente(String nombre) {
        super(nombre);
    }

    @Override
    void trabajar() {
        System.out.println(nombre + " está dirigiendo el equipo.");
    }
}
