package ejercicio4;

public class Ventana {
    private Boton[] botones;
    private Desplazador barraVertical;
    private Desplazador barraHorizontal;
    private Panel panel;

    public Ventana() {
        botones = new Boton[5];
        for (int i = 0; i < botones.length; i++) {
            botones[i] = new Boton("Boton " + (i + 1));
        }
        barraVertical = new Desplazador(true);
        barraHorizontal = new Desplazador(false);
        panel = new Panel();
    }

    // Metodos de la clase Ventana
    public void mostrarMensajeEnPanel(String mensaje) {
        panel.mostrarMensaje(mensaje);
    }

    public void moverBarraVertical(int nuevaPosicion) {
        barraVertical.mover(nuevaPosicion);
    }

    public void moverBarraHorizontal(int nuevaPosicion) {
        barraHorizontal.mover(nuevaPosicion);
    }

    public void presionarBoton(int indice) {
        if (indice >= 0 && indice < botones.length) {
            botones[indice].presionar();
        } else {
            System.out.println("Indice de boton invalido.");
        }
    }

    // Clases internas (inner classes)

    public class Boton {
        private String texto;

        public Boton(String texto) {
            this.texto = texto;
        }

        public void presionar() {
            System.out.println("Boton presionado: " + texto);
            // Logica adicional para la presion del boton
        }
    }

    public class Desplazador {
        private boolean esVertical;
        private int posicionActual;

        public Desplazador(boolean esVertical) {
            this.esVertical = esVertical;
            this.posicionActual = 0;
        }

        public void mover(int nuevaPosicion) {
            this.posicionActual = nuevaPosicion;
            System.out.println("Desplazador " + (esVertical ? "vertical" : "horizontal") + " movido a la posicion: " + this.posicionActual);
            // Logica adicional para mover el desplazador
        }
    }

    public class Panel {
        private String contenido;

        public void mostrarMensaje(String mensaje) {
            this.contenido = mensaje;
            System.out.println("Mensaje mostrado en el panel: " + this.contenido);
            // Logica adicional para mostrar el mensaje en el panel
        }
    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana();

        ventana.mostrarMensajeEnPanel("Hola, mundo!");
        ventana.moverBarraVertical(50);
        ventana.moverBarraHorizontal(100);
        ventana.presionarBoton(0);
        ventana.presionarBoton(2);
    }
}
