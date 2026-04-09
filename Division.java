
import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ;System.out.print("Introduce el primer número: ");
            int num1 = scanner.nextInt();
            System.out.print("Introduce el segundo número: ");
            int num2 = scanner.nextInt();
            if (num2 == 0){
                System.out.println("Error: No se puede dividir por cero.");
            } else{
                int resultado = num1 / num2;
                System.out.println("El resultado de la division es:" + resultado);
            }

            }
            }
    }