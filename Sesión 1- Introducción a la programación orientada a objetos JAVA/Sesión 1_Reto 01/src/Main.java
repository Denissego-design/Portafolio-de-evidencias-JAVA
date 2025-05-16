//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Paciente
        Paciente paciente1 = new Paciente();

        // Asignar valores a sus atributos
        paciente1.nombre = "Delia González";
        paciente1.edad = 23;
        paciente1.numeroExpediente = "EXP-2025-tcr-23";

        // Mostrar los datos del paciente
        paciente1.mostrar();
    }
}