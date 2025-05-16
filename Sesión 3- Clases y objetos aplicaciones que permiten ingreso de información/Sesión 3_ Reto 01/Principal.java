public class Principal {
    private static String Persona_pasajera;


    public static void main(String[] args) {
        // Crear un pasajero
        var pasajero = new Persona_pasajera("Bernardo Ramírez", "PSJ3202");

        // Crear un vuelo
        Vuelo vuelo = new Vuelo("DUR-BJC202", "Baja California", "01:10");

        // Reservar asiento
        String persona_pasajera = Persona_pasajera;
        String persona_pasajera1 = persona_pasajera;
        boolean reservado = vuelo.reservarAsiento(persona_pasajera1);
        if (reservado) {
            System.out.println("Reserva realizada con éxito.\n");
        } else {
            System.out.println("No se pudo realizar la reserva.\n");
        }

        // Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        System.out.println("Cancelando reserva...\n");
        vuelo.cancelarReserva();

        // Mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        // Realizamos una nueva reservacion
        vuelo.reservarAsiento("Idilio Meza");
        System.out.println(vuelo.obtenerItinerario());
    }
}
