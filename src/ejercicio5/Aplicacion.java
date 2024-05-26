package ejercicio5;

import ejercicio5.utils.Circle;

import ejercicio5.utils.Rectangle;
import ejercicio5.utils.Triangle;
import ejercicio5.utils.ShapeList;

public class Aplicacion {
    public static void main(String[] args) {

        ShapeList shapeList = new ShapeList();

        shapeList.agregarShape(new Circle(0, 0, 5));
        shapeList.agregarShape(new Rectangle(0, 0, 10, 20));
        shapeList.agregarShape(new Triangle(0, 0, 8, 12));

        shapeList.dibujarTodasLasFiguras();

        shapeList.redimensionarTodasLasFiguras(1.5);

        shapeList.moverTodasLasFiguras(10, 10);

        shapeList.redimensionarFigura(1, 0.5);

        shapeList.moverFigura(2, -5, -5);

        shapeList.insertarFigura(1, new Circle(0, 0, 3));

        System.out.println("\nCantidad de figuras: " + shapeList.obtenerCantidadFiguras());

        shapeList.quitarFigura(0);

        shapeList.dibujarTodasLasFiguras();
    }
}
