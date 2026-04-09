import java.util.Scanner; // librería para leer datos desde el teclado.
public class BienvenidaPersonalizada{ // declaración de la clase.
    public static void main(String[] args) {//metodo principal del programa todo lo que va dentro se va a ejecutar.
       try (Scanner entrada = new Scanner(System. in)){//nos permite leer datos desde el teclado.

        System.out.print("Introduce tu nombre: ");//imprime el mensaje.
        String nombre = entrada.nextLine();//lee lo que el usuario introduce y lo guarda.

        System.out.print("Introduce tu apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = entrada.nextInt();//lee un número entero.

        if (edad < 18) { //condición para verificar si el usuario es menor de edad.
            System.out.println("Hola "+nombre+" "+apellido+", eres menor de edad.");
        } else if (edad>= 18 && edad <65) { // && es un operado logico que significa "y", se utiliza para combinar dos condiciones.
            System.out.println("Hola "+nombre +" "+apellido+ ", eres un adulto.");
        } else { 
            System.out.println("Hola "+nombre+ " "+apellido+ ", estas en etapa de jubilacion.");
        }
    
    }
}
}