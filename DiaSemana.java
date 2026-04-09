import java.util.Scanner;
public class DiaSemana{
    public static void main(String[]args){
        try(Scanner dia = new Scanner(System.in)){
        System.out.println("Pon un numero de la semana del 1-7");
        int numero = dia.nextInt();
        switch(numero){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Numero no valido");
        }
            
        }

    }

}