package ejercicio1.process.subprocess;
import java.util.Scanner;

import ejercicio1.utils.Hospital;
import ejercicio1.utils.Paciente;

public class InputCrearPaciente {
    Scanner scanner = new Scanner(System.in);
    private Hospital hospital; // Variable de instancia de Hospital

    public InputCrearPaciente(Hospital hospital) {
        this.scanner = new Scanner(System.in);
        this.hospital = hospital;
    }
    
    public void crearPaciente(){ // Basicamente es un constructor
        Paciente paciente = new Paciente();

        System.out.println("Porfavor ingrese el nombre del paciente a agregar: ");
        String nombreInput = scanner.nextLine();
        paciente.setNombre(nombreInput);

        System.out.println("Por favor ingrese el apellido del paciente a agregar: ");
        String apellidoInput = scanner.nextLine();
        paciente.setApellido(apellidoInput);

        System.out.println("Por favor ingrese el DNI del paciente a agregar: ");
        String dniInput = scanner.nextLine();
        int dniInt = Integer.parseInt(dniInput);

        paciente.setDni(dniInt);

       
        hospital.getPacientes().add(paciente); // Luego de la creacion agregamos el paciente a la ArrayList.

        System.out.println("Paciente creado:");
        System.out.println("Nombre: " + paciente.getNombre());
        System.out.println("Apellido: " + paciente.getApellido());
        System.out.println("DNI: " + paciente.getDni());

    }
}
