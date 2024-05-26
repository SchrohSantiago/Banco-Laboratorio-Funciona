package ejercicio5.utils;

public class Circle extends Shape {
    private double radio;

    public Circle(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo de radio " + radio + " en (" + x + ", " + y + ")");
    }

    @Override
    public void redimensionar(double factorEscala) {
        radio *= factorEscala;
        System.out.println("Cambiando el tamano del circulo. Nuevo radio: " + radio);
    }

    @Override
    public void mover(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
        System.out.println("Moviendo el circulo a (" + x + ", " + y + ")");
    }
}
