public record Entrada_record(String nombreDelEvento, String nombreDeUsuario, Double precioDeLaEntrada) {

    // Método para mostrar información
    public void mostrarInformación() {
        System.out.println("NombreDelUsuario: " + nombreDeUsuario);
        System.out.println("NombreDelEvento: " + nombreDelEvento);
        System.out.println("PrecioDeEntrada: " + precioDeLaEntrada);
    }
}
