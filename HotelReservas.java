import java.util.Scanner;
public class HotelReservas {
            static boolean estaDisponible(boolean[][][] hotel, int piso, int habitacion, int dia) { // es un metodo significa que vamos a comprobar si las habitaciones estan libres o no; recorremos cada boolean y nos va a devolver o true o false, si da true significa que esta reservada por lo que nosotro tenemos que devolver false no esta disponible.
            return !hotel[piso][habitacion][dia];
        }
    public static void main (String[] args) {
  
        try (Scanner sc = new Scanner(System.in)) { // leer los datos intoducidos por teclado

        boolean[][][] hotel = new boolean[3][10][365]; // crea el hotel pisos 3; habitaciones 10; 365 dias al año;

        int opcion;

        do { // haz todo esto mientras (while) que la opcion sea distinta a 0
            System.out.println("\n--MENU HOTEL ---");
            System.out.println("1. Realizar reserva");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Comprobar disponibilidad de la habitacion");
            System.out.println("4. Mostrar habitaciones disponibles");
            System.out.println("5. Mostrar informe de ocupacion ese dia");
            System.out.println("0 Salir");
            System.out.println("Elige una opcion");
            
            opcion = sc.nextInt();
                switch (opcion) {
                    case 1-> {
                        System.out.println("Introduce el dia (0-364): ");
                        int diaReserva = sc.nextInt();

                        System.out.println("introduce el piso (0-2): ");
                        int pisoReserva = sc.nextInt();

                        System.out.println("Introduce el numero de habitacion (0-9): ");
                        int habitacionReserva = sc.nextInt();

                            if (estaDisponible(hotel, pisoReserva, habitacionReserva, diaReserva)) {
                                hotel[pisoReserva][habitacionReserva][diaReserva] = true;
                                System.out.println("Reserva realizada correctamente");
                            } else {
                                System.out.println("Esta habitacion ya esta reservada para este dia");
                            }
                    }
                    case 2 -> {
                        System.out.println("Introduce piso (0-2): ");
                        int pisoCancela = sc.nextInt();

                        System.out.println("Introduce habitacion (0-9): ");
                        int habitacionCancela = sc.nextInt();

                        System.out.println("Introduce el dia (0-364): ");
                        int diaCancela = sc.nextInt();

                        if(!estaDisponible(hotel,pisoCancela, habitacionCancela, diaCancela)) {
                            hotel[pisoCancela][habitacionCancela][diaCancela] = false;
                            System.out.println("La cancelacion ha sido realizada");
                        } else {
                            System.out.println("Introduzca correctamente los datos de su reserva");
                        }
                    
                    }
                    case 3 -> {
                        System.out.println("Introduce el piso (0-2): ");
                        int piso = sc.nextInt();
                        System.out.println("Introduce la habitacion (0-9): ");
                        int habitacion = sc.nextInt();
                        System.out.println("Introduce el dia(0-364): ");
                        int dia =sc.nextInt();
                        if (estaDisponible(hotel,piso,habitacion, dia)) {
                            System.out.println("La habitacion esta libre");
                        } else {
                            System.out.println("La habitacion esta ocupada");
                        }
                    }
                    case 4-> {
                        System.out.println("Introduce el dia (0-364): ");
                        int diaConsulta = sc.nextInt();
                        boolean hayDisponibles = false;

                        System.out.println("Habitaciones disponibles para el dia" + diaConsulta + ": ");

                        for (int p = 0; p < 3; p++) {
                            for (int h = 0; h < 10; h++){
                                if (estaDisponible(hotel, p, h, diaConsulta)) {
                                    System.out.println("Piso: " + p + ", habitacion: " + h);
                                    hayDisponibles = true;
                                }
                            }
                        }
                        if (!hayDisponibles) {
                            System.out.println("No hay habitaciones disponibles");
                        }
                    }
                    case 5 -> {
                        System.out.println("Introduce el dia (0-364): ");
                        int informeDia = sc.nextInt();
                        int ocupadas = 0;
                        int libres = 0;
                        for (int pisoInf = 0; pisoInf < 3; pisoInf++) {
                            for(int habInf = 0; habInf< 10; habInf++) {
                                if(hotel[pisoInf][habInf][informeDia]) {
                                    ocupadas++;
                                } else {
                                    libres++;
                                }
                            }
                        }
                        System.out.println("Informe de ocupacion: " + informeDia);
                        System.out.println("Habitaciones ocupadas: " + ocupadas);
                        System.out.println("Habitaciones libres: " + libres);
                    }
                    case 0 -> {
                        System.out.println("Salir del programa");}
                    default -> {
                        System.out.println("Opcion no valida");}
                }
                }
            
         while (opcion != 0);

        sc.close();

    }
     
}
}
   
