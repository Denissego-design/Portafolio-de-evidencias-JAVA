import java.util.Scanner;

public class MainNarrativa {

    import java.util.Scanner;

    // Interfaz para manejar transiciones de historia
    interface TransicionHistoria {
        void cambiarEscena(String Escena2);
    }

    // Interfaz para gestionar diálogos
    interface GestorDialogo {
        void mostrarDialogo(String personaje1, String dialogo);
    }

    // Interfaz para tomar decisiones en el juego
    interface LogicaDecision {
        boolean tomarDecision(String opcion1, String opcion2);
    }

    // Implementación concreta de TransicionHistoria
    class TransicionSimple implements TransicionHistoria {
        @Override
        public void cambiarEscena(String nuevaEscena) {
            String Escena2;
            System.out.println("\n Nueva escena: " + Escena2);
        }
    }

    // Implementación concreta de GestorDialogo
    class DialogoTexto implements GestorDialogo {
        @Override
        public void mostrarDialogo(String personaje1, String dialogo) {
            System.out.println(personaje1 + ": " + dialogo);
        }
    }

    // Implementación concreta de LogicaDecision (decisión binaria)
    class DecisionBinaria implements LogicaDecision {
        private Scanner scanner = new Scanner(System.in);

        @Override
        public boolean tomarDecision(String opcion1, String opcion2) {
            System.out.println("\n Elige la opción que más te guste:");
            System.out.println("1. " + opcion1);
            System.out.println("2. " + opcion2);
            System.out.print("Selecciona opción 1 ó 2: ");
            int decision = scanner.nextInt();
            return decision == 1;
        }
    }

    public class MainNarrativa {
        private TransicionHistoria transicion;
        private GestorDialogo dialogo;
        private LogicaDecision decision;


        public MainNarrativa(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
            this.transicion = transicion;
            this.dialogo = dialogo;
            this.decision = decision;
        }

        public void ejecutar() {
            System.out.println("\n🌍 Esta es la historia mejor contada, una construcción de tu decisión...");

            dialogo.mostrarDialogo("Narrador", "Érase una vez, tú dentro de una bola de nieve");
            dialogo.mostrarDialogo("Narrador", "Intentas escapar golpeando la bola de nieve, pero es en vano");

            boolean huir = decision.tomarDecision("Respiras, te das cuenta de la pala que tienes y la tomas", "intentas hacer calor para desacerla");

            if (huir) {
                transicion.cambiarEscena("Te despiertas en un bosque lleno de lobos");
                dialogo.mostrarDialogo("Narrador", "Decidiste acampar y empezar una nueva vida.");
            } else {
                transicion.cambiarEscena("Te mantienes encerrado en tu tienda :D");
                dialogo.mostrarDialogo("Narrador", "Intentas subir al árbol más cercano para ponerte a salvo :S");
            }

            System.out.println("\nFin de la historia");
        }


        public void main(String[] args) {
            MainNarrativa narrativa = new MainNarrativa(new TransicionSimple(), new DialogoTexto(), new DecisionBinaria());
            narrativa.ejecutar();
        }
    }
}
