import java.util.Scanner;
public class Ejercicio6Tema5{
    public static void main(String[]args){
       try(Scanner valor = new Scanner(System.in)){
        System.out.println("Introduce un numero ");
        int numero = valor.nextInt();//se introduce el numero por teclado
        if (numero % 2 == 0)
        System.out.println ("El numero es par");
        else
        System.out.println ("El numero es impar");
       }
    }
}