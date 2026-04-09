public abstract class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) { // crear los constructores.
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public abstract int calcularPrecioFinal(); // crear el método abstracto para calcular el precio final.

    static class Electronico extends Producto {
        private int tarifaReciclaje;
        public Electronico(int id, String nombre, double precio, int tarifaReciclaje) {
            super(id, nombre, precio);
            this.tarifaReciclaje = tarifaReciclaje;
        }

        @Override
        public int calcularPrecioFinal() {
            return (int) (getPrecio() + tarifaReciclaje);
        }
    }

    static class Alimento extends Producto {
        private double impuestoVentas;
        public Alimento(int id, String nombre, double precio, double impuestoVentas) {
            super(id, nombre, precio);
            this.impuestoVentas = impuestoVentas;
        }

        @Override
        public int calcularPrecioFinal() {
            return (int) (getPrecio() + impuestoVentas);
        }
    }

    static class Ropa extends Producto {
        private int marca;
        public Ropa(int id, String nombre, double precio, int marca) {
            super(id , nombre, precio);
            this.marca = marca;
        }

        @Override
        public int calcularPrecioFinal() {
            return (int) (getPrecio() + marca);
        }
    }

    static class Ej4 {
        public static void main(String[] args) {
            Electronico electronico = new Electronico(1 ,"Televisor", 500, 50);
            Alimento alimento = new Alimento(2, "Pan", 2, 0.5);
            Ropa ropa = new Ropa (3, "Camiseta", 20, 5);
            System.out.println("El precio final del televisor es: " + electronico.calcularPrecioFinal());
            System.out.println("El precio final del pan es: " + alimento.calcularPrecioFinal());
            System.out.println("El precio final de la camiseta es: " + ropa.calcularPrecioFinal());
        }
    }

}