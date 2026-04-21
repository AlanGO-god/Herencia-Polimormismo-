interface Programador {
    void programar();
}

interface Diseñador {
    void diseñar();
}

class Ingeniero implements Programador, Diseñador {

    public void programar() {
        System.out.println("Programando sistema...");
    }

    public void diseñar() {
        System.out.println("Diseñando interfaz...");
    }
}