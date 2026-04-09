import java.time.LocalTime;//Importamos la clase LocalTime para obtener la hora actual.
import java.time.format.DateTimeFormatter;//Importamos la clase DateTimeFormatter para formatear
import java.util.Scanner;
public class Reloj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss"); //Formato de hora que se mostrara.
        while (true) {
            LocalTime currentTime = LocalTime.now();// obtenemos la hora actual.
            String timeString = currentTime.format(dtf);// formateamos la hora actual con el formato definido.
            System.out.println("Hora actual: " + timeString); //mostramos la hora actual en la consola.
            System.out.println("Pulsa \"s\" para salir del reloj.");
            String input = sc.nextLine();
            if (input.equals("s")) {
                break;
            }
            try {
                Thread.sleep(1000); //esperamos 1 segundo antes de actualizar la hora.
            } catch (InterruptedException e) {
                e.printStackTrace();


            }

        }
    }
}