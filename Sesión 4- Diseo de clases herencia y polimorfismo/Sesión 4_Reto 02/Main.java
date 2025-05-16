import Declaracion_impuestos.Declaracion_deimpuestosmpuestos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 🧾 Crear una declaración de impuestos con RFC y monto declarado
        Declaracion_deimpuestosmpuestos declaracion = new Declaracion_deimpuestosmpuestos("XAXX010101000", 8700.0);

        // 🏦 Crear una cuenta fiscal con RFC y saldo inicial
        CuentaFiscal cuenta = new CuentaFiscal("XAXX010101000", 9500.0);

        // 📄 Mostrar detalles de la declaración
        System.out.println("📄 Declaración enviada por RFC: " + ((Declaracion_deimpuestos.DeclaracionImpuestos) declaracion).rfcContribuyente() +
                " por $" + String.format("%.2f", declaracion.montoDeclarado()));

        // 🏦 Mostrar estado actual de la cuenta fiscal
        cuenta.mostrarCuenta();

        // 🔍 Validar que el RFC de la declaración coincida con el de la cuenta
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("🔍 ¿RFC válido para esta cuenta?: " + (rfcValido ? "Sí" : "No"));
    }
}