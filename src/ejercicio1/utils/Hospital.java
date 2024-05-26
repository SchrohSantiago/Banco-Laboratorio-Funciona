package ejercicio1.utils;

import java.util.ArrayList;

public class Hospital {
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Paciente> pacientes;


    public Hospital() {
        this.habitaciones = new ArrayList<>();
        this.pacientes = new ArrayList<>();
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return this.habitaciones;
    }


    public ArrayList<Paciente> getPacientes() {
        return this.pacientes;
    }

    public void mostrarHabitaciones() {
        System.out.println("Listado de habitaciones:");
        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones registradas.");
        } else {
            for (Habitacion habitacion : habitaciones) {
                System.out.println("Habitacion " + habitacion.getNumeroHabitacion() + " con " + habitacion.getNumeroCamas() + " camas");
                System.out.println("Camas completas: " + (habitacion.getCamasCompletas() ? "Si" : "No"));
                System.out.println("Pacientes internados:");

                ArrayList<Paciente> pacientesInternados = habitacion.getPacientesInternados();
                if (pacientesInternados != null && !pacientesInternados.isEmpty()) {
                    for (Paciente paciente : pacientesInternados) {
                        System.out.println("- " + paciente.getNombre() + " " + paciente.getApellido());
                    }
                } else {
                    System.out.println("No hay pacientes internados en esta habitacion");
                }

                System.out.println();
            }
        }
    }

    public void mostrarPacientes() {
        System.out.println("Listado de pacientes:");
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
        } else {
            for (Paciente paciente : pacientes) {
                System.out.println("Nombre: " + paciente.getNombre() + " " + paciente.getApellido());
                System.out.println("DNI: " + paciente.getDni());
                System.out.println("Necesita internarse: " + (paciente.getNecesitaInternarse() ? "Sí" : "No"));
                System.out.println();
            }
        }
    }

    public Paciente pacienteExisteDni(Integer dni) {
       
        for (Paciente paciente : getPacientes()) {
            if (paciente.getDni() == dni) {
                return paciente;
            }
        }
    
    return null;
}
    
    

}