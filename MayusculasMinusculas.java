import java.util.Scanner;
public class MayusculasMinusculas {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce una frase");
            String frase = sc.nextLine();
            String mayusculas = frase.toUpperCase();
            String minusculas = frase.toLowerCase();
            System.out.println("Si quieres la frase en mayusculas introduce 1, si quieres la frase en minuscula introduce 2");
            int opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println(mayusculas);
            } else if (opcion == 2) {
                System.out.println(minusculas);
            }
        }
        
    }
}
