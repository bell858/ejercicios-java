import java.util.Scanner;
public class AreaCirculo {
    public static void main (String[]args){   
        final double Pi = 3.14;
        try (Scanner radio = new Scanner(System.in)){
        System.out.println("Introduce el radio de un circulo");
        String radio1 = radio.nextLine();
        double radio2 = Double.parseDouble(radio1); // Convertir un string a un numero tipo double.
        double area = Pi * (radio2 * radio2);
        System.out.println("El area del circulo es: " + area);
    }
}
}