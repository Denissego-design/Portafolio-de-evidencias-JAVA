public class Ambulancia extends UnidadEmergencia {
    private GPS gps;
    private Sirena sirena;
    private Operadora operadora;

    public Ambulancia(String nombre, String nombreOperador) {
        super(nombre);
        this.gps = new GPS();
        this.sirena = new Sirena();
        this.Operadora = new Operadora(nombreOperador);
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operadora.reportarse();
        responder();
    }

    @Override
    public void responder() {
        System.out.println("🩺 Ambulancia en camino al hospital más cercano.");
    }
}{
}
