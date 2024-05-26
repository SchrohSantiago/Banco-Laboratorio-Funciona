package ejercicio1.utils;

import java.util.ArrayList;

public class Habitacion {
    private int numeroCamas;
    private int numeroHabitacion;
    private Hospital hospital;
    private boolean camasCompletas;
    private int camasOcupadas = 0;
    private ArrayList<Paciente> pacientesInternados;
   
    
    public Habitacion(){}

    public Habitacion(int numeroCamas, int numeroHabitacion, int camasOcupadas, Hospital hospital) {
        this.numeroCamas = numeroCamas;
        this.camasCompletas = false;
        this.pacientesInternados = new ArrayList<>();
        this.numeroHabitacion = numeroHabitacion;
        this.camasOcupadas = camasOcupadas;
        this.hospital = hospital;
    }
    

    public int getNumeroHabitacion() {
        return this.numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getNumeroCamas() {
        return this.numeroCamas;
    }

    public boolean getCamasCompletas() {
        return this.camasCompletas;
    }

    public ArrayList<Paciente> getPacientesInternados() {
        return this.pacientesInternados;
    }

    public void setPacientesInternados(ArrayList<Paciente> pacientesInternados) {
        this.pacientesInternados = pacientesInternados;
    }

    public void setNumeroCamas(int numeroCamas){
        this.numeroCamas = numeroCamas;
    }

    public void setCamasCompletas(boolean camasCompletas) {
        this.camasCompletas = camasCompletas;
    }

    public boolean pacienteEstaInternado(Paciente paciente, Hospital hospital) {
        for (Habitacion habitacion : hospital.getHabitaciones()) {
            if (habitacion.getPacientesInternados() != null) {
                return true;
            }
        }
        return false;
    }

    public void internarPaciente(int dni, int numeroHabitacion, Hospital hospital) { 
        if (hospital != null) {
            System.out.println("d");
        } else {
            System.out.println("Error: La referencia al hospital es null.");
            return; // Salir del método si el hospital es nulo
        }
    
        Paciente paciente = hospital.pacienteExisteDni(dni);
    
        if (paciente != null) {
            Habitacion habitacion = habitacionExiste(numeroHabitacion, hospital);
            if (habitacion != null) {
                if (camasOcupadas <= numeroCamas) { // Verifica si hay camas disponibles
                    // Verifica si la lista de pacientes internados no es nula
                    if (habitacion.getPacientesInternados() == null) {
                        habitacion.setPacientesInternados(new ArrayList<>());
                    }
    
                    // Agrega el paciente a la lista de pacientes internados
                    habitacion.getPacientesInternados().add(paciente);
                    System.out.println("El paciente " + paciente.getNombre() + " ha sido internado en la habitacion " + habitacion.getNumeroHabitacion());
                    
                    if (camasOcupadas == numeroCamas) {
                        this.setCamasCompletas(true);
                    }
                    camasOcupadas++;
                    
                } else {
                    System.out.println("La habitacion está llena.");
                }
            } else {
                System.out.println("La habitacion no existe o no está registrada en el sistema.");
            }
        } else {
            System.out.println("El paciente no existe");
        }    
    }
    
    
    
    

    


    public void eliminarPaciente(Paciente paciente) {
        if (this.pacientesInternados.contains(paciente)) {
            this.pacientesInternados.remove(paciente);
            if (this.pacientesInternados.size() < this.numeroCamas) {
                this.setCamasCompletas(false);
                System.out.println(pacientesInternados);
            }
        } else {
            System.out.println("El paciente no se encuentra internado en esta habitacion.");
        }
    }

    public Habitacion habitacionExiste(int numeroHabitacion, Hospital hospital) {
        for (Habitacion habitacion : hospital.getHabitaciones()) {
            if (habitacion.getNumeroHabitacion() == numeroHabitacion) {
                return habitacion; // Devuelve la instancia de Habitacion si el número coincide
            }
        }
        return null; // Si no se encuentra ninguna habitación con el número especificado, devuelve null
    }

    

    public boolean habitacionEstaLlena(int numeroHabitacion, Hospital hospital) {
        for (Habitacion habitacion : hospital.getHabitaciones()) {
            if (habitacion.getNumeroHabitacion() == numeroHabitacion) {
                if (habitacion.getCamasCompletas()) {
                    return true;
                }
            }
        }
        return false;
    }

    
}
