package ejercicio5.utils;

import java.util.ArrayList;
import java.util.List;

public class ShapeList {
    private List<Shape> shapes = new ArrayList<>();

    public void agregarShape(Shape shape) {
        shapes.add(shape);
    }

    public void dibujarTodasLasFiguras() {
        System.out.println("Dibujando todas las figuras:");
        for (Shape shape : shapes) {
            shape.dibujar();
        }
    }

    public void redimensionarTodasLasFiguras(double factorEscala) {
        System.out.println("\nCambiando el tamano de todas las figuras:");
        for (Shape shape : shapes) {
            shape.redimensionar(factorEscala);
        }
    }

    public void moverTodasLasFiguras(double deltaX, double deltaY) {
        System.out.println("\nMoviendo todas las figuras:");
        for (Shape shape : shapes) {
            shape.mover(deltaX, deltaY);
        }
    }

    public void redimensionarFigura(int indice, double factorEscala) {
        if (indice >= 0 && indice < shapes.size()) {
            System.out.println("\nCambiando el tamano de la figura en la posicion " + indice + ":");
            shapes.get(indice).redimensionar(factorEscala);
        } else {
            System.out.println("Indice fuera de rango.");
        }
    }

    public void moverFigura(int indice, double deltaX, double deltaY) {
        if (indice >= 0 && indice < shapes.size()) {
            System.out.println("\nMoviendo la figura en la posicion " + indice + ":");
            shapes.get(indice).mover(deltaX, deltaY);
        } else {
            System.out.println("Indice fuera de rango.");
        }
    }

    public void insertarFigura(int indice, Shape shape) {
        if (indice >= 0 && indice <= shapes.size()) {
            shapes.add(indice, shape);
            System.out.println("Insertando una figura en la posicion " + indice);
        } else {
            System.out.println("Indice fuera de rango.");
        }
    }

    public int obtenerCantidadFiguras() {
        return shapes.size();
    }

    public void quitarFigura(int indice) {
        if (indice >= 0 && indice < shapes.size()) {
            shapes.remove(indice);
            System.out.println("Quitando la figura en la posicion " + indice);
        } else {
            System.out.println("Indice fuera de rango.");
        }
    }
}
