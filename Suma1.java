import java.util.Scanner;
public class Suma1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            System.out.println("Introduzca un numero");
            numero = scanner.nextInt();
        if (numero < 0){
             System.out.println("Introduzca un numero positivo");
        } else {
            for (int i = numero; i < 30; i++) {
                 int resultado = i + 1;
        System.out.println("Resultado: " + resultado);
    }
}

        }
    }
}