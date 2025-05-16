public class Vuelo {
    final String codigoVuelo;       // Constante
    String destino;
    String horaSalida;
    Persona_pasajera asientoReservado;      // Se asignará una instancia o null
    private Persona_pasajera Persona_pasajera;

    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    // Método con condicional y valor de retorno
    public boolean reservarAsiento(Persona_pasajera NuevaPersona_pasajera) {
        if (asientoReservado == null) {
            asientoReservado = Persona_pasajera;
            return true;
        } else {
            return false;
        }
    }

    // Metodo con sobrecarga permita reservar con una cadena simples
    public boolean reservarAsiento(String nombre) {
        String Pasaporte = "Pasaporte 30000";
        Persona_pasajera nuevoPasajero = new Persona_pasajera(nombre,Pasaporte);
        return reservarAsiento(nuevoPasajero);
    }

    // Método sin retorno
    public void cancelarReserva() {
        asientoReservado = null;
    }

    // Método que retorna un String
    public String obtenerItinerario() {
        String info = "✈️ Itinerario del vuelo:\n";
        info += "Código: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        if (asientoReservado != null) {
            info += "Persona pasajera: " + asientoReservado.Nombre_personaPasajera + "\n";
        } else {
            info += "Persona pasajera: [Sin reserva]\n";
        }
        return info;
    }
}
