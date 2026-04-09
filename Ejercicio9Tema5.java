import java.util.Scanner;

public class Ejercicio9Tema5 {
        public static void main(String[]args){

        final double IVA = 0.21;
        try(Scanner precio = new Scanner(System.in)){
            System.out.println("Introduce el precio del producto");
            String precio1 = precio.nextLine();
            double precio2 = Double.parseDouble(precio1);
            double precioconIVA = precio2 + (precio2 * IVA);
            System.out.println("El precio del producto con IVA es: " + precioconIVA);
        }
    }
}