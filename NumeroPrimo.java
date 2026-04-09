import java.util.Scanner;
public class NumeroPrimo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduzca un numero entero:");
            int numero = scanner.nextInt();
            boolean esPrimo = true;
            if (numero <=1) {
                esPrimo = false;
            } else{
                for (int i = 2; i <= Math.sqrt(numero); i++) { // bucle que empieza en el numero 2 y que se va a repetir siempre que i sea menor o igual a la raiz cuadrdada, se va incrementando en 1.
                    if (numero % i==0){
                        esPrimo = false;
                        break;
                    }
                }
            }
            if (esPrimo) {
                System.out.println("El numero es primo.");
            } else {
                System.out.println("El numero no es primo.");
            }

        }

    }
}