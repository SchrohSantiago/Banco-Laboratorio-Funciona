package ejercicio1.process.subprocess;

import java.util.Scanner;

import ejercicio1.utils.Habitacion;
import ejercicio1.utils.Hospital;


public class InputInternarPaciente {
    Scanner scanner = new Scanner(System.in);
    private Habitacion habitacion;
    private Hospital hospital; 

    public InputInternarPaciente (Habitacion habitacion, Hospital hospital) {
        this.scanner = new Scanner(System.in);
        this.habitacion = habitacion;
        this.hospital = hospital;
    }

    public void pacienteAInternar() {
            System.out.println("Por favor ingrese el DNI del paciente a internar: ");
            String dniInput = scanner.nextLine();
            int dniInt = Integer.parseInt(dniInput);
            
            System.out.println("Por favor ingrese el numero de habitacion del paciente a internar: ");
            String numeroHabitacionInput = scanner.nextLine();
            int numeroHabitacion = Integer.parseInt(numeroHabitacionInput);

            habitacion.internarPaciente(dniInt, numeroHabitacion, hospital);
            
        }
}
