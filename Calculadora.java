import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("introduzca el primer numero: ");
            Double num1 = sc.nextDouble();
            System.out.println("Introduzca el segundo numero: ");
            double num2 = sc.nextDouble();
            System.out.println("Elija una operacion: +, -, *, /");
            String operacion = sc.next();
            double resultado = switch (operacion) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> {
                    if (num2 != 0) {
                        yield num1 / num2;
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                        yield 0;
                    }
                }
                default -> 0;
            };
            System.out.println("Resultado: " + resultado);
        
    }
}
}