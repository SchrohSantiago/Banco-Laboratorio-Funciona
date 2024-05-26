package ejercicio6.utils;

import java.time.LocalDate;

public abstract class Empleados {
    private int id;
    private int edad;
    private LocalDate fechaIngreso;
    private String nombre;
    private String apellido;
    private float sueldo;

    public Empleados(){}
    public Empleados(int id, int edad, LocalDate fechaIngreso, String nombre, String apellido, float sueldo) {
        this.id = id;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad; 
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public void mostrarEmpleado() {
        System.out.println("ID: " + id);
        System.out.println("Edad: " + edad);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Sueldo: " + sueldo);
        System.out.println();
    }

    public abstract void mostrarTareas();
}
