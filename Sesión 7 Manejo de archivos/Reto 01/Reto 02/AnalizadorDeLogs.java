import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {

        public static void main(String[] args) {
            Path rutaArchivo = Paths.get("C://Users//gotod//Documents//CURSO JAVA//config/errores.log");
            Path rutaErrores = Paths.get("C://Users//gotod//Documents//CURSO JAVA//config/registro_fallos.txt");

            int totalLineas = 0;
            int cantidadErrores = 0;
            int cantidadAdvertencias = 0;

            // Lectura del archivo usando try-with-resources
            try (BufferedReader lector = Files.newBufferedReader(rutaArchivo)) {
                String linea;

                while ((linea = lector.readLine()) != null) {
                    totalLineas++;
                    System.out.println("➡️ " + linea);

                    if (linea.contains("ERROR")) {
                        cantidadErrores++;
                        System.out.println("➡️ Error detectado");
                    }
                    if (linea.contains("WARNING")) {
                        cantidadAdvertencias++;
                        System.out.println("➡️ Advertencia detectada");
                    }
                }

                // Imprimir resumen
                System.out.println("\nResumen del análisis:");
                System.out.println("Total de líneas leídas: " + totalLineas);
                System.out.println("Cantidad de errores: " + cantidadErrores);
                System.out.println("Cantidad de advertencias: " + cantidadAdvertencias);

                if (totalLineas > 0) {
                    double porcentajeErrores = (cantidadErrores + cantidadAdvertencias) * 100.0 / totalLineas;
                    System.out.println("Porcentaje de líneas con errores y advertencias: " + porcentajeErrores + "%");
                }

            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());

                // Guardar mensaje de error en registro_fallos.txt
                try (BufferedWriter escritor = Files.newBufferedWriter(rutaErrores)) {
                    escritor.write("Error al leer el archivo: " + e.getMessage());
                } catch (IOException ex) {
                    System.out.println("Error al escribir en registro_fallos.txt: " + ex.getMessage());
                }
            }
        }
    }