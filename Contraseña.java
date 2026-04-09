import java.util.Scanner;
public class Contraseña {
    public static void main(String[]aargs) {
        try (Scanner contraseña = new Scanner(System.in)){
            String contraseña1 = "Gor"; // Variable tipo texto que almacena la contraseña correcta "contraseña"
            String contraseña2; // Variable tipo texto que almacena la contraseña introducida por el usuario
            int intentos = 3;
            boolean acceso = false;
        System.out.println("Introduce la contraseña: ");
        while (intentos > 0 && !acceso) {// Mientras el número de intentos sea mayor que 0 y el acceso no sea concedido, se ejecutará el bucle
            contraseña2 = contraseña.nextLine().trim(); // Lee la contraseña introducida por el usuario y elimina los espacios en blanco al principio y al final;
            if (contraseña2.equalsIgnoreCase(contraseña1)) {
                acceso = true;
                System.out.println("La contraseña es correcta");
            } else {
                intentos--;// Esto es para que cada vez que se escriba una contraseña incorrecta se vaya restando un intento
            System.out.println("Contraseña incorrecta. Te quedan " + intentos + " intentos");
            }
            }
            }
        }
    }

            