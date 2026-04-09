import java.util.Scanner;
  public class Numeroventas {
    public static void main (String[]args){
        try(Scanner ventas = new Scanner(System.in)){
        System.out.println ("Introduzca el numero de ventas ");
        int totalventas = ventas.nextInt(); 

        float importetotal = 0; // variable para almacenar el importe total de las ventas.
           for (int i = 1; i <=totalventas; i++){
             System.out.println ("Introduzca el numero de total de ventas" + i);
              float importe = ventas.nextFloat(); // variable para almacenar el importe de cada ventas
               importetotal += importe;
               System.out.println("El importe total de las ventas es: " + importetotal);

           }

    }

    }
  }

