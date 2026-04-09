public class Primos100 {
    public static void main (String[] args){
        System.out.println("Los numero primos del 1 al 100 son: ");
        for (int i = 2; i <= 100; i++){
            boolean esPrimo = true;
            int limite = (int) Math.sqrt(i);//para calcular la raiz cuadrada de i y convertirla a un numero entero, se hace esto para optimizar el proceso de verificacion de numeros primos, ya que no es necesario verificar mas alla de la raiz cuadrada del numero.
            for (int j = 2; j <= limite; j++){// para dividir el numero i entre todos los numeros desde el 2 hasta la raiz cuadrada de i.
                if (i % j == 0){// si el numero i es divisible por j, entonces no es primo.
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(i);
            }
        }
    }
}
