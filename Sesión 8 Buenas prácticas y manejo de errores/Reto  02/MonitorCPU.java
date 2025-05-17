import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class ConsumoProblema extends Exception {
    public ConsumoProblema(String mensaje) {
        super(mensaje);
    }
}

public class MonitorCPU {
        private Scanner scanner = new Scanner(System.in);
        private Set<Integer> registrosCPU = new HashSet<>();

        public void iniciarMonitoreo() {
            try {
                System.out.println("Seguimiento al consumo de CPU");
                while (true) {
                    System.out.print("Ingrese el consumo de CPU del servidor (No 0-100, o -1 o saldrá): ");
                    String entrada = scanner.nextLine();
                    int consumo;
                    try {
                        consumo = Integer.parseInt(entrada);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Debe ingresar un número válido. No mayor a 100 y no números negativos.");
                        continue;
                    }

                    if (consumo == -1) {
                        System.out.println("Finalizando monitoreo.");
                        break;
                    }
                    if (consumo < 0 || consumo > 100) {
                        System.out.println("Error: El consumo de CPU debe estar entre 0 y 100.");
                        continue;
                    }

                    if (!registrosCPU.add(consumo)) {
                        System.out.println("Error: Ese registro ya ha sido ingresado.");
                        continue;
                    }

                    if (consumo > 95) {
                        throw new ConsumoProblema("Detectamos un consumo que podría generar problemas: " + consumo + "%");
                    }

                    System.out.println("Consumo registrado correctamente: " + consumo + "%");
                }
            } catch (ConsumoProblema e) {
                System.out.println("Consumo crítico: " + e.getMessage());
            } finally {
                scanner.close();
                System.out.println("Este seguimiento ha terminado.");
            }
        }

        public static void main(String[] args) {
            MonitorCPU monitor = new MonitorCPU();
            monitor.iniciarMonitoreo();
        }
    }


