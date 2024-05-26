package ejercicio1.utils;

import java.util.ArrayList;

public class Paciente {
    private String nombre;
    private String apellido;
    private int dni;    
    private boolean necesitaInternarse;
    private Hospital hospital;

    public Paciente() {}

    public Paciente(String nombre, String apellido, int dni, Hospital hospital) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.necesitaInternarse = false;
        this.hospital = hospital;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getDni() {
        return this.dni;
    }

    public boolean getNecesitaInternarse() {
        return this.necesitaInternarse;
    }

    public void setNecesitaInternarse(boolean necesitaInternarse) {
        this.necesitaInternarse = necesitaInternarse;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setDni(int dni){
        this.dni = dni;
    }


    @Override
    public String toString() {
        return "Paciente [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", necesitaInternarse=" + necesitaInternarse + "]";
    }

    public void internarPaciente(){
        this.necesitaInternarse = true;
    }

    public void darDeAltaPaciente() {
        this.necesitaInternarse = false;
    }
}
