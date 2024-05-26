package ejercicio1.process.subprocess;
import java.util.Scanner;

import ejercicio1.utils.Habitacion;
import ejercicio1.utils.Hospital;


public class InputCrearHabitacion {
    Scanner scanner = new Scanner(System.in);

    private Hospital hospital;

    public InputCrearHabitacion(Hospital hospital) {
        this.scanner = new Scanner(System.in);
        this.hospital = hospital;
    }

    public void crearHabitacion(){
        Habitacion habitacion = new Habitacion();

        System.out.println("Ingrese el numero de camas de la habitacion: ");
        String numeroCamasInput = scanner.nextLine();

        int numeroCamas = Integer.parseInt(numeroCamasInput);
        habitacion.setNumeroCamas(numeroCamas);

        System.out.println("Ingrese el numero de habitacion: ");
        String numeroHabitacionInput = scanner.nextLine();

        int numeroHabitacion = Integer.parseInt(numeroHabitacionInput);
        habitacion.setNumeroHabitacion(numeroHabitacion);

        System.out.println("Se ha creado la habitacion " + numeroHabitacion + " con " + numeroCamas + " camas.");
        System.out.println(habitacion.toString());
        
        hospital.getHabitaciones().add(habitacion);
    }
}
