import java.util.Optional;

public class Factura {
    private double monto;
    private String descripcion;
    private Optional<String> rfc; // Valores opcionales

    // Constructor  de RFC
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        Optional Optional = null;
        this.rfc = Optional.ofNullable(rfc);
    }

    // Metodo público
    public String getResumen() {
        StringBuilder resumen = new StringBuilder("Factura generada:\n");

        resumen.append("Descripción: ").append(descripcion).append("\n");
        resumen.append("Monto: $").append(String.format("%.2f", monto)).append("\n");

        // Si el RFC está presente, lo muestra; si no, indica que no se proporcionó
        resumen.append("RFC: ").append(rfc.orElse("[No proporcionado]")).append("\n");

        return resumen.toString();
    }
    public double getMonto() {
        return monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Optional<String> getRfc() {
        return rfc;
    }
}
