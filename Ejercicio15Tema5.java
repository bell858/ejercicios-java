import java.util.Scanner;
    public class Ejercicio15Tema5 {
        public static void main (String[]args) {
            try (Scanner num = new Scanner(System.in)){
            
            System.out.println("Introduce un numero ");
            int num1 = num.nextInt();
            do {
                if (num1 < 0) {
                    System.out.println("El numero es negativo");
                }
            } while (num1 < 0);
                    System.out.println("El numero es positivo 5" + num1);   
        }
}    }