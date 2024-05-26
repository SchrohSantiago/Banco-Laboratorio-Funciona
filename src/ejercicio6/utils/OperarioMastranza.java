package ejercicio6.utils;

import java.time.LocalDate;

public class OperarioMastranza extends Empleados {
    public OperarioMastranza(int id, int edad, LocalDate fechaIngreso, String nombre, String apellido, float sueldo) {
        super(id, edad, fechaIngreso, nombre, apellido, sueldo);
    }

    @Override 
    public void mostrarTareas(){
        System.out.println("Mostrando tareas del operario mastranza");
    }
}
