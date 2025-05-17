import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

import static javax.print.attribute.standard.MediaSizeName.C;

public class ResgistroSimulacion {
    public static void main(String[] args) {

        Path ruta = Paths.get("Documentos/CURSO JAVA/config/parametros.txt.docx/");

        String parametros = "°Tiempo de ciclo: 55.8 segundos" +
                            " °Velocidad de línea: 1.2 m/s" +
                            "Número de estaciones: 8";
        try{
            Files.write(ruta, parametros.getBytes());
            System.out.println("El archivo fue creado exitosamente");

            String parametrosLeidos = Files.readString(ruta);
            System.out.println("Este es el contenido");
            System.out.println(parametrosLeidos);
        } catch (IOException e) {
            System.out.println(new StringBuilder().append("Error al abrir el archivo:").append(e.getMessage()).toString())
        ;}
    }
}
