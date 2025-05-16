public class Paciente {
    // Características del paciente
    String nombre;
    int edad;
    String numeroExpediente;

    // Constructor vacío
    public Paciente() {
        // Inicialización opcional (puedes dejarlo vacío)
    }

    // Método para mostrar un saludo con los datos del paciente
    public void mostrar() {
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + numeroExpediente);
    }
}

