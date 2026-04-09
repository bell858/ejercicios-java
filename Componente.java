public class Componente {
    private long referencia;
    private String marca;
    private String modelo;

    public Componente(long referencia, String marca, String modelo) { // Crear los contructores.
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
    }
    public long getReferencia() { //Crear los getter y los setters.
        return referencia;
    }
    public void setReferencia(long referencia) {
        this.referencia = referencia;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Componente con referencia: " + referencia + " marca: " + marca + " modelo: " + modelo;
    }

    public class DiscoDuro extends Componente { // Creando la clase DiscoDuro que hereda de componente.
        private int capacidad;

        public DiscoDuro(long referencia, String marca, String modelo, int capacidad) { // Incluir todos los contructores.
            super(referencia, marca, modelo);
            this.capacidad = capacidad;
        }

        public int getCapacidad() { // Crear el getter de la capacidad.
            return capacidad;
        }

        @Override // Sobrescribir el método toString para mostrar la información del disco duro.
        public String toString() {
            return "Disco duro con referencia: " + getReferencia() + " marca: " + getMarca() + " modelo: " + getModelo() + " capacidad: " + capacidad;
        }
    }
    
    public class Microprocesador extends Componente {
        private final int frecuencia;

        public Microprocesador(long referencia, String marca, String modelo, int frecuencia) {
            super(referencia, marca, modelo);
            this.frecuencia = frecuencia;
        }

        public int getFrecuencia() {
            return frecuencia;
        }

        @Override
        public String toString() {
            return "Microprocesador con referencia: " + getReferencia() + " marca: " + getMarca() + " modelo: " + getModelo() + " frecuencia: " + frecuencia;
        }
    }
}

 class Ej1 {
    public static void main(String[] args) {
        Componente componente = new Componente(123456, "MarcaX", "ModeloY");// le estamos dando un valor a los atributos de la clase componente.
        Componente.DiscoDuro discoDuro = componente.new DiscoDuro(123456, "MarcaX", "ModeloY", 500);
        Componente.Microprocesador microprocesador = componente.new Microprocesador(123456, "MarcaX", "ModeloY", 3);
        System.out.println(componente.toString());
        System.out.println(discoDuro.toString());
        System.out.println(microprocesador.toString());
    }
 }