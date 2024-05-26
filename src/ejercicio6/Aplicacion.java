package ejercicio6;

import java.time.LocalDate;
import java.util.ArrayList;

import ejercicio6.utils.Administrativo;
import ejercicio6.utils.BaseEmpleados;
import ejercicio6.utils.Empleados;
import ejercicio6.utils.OperarioMastranza;
import ejercicio6.utils.Vendedor;

public class Aplicacion {

    public static void main(String[] args) {
        ArrayList<Empleados> listaEmpleados = new ArrayList<>();
        BaseEmpleados baseEmpleados = new BaseEmpleados(listaEmpleados);

        baseEmpleados.agregarEmpleado(new Administrativo(1, 20, LocalDate.now(), "Juan", "Perez", 1000));
        baseEmpleados.agregarEmpleado(new Administrativo(2, 32, LocalDate.of(2003, 4, 23), "Carlos", "De la Rua", 1200));
        baseEmpleados.agregarEmpleado(new OperarioMastranza(3, 25, LocalDate.of(2000, 1, 1), "Pedro", "Gomez", 1500));
        baseEmpleados.agregarEmpleado(new OperarioMastranza(4, 27, LocalDate.of(2001, 5, 1), "Jorge", "Lopez", 1700));
        baseEmpleados.agregarEmpleado(new Vendedor(5, 23, LocalDate.of(2002, 3, 1), "Maria", "Rodriguez", 1300));
        baseEmpleados.agregarEmpleado(new Vendedor(6, 21, LocalDate.of(2004, 6, 1), "Jose", "Garcia", 1100));

        baseEmpleados.mostrarEmpleados();

        baseEmpleados.mostrarEmpleadosPorTipo("Administrativo");

        baseEmpleados.eliminarEmpleado(5);
        baseEmpleados.eliminarEmpleado(2);

        baseEmpleados.buscarEmpleados("Juan");

        baseEmpleados.mostrarCantidadDeEmpleados();

        baseEmpleados.mostrarEmpleados();
    }
}
