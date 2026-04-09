import java.util.Scanner;
public class EnteroPositivo {
    public static void main(String[]args){
        try(Scanner scanner = new Scanner(System.in)){
            int numero;

            do{
                System.out.print("Ingrese un numero entero positivo: ");
                numero = scanner.nextInt();
                    if (numero <=0){
                        System.out.println("Error el numero ingresado no es positivo.");
                    }
                } while (numero<=0); // repite el bucle de do hasta que el numero sea positivo
                System.out.println("Numero ingresado: " + numero);
                int contadorCifras = 0;//contador de cifras empieza en 0
                while (numero !=0){
                    contadorCifras++;//contador de cifras
                    numero /=10; //eliminar la ultima cifra del numero que has escrito para poder contar las cifras y dar el resultado correcto
                }
                if (contadorCifras == 1){
                    System.out.println("El numero es de una cifra.");
                } else {
                    System.out.println("El numero tiene " + contadorCifras + " cifras.");
                }
            }
        }
    }