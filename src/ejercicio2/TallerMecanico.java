package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class TallerMecanico {

    // Clase que modela un Motor
    public static class Motor {
        private String numeroMotor;
        private int kilometraje;
        private String cilindrada;

        // Constructor de la clase Motor
        public Motor(String numeroMotor, int kilometraje, String cilindrada) {
            this.numeroMotor = numeroMotor;
            this.kilometraje = kilometraje;
            this.cilindrada = cilindrada;
        }

        // Metodos getter para obtener los atributos del Motor
        public String getNumeroMotor() {
            return numeroMotor;
        }

        public int getKilometraje() {
            return kilometraje;
        }

        public String getCilindrada() {
            return cilindrada;
        }

        // Metodo para mostrar detalles del Motor
        public void mostrarDetallesMotor() {
            System.out.println("Numero de motor: " + numeroMotor);
            System.out.println("Kilometraje: " + kilometraje + " km");
            System.out.println("Cilindrada: " + cilindrada);
        }
    }

    // Clase que modela un Auto
    public static class Auto {
        private String patente;
        private String marca;
        private int modelo;
        private Motor motor;

        // Constructor de la clase Auto
        public Auto(String patente, String marca, int modelo, Motor motor) {
            this.patente = patente;
            this.marca = marca;
            this.modelo = modelo;
            this.motor = motor;
        }

        // Metodos getter para obtener los atributos del Auto
        public String getPatente() {
            return patente;
        }

        public String getMarca() {
            return marca;
        }

        public int getModelo() {
            return modelo;
        }

        public Motor getMotor() {
            return motor;
        }

        // Metodo para mostrar detalles del Auto
        public void mostrarDetallesAuto() {
            System.out.println("Patente: " + patente);
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            motor.mostrarDetallesMotor();
        }
    }

    // Lista para almacenar autos y motores en reparacion
    private List<Auto> autosEnReparacion = new ArrayList<>();
    private List<Motor> motoresEnReparacion = new ArrayList<>();

    // Metodos para agregar autos y motores en reparacion
    public void agregarAutoEnReparacion(Auto auto) {
        autosEnReparacion.add(auto);
    }

    public void agregarMotorEnReparacion(Motor motor) {
        motoresEnReparacion.add(motor);
    }

    // Metodos para mostrar autos y motores en reparacion
    public void mostrarAutosEnReparacion() {
        System.out.println("Autos en reparacion:");
        for (Auto auto : autosEnReparacion) {
            auto.mostrarDetallesAuto();
            System.out.println();
        }
    }

    public void mostrarMotoresEnReparacion() {
        System.out.println("Motores en reparacion:");
        for (Motor motor : motoresEnReparacion) {
            motor.mostrarDetallesMotor();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Motor motor1 = new Motor("ODXI231987", 54301, "1.6");
        Motor motor2 = new Motor("WWER132425", 20442, "2.0");

        Auto auto1 = new Auto("ZOE462", "Chevrolet", 2015, motor1);
        Auto auto2 = new Auto("XYZ789", "Ford", 2018, motor2);

        TallerMecanico taller = new TallerMecanico();

        taller.agregarAutoEnReparacion(auto1);
        taller.agregarAutoEnReparacion(auto2);
        taller.agregarMotorEnReparacion(motor1);
        taller.agregarMotorEnReparacion(motor2);

        taller.mostrarAutosEnReparacion();
        taller.mostrarMotoresEnReparacion();
    }
}
