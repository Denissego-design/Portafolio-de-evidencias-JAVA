public class Centraldeemergencias {
        public static void main(String[] args) {
            Ambulancia ambulancia = new Ambulancia("Ambulancia", "Juan");
            Patrulla patrulla = new Patrulla("Patrulla", "Laura");
            UnidadDeBomberos bomberos = new UnidadDeBomberos()Bomberos("UnidadBomberos", "Marco");

            ambulancia.iniciarOperacion();
            System.out.println();

            patrulla.iniciarOperacion();
            System.out.println();

            bomberos.iniciarOperacion();
        }

    private static void Bomberos(String unidadBomberos, String marco) {
    }
}}
