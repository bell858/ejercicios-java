import java.util.Scanner;
public class Ejercicio7Tema5{
    public static void main(String[]args){
    try(Scanner valor = new Scanner(System.in)){
    System.out.println("Introduce un numero ");
    int numero = valor.nextInt();
    char caracter = (char) numero;
    System.out.println ("El numero introducido es el caracter: " + caracter);
    }
    }
}
