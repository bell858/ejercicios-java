import java.util.Scanner;
public class NumeroAleatorio{
    public static void main(String[]args){
        try(Scanner  scanner = new Scanner(System.in)){
            System.out.println("Pon un numero del 1-10");
            int numero = scanner.nextInt();
            int numeroAleatorio = (int)(Math.random()*10)+1;//(int) numero aleatorio entero entre 1-10 Math.random()*10 multiplica el numero aleatorio por 10 para que sea entre 0-9 y luego sumas 1 para que sea entre 1-10
            if(numero == numeroAleatorio){
                System.out.println("Enhorabuena has acertado el numero, el numero aleatorio es: " + numeroAleatorio);
            }else{
                System.out.println("Lo siento has fallado el numero, el numero aleatorio es: " + numeroAleatorio);
            }
        }
    }
}