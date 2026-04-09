import java.util.Scanner;
public class EliminaEspacios {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce una frase");
            String frase = sc.nextLine();
            String fraseSinEspacios = frase.replace(" ","");
            System.out.println("La frase sin espacios es: " + fraseSinEspacios);

        }
    }
}