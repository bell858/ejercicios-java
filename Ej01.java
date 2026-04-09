class Calculadora2 {
    private double numero1;
    private double numero2;

    public double getNumero1() { // metodo pata buscar el numero 1.
        return numero1;
    }

    public void setNumero1(double numero1) { // metodo para asignar el numero 1.
        this.numero1 = numero1;
    }

    public double getNumero2() { // metodo pata buscar el numero 2.
        return numero2;
    }

    public void setNumero2(double numero2) { // metodo para asignar el numero 2.
        this.numero2 = numero2;
    }

    public double sumar() { // metodo para sumar los numeros.
        return numero1 + numero2;
    }

    public double restar() { // metodo para restar los numeros.
        return numero1 - numero2;
    }

    public double multiplicar() { // metodo para multiplicar los numeros.
        return numero1 * numero2;
    }

    public double dividir() { // metodo para dividir los numeros.
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            throw new ArithmeticException("No se puede dividir por cero");
        }
    }
}

public class Ej01 {
    public static void main(String[] args) {
        Calculadora2 calculadora = new Calculadora2();
        calculadora.setNumero1(10);
        calculadora.setNumero2(5);
        System.out.println("Suma: " + calculadora.sumar());
        System.out.println("Resta: " + calculadora.restar());
        System.out.println("Multiplicación: " + calculadora.multiplicar());
        System.out.println("División: " + calculadora.dividir());
    }
}