package ejercicio5.utils;

public class Triangle extends Shape {
    private double base;
    private double altura;

    public Triangle(double x, double y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triangulo de base " + base + " y altura " + altura + " en (" + x + ", " + y + ")");
    }

    @Override
    public void redimensionar(double factorEscala) {
        base *= factorEscala;
        altura *= factorEscala;
        System.out.println("Cambiando el tamano del triangulo. Nueva base: " + base + ", nueva altura: " + altura);
    }

    @Override
    public void mover(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
        System.out.println("Moviendo el triangulo a (" + x + ", " + y + ")");
    }
}
