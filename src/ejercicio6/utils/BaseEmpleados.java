package ejercicio6.utils;

import java.util.ArrayList;


public class BaseEmpleados {
    private ArrayList <Empleados> empleados;

    public BaseEmpleados(){}
    public BaseEmpleados(ArrayList <Empleados> empleados) {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleados empleado){
        this.empleados.add(empleado);
    }

    public void eliminarEmpleado(int id){
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getId() == id) {
                empleados.remove(i);
            }
        }
        System.out.println("Se ha eliminado el empleado con id: " + id);
    }

    public void mostrarEmpleados(){
        for (Empleados empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre() + "Apellido: " + empleado.getApellido() + "Fecha de ingreso: " + empleado.getFechaIngreso());
        }
    }

    public void buscarEmpleados(String nombre){
        for(Empleados empleado : empleados){
            if(empleado.getNombre().equals(nombre)){
                System.out.println("Nombre: " + empleado.getNombre() + "Apellido: " + empleado.getApellido() + "Fecha de ingreso: " + empleado.getFechaIngreso());
            }
        }
    }

    public void mostrarCantidadDeEmpleados(){
        System.out.println("Cantidad de empleados: " + empleados.size()); // El size nos devuelve el numero de elementos de la lista, entonces me parecio mucho mas factible que hacer un contador.
    }

    public void mostrarEmpleadosPorTipo(String tipo){

        System.out.println("\n" + "EMPLEADOS DE TIPO ESPECIFICO" + "\n");

        for(Empleados empleado : empleados){
            if(empleado.getClass().getSimpleName().equals(tipo)){  // getClass lo que hace es devolvernosel objeto Class, que seria la clase real, ejemplo si pasamos administrativo nos devuelve la clase real aunque pongamos "empleado.getClass()" nos devuelve la clase REAL, y getSimpleName nos devuelve el nombre de la clase.
                
                System.out.println("Nombre: " + empleado.getNombre() + "Apellido: " + empleado.getApellido() + "Fecha de ingreso: " + empleado.getFechaIngreso());
            } 
        }

        System.out.println();
    }


}
