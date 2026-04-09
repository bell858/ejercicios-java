import java.util.Scanner; // poner siempre que queramos introducir algo por el teclado, es la orden para que si se introduce algo por el teclado lo pueda leer el programa.
public class Ejercicio4Tema5 {
    public static void main (String[]arg){
        try (Scanner entrada = new Scanner(System.in)){

        System.out.println("Introduce tu nombre:");
        String nombre = entrada.nextLine();

        System.out.println("Hola " + nombre + ", bienvenido");
        }
    }
}