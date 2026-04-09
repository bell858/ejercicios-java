import java.util.Scanner;
public class Multiplicacion {
    public static void main(String[] args){
        try (Scanner entrada = new Scanner(System.in)) {

            System.out.print("Introduce el primer numero: ");
            int num1 = entrada.nextInt();

            System.out.print("Introduce el segundo numero: ");
            int num2 = entrada.nextInt();

            int resultado = num1 * num2;

        if (num1 < 0 || num2 < 0) {
            System.out.println("No se admiten numeros negativos");
        }
        else {
            System.out.println("El resultado de la multiplicacion es: " + resultado);
        }
        }
        }
    }