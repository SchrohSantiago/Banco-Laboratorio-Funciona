package ejercicio1;
import ejercicio1.process.MenuInput;
import ejercicio1.utils.Habitacion;
import ejercicio1.utils.Hospital;

public class Aplicacion {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Habitacion habitacion = new Habitacion();
        
        MenuInput menuInput = new MenuInput(hospital, habitacion);
        menuInput.mostrarMenu();
    }
}
