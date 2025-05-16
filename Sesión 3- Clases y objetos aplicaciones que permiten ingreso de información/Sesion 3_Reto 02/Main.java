//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {public static void main(String[] args) {
    // Factura con RFC
    Factura facturaConRFC = new Factura(95000.0, "Servicio de consultoría", "ABCC010101XYZ");

    // Factura sin RFC (se pasa null)
    Factura facturaSinRFC = new Factura(8200.0, "Reparación de equipo", null);

    // Mostrar ambas facturas
    System.out.println(facturaConRFC.getResumen());
    System.out.println(facturaSinRFC.getResumen());
}
}
