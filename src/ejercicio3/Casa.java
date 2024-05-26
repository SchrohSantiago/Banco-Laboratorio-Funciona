package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private List<Dormitorio> dormitorios;
    private List<Baño> baños;
    private List<Patio> patios;
    private Cocina cocina;

    public Casa(Cocina cocina) {
        this.dormitorios = new ArrayList<>();
        this.baños = new ArrayList<>();
        this.patios = new ArrayList<>();
        this.cocina = cocina;
    }

    public void agregarDormitorio(Dormitorio dormitorio) {
        dormitorios.add(dormitorio);
    }

    public void agregarBaño(Baño baño) {
        baños.add(baño);
    }

    public void agregarPatio(Patio patio) {
        patios.add(patio);
    }

    public Cocina getCocina() {
        return cocina;
    }

    public List<Dormitorio> getDormitorios() {
        return dormitorios;
    }

    public List<Baño> getBaños() {
        return baños;
    }

    public List<Patio> getPatios() {
        return patios;
    }

    public static class Dormitorio {
        private int metrosCuadrados;
        private boolean bañoEnSuit;
        private int cantidadDeVentanas;

        public Dormitorio(int metrosCuadrados, boolean bañoEnSuit, int cantidadDeVentanas) {
            this.metrosCuadrados = metrosCuadrados;
            this.bañoEnSuit = bañoEnSuit;
            this.cantidadDeVentanas = cantidadDeVentanas;
        }

        public int getMetrosCuadrados() {
            return metrosCuadrados;
        }

        public boolean isBañoEnSuit() {
            return bañoEnSuit;
        }

        public int getCantidadDeVentanas() {
            return cantidadDeVentanas;
        }
    }

    public static class Baño {
        private boolean bañera;
        private boolean antebaño;

        public Baño(boolean bañera, boolean antebaño) {
            this.bañera = bañera;
            this.antebaño = antebaño;
        }

        public boolean isBañera() {
            return bañera;
        }

        public boolean isAntebaño() {
            return antebaño;
        }
    }

    public static class Patio {
        private String ubicacion; // frente o fondo
        private int metrosCuadrados;

        public Patio(String ubicacion, int metrosCuadrados) {
            this.ubicacion = ubicacion;
            this.metrosCuadrados = metrosCuadrados;
        }

        public String getUbicacion() {
            return ubicacion;
        }

        public int getMetrosCuadrados() {
            return metrosCuadrados;
        }
    }

    public static class Cocina {
        private String tipoHorno; // electrico o a gas
        private int metrosCuadrados;

        public Cocina(String tipoHorno, int metrosCuadrados) {
            this.tipoHorno = tipoHorno;
            this.metrosCuadrados = metrosCuadrados;
        }

        public String getTipoHorno() {
            return tipoHorno;
        }

        public int getMetrosCuadrados() {
            return metrosCuadrados;
        }
    }

    public static void main(String[] args) {
        Cocina cocina = new Cocina("a gas", 20);
        Casa casa = new Casa(cocina);

        Dormitorio dormitorio1 = new Dormitorio(15, true, 2);
        Dormitorio dormitorio2 = new Dormitorio(10, false, 1);
        Baño baño1 = new Baño(true, false);
        Baño baño2 = new Baño(false, true);
        Patio patio1 = new Patio("frente", 30);
        Patio patio2 = new Patio("fondo", 50);

        casa.agregarDormitorio(dormitorio1);
        casa.agregarDormitorio(dormitorio2);
        casa.agregarBaño(baño1);
        casa.agregarBaño(baño2);
        casa.agregarPatio(patio1);
        casa.agregarPatio(patio2);

        System.out.println("Detalles de la casa:");
        System.out.println("Cocina: Tipo de horno - " + casa.getCocina().getTipoHorno() + ", Metros cuadrados - " + casa.getCocina().getMetrosCuadrados());

        for (Dormitorio dormitorio : casa.getDormitorios()) {
            System.out.println("Dormitorio: Metros cuadrados - " + dormitorio.getMetrosCuadrados() + ", Baño en suit - " + dormitorio.isBañoEnSuit() + ", Cantidad de ventanas - " + dormitorio.getCantidadDeVentanas());
        }

        for (Baño baño : casa.getBaños()) {
            System.out.println("Baño: Bañera - " + baño.isBañera() + ", Antebaño - " + baño.isAntebaño());
        }

        for (Patio patio : casa.getPatios()) {
            System.out.println("Patio: Ubicacion - " + patio.getUbicacion() + ", Metros cuadrados - " + patio.getMetrosCuadrados());
        }
    }
}
