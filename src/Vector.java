class Vector {

    int x, y;

    Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Vector sumar(Vector otro) {
        return new Vector(this.x + otro.x, this.y + otro.y);
    }

    void mostrar() {
        System.out.println("(" + x + ", " + y + ")");
    }
}