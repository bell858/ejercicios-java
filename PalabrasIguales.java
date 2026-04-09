import java.util.Scanner;
public class PalabrasIguales {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduzca la primera palabra");
            String palabra1 = sc.nextLine();
            System.out.println("Introduzca la segunda palabra");
            String palabra2 = sc.nextLine();
            if (palabra1.equals(palabra2)) {
                System.out.println("Las palabras son iguales");
            } else {
                System.out.println("Las palabras son diferentes");
            }
            

        }
        
    }
}