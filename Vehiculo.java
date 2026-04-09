public class Vehiculo {
    private String marca;
    private String modelo;
    private int precio;
    private boolean estaArrancado;

    public Vehiculo (String marca, String modelo, int precio) { // Constructor para inicializar los atributos de la clase Vehiculo.
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.estaArrancado = false;
    }
    public String getMarca() { // Método para obtener la marca del vehículo.
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {// Método para establecer el precio del vehículo.
        this.precio = precio;
    }
    public boolean isEstaArrancado() { // Método para verificar si el vehículo está arrancado.
        return estaArrancado;
    }
    public void setEstaArrancado(boolean estaArrancado) {
        this.estaArrancado = estaArrancado;
    }
    public void arrancar() { // Método para arrancar el vehículo.
        this.estaArrancado = true;
        if(this instanceof Coche) { //polimorfismo para mostrar un mensaje específico dependiendo del tipo de vehículo.
            System.out.println("El coche ha arrancado.");
        } else if(this instanceof Moto) {
            System.out.println("La moto ha arrancado.");
        } else {
            System.out.println("El vehículo ha arrancado.");
        }
    }
    public void parar() { // Método para parar el vehículo.
        this.estaArrancado = false;
        if(this instanceof Coche) {
            System.out.println("El coche se ha detenido.");
        } else if(this instanceof Moto) {
            System.out.println("La moto se ha detenido.");
        } else {
            System.out.println("El vehículo se ha detenido.");
        }
    }

   @Override // Sobrescribir el método toString para mostrar la información del vehículo.
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", estaArrancado=" + estaArrancado + "]"; // Devuelve una representación en forma de cadena del vehículo.
    }

    public static class Coche extends Vehiculo {
        public Coche(String marca, String modelo, int precio) {
            super(marca, modelo, precio);
        }
        @Override
        public String toString() {
            return "Coche [marca=" + getMarca() + ", modelo=" + getModelo() + ", precio=" + getPrecio() + ", estaArrancado=" + isEstaArrancado() + "]";
        }
    }
    public static class Moto extends Vehiculo {
        public Moto(String marca, String modelo, int precio) {
            super(marca, modelo, precio);
        
        }
        @Override
        public String toString() {
            return "Moto [marca=" + getMarca() + ", modelo=" + getModelo() + ", precio=" + getPrecio() + ", estaArrancado=" + isEstaArrancado() + "]";
        }
    }
}
class Ej2 {
    public static void main(String[] args) {
        Vehiculo.Coche coche = new Vehiculo.Coche("Toyota", "Corolla", 20000);
        Vehiculo.Moto moto = new Vehiculo.Moto("Honda", "CBR500R", 7000);
        System.out.println(coche.toString());
        System.out.println(moto.toString());
        coche.arrancar();
        moto.arrancar();
        coche.parar();
        moto.parar();
    }
}