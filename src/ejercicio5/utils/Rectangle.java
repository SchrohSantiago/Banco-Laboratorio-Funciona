package ejercicio5.utils;

public class Rectangle extends Shape {
    private double ancho;
    private double alto;

    public Rectangle(double x, double y, double ancho, double alto) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectangulo de ancho " + ancho + " y alto " + alto + " en (" + x + ", " + y + ")");
    }

    @Override
    public void redimensionar(double factorEscala) {
        ancho *= factorEscala;
        alto *= factorEscala;
        System.out.println("Cambiando el tamano del rectangulo. Nuevo tamano: " + ancho + "x" + alto);
    }

    @Override
    public void mover(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
        System.out.println("Moviendo el rectangulo a (" + x + ", " + y + ")");
    }
}
