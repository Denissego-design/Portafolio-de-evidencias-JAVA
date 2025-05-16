public class UnidadDeBomberos extends UnidadEmergencia {
        private GPS gps;
        private Sirena sirena;
        private Operadora operador;

        public UnidadBomberos(String nombre, String nombreOperador) {
            super(nombre);
            this.gps = new GPS();
            this.sirena = new Sirena();
            this.operador = new Operadora(nombreOperador);
        }

        public void iniciarOperacion() {
            activarUnidad();
            gps.localizar();
            sirena.activarSirena();
            operador.reportarse();
            responder();
        }

    private void activarUnidad() {
    }

    @Override
        public void responder() {
            System.out.println("🔥 Unidad de bomberos respondiendo a incendio estructural.");
        }
    }
}
