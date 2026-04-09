import java.util.Scanner;
public class CuentaNumeros {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numero;
            int contador = 0;
            System.out.println("Introduzca un numero");
            numero = sc.nextInt();
            while (numero != -1) {
                contador++;
                System.out.println("Llevas " + contador + " numero introducidos");
                System.out.println("Introduce -1 para salir");
                numero = sc.nextInt();
            }
        }
    }
}