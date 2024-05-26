package ejercicio6.utils;

import java.time.LocalDate;

public class Vendedor extends Empleados{
    public Vendedor(int id, int edad, LocalDate fechaIngreso, String nombre, String apellido, float sueldo) {
        super(id, edad, fechaIngreso, nombre, apellido, sueldo);
    }

    @Override // Segun cual sea la clase en la clase padre Empleados tenemos el metodo este de tipo abstracto que se debe implementar en la clase hija Vendedor y las demas  
    public void mostrarTareas() {
        System.out.println("Mostrando tareas del vendedor");
    }
}
