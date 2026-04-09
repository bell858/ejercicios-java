import java.util.Scanner;
public class CuentaVocales {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduzca una frase: ");
            String frase = sc.nextLine();
            int contadorVocales = 0;
            for (int i = 0; i < frase.length(); i++) {// recoorremos cada caracter de la frase que empieza en 0 y termina cuando termina la frase.
                char letra = frase.charAt(i); // obtenemos el caracter en la posicion 0,luego 1, luego 2, etc.
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                    contadorVocales++;
                }
            }
            System.out.println("El número de vocales en la frase es: " + contadorVocales);
        }
    }
}