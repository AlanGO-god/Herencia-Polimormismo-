package Polimorfismo;

class Empleado {

    String nombre;

    Empleado(String nombre) {
        this.nombre = nombre;
    }

    void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }
}
