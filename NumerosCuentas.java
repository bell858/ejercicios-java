import java.util.Scanner;
public class NumerosCuentas {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduce un numero");
            double numero, mayor = 0, menor = 0, suma = 0, SumaPositivos = 0, SumaNegativos = 0;
            int contador = 0;
            do {
                System.out.println("Introduce un numero, para finalizar introduzca -1");
                numero= sc.nextDouble();
                if (numero != -1) {
                    suma += numero;// suma todos los numeros que vayamos introduciendo
                    contador++;
                    if (numero > mayor) {
                        mayor = numero;
                    }
                    if (numero < menor) {
                        menor = numero;
                    }
                    if (numero > 0) {
                        SumaPositivos += numero;
                    } else if (numero < 0) {
                        SumaNegativos += numero;
                    }
                System.out.println("El numero mayor es: " + mayor);
                System.out.println("El numero menor es: " + menor);
                System.out.println("La suma de los numeros es: " + suma);
                System.out.println("La suma de los numeros positivos es: " + SumaPositivos);
                System.out.println("La suma de los numeros negativos es: " + SumaNegativos);
                System.out.println("Cantidad de numeros introducidos: " + contador);
                }
            } while (numero != -1);
        }
    }
}