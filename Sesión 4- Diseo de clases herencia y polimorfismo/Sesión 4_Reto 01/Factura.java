public class Factura {
    private String folio;
    private String cliente;
    private double total;

    // Constructor con parámetros para inicializar todos los campos
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // Metodo toString() para representar el objeto
    @Override
    public String toString() {
        return "🧾 Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + total + "]";
    }

    // Metodo equals() para comparar facturas
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mismo objeto en memoria
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otra = (Factura) obj;
        return this.folio.equals(otra.folio); // Comparamos solo el folio
    }

    // Metodo hashCode() consistente con equals(), basado en el folio
    @Override
    public int hashCode() {
        return folio.hashCode();
    }
}
