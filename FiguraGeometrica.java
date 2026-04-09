public interface FiguraGeometrica {
    public double calcularArea();
    public double calcularPerimetro();
}
class Circulo implements FiguraGeometrica { // Clase dentro de la interfaz Figura Geometrica.
    private double radio;
    
    public Circulo(double radio) {// Constructor para inicializar el radio del círculo.
        this.radio = radio;
    }

    @Override // Sobrescribe el metodo area del ciruculo de la interfaz,
    public double calcularArea() {
        return Math.PI * radio * radio; // Calcula el area del circulo.
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio; // Calcula el perimetro del circulo.
    }
}

class Rectangulo implements FiguraGeometrica { // Clase dentro de la interfaz Figura Geometrica.
    private final double largo;
    private final double ancho;

    public Rectangulo(double largo, double ancho) { // Constructor para inicializar el largo y ancho del rectángulo.
        this.largo = largo;
        this.ancho = ancho;
    }
    @Override
    public double calcularArea() {
        return largo * ancho; // Calcula el area del rectangulo.
    }
    @Override
    public double calcularPerimetro() {
        return 2 * (largo + ancho); // Calcula el perimetro del rectangulo.
    }
}

class Triangulo implements FiguraGeometrica { // Clase dentro de la interfaz Figura Geometrica.
    private final double base;
    private final double altura;


    public Triangulo(double base, double altura) { // Constructor para inicializar la base y altura del triángulo.
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return (base * altura) / 2; // Calcula el area del triangulo.
    }
    @Override
    public double calcularPerimetro() {
        // Implementación del perímetro del triángulo (ejemplo simple, puede variar)
        return base + altura + Math.hypot(base, altura);
    }
}
class Ej3 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("El area del circulo es: " + circulo.calcularArea());
        
        Rectangulo rectangulo = new Rectangulo(4, 6);
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());

        Triangulo triangulo = new Triangulo(3, 4);
        System.out.println("El area de un triangulo es: " + triangulo.calcularArea());
        System.out.println("El perimetro del triangulo es: " + triangulo.calcularPerimetro());
    }
}
