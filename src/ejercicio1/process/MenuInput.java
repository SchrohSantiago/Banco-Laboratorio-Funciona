package ejercicio1.process;

import java.util.InputMismatchException;
import java.util.Scanner;

import ejercicio1.process.subprocess.InputCrearHabitacion;
import ejercicio1.process.subprocess.InputCrearPaciente;
import ejercicio1.process.subprocess.InputInternarPaciente;
import ejercicio1.utils.Habitacion;
import ejercicio1.utils.Hospital;

public class MenuInput {
    private Scanner scanner;
    private Hospital hospital;
    private Habitacion habitacion;

    public MenuInput(Hospital hospital, Habitacion habitacion) {
        this.scanner = new Scanner(System.in);
        this.hospital = hospital;
        this.habitacion = habitacion;
    }

    public void mostrarMenu() {
        int opcion = 0; // Inicializar opcion con un valor por defecto

        do {
            System.out.println("Menu de opciones:");
            System.out.println("1. Crear Paciente");
            System.out.println("2. Crear Habitación");
            System.out.println("3. Ver lista de Pacientes");
            System.out.println("4. Ver lista de Habitaciones");
            System.out.println("5. Internar Paciente");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea después de leer el entero

                switch (opcion) {
                    case 1:
                        InputCrearPaciente inputCrearPaciente = new InputCrearPaciente(hospital);
                        inputCrearPaciente.crearPaciente();
                        break;
                    case 2:
                        InputCrearHabitacion inputCrearHabitacion = new InputCrearHabitacion(hospital);
                        inputCrearHabitacion.crearHabitacion();
                        break;
                    case 3:
                        hospital.mostrarPacientes();
                        break;
                    case 4:
                        hospital.mostrarHabitaciones();
                        break;
                    case 5:
                        InputInternarPaciente inputInternarPaciente = new InputInternarPaciente(habitacion, hospital);
                        inputInternarPaciente.pacienteAInternar();
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Limpiar el buffer del scanner
                System.out.println("Error: ingrese un numero entero valido.");
            }
        } while (opcion != 6);

        cerrarScanner();
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
