package EjerciciosBasicosNivel3.nivel4ListasTextos;

import java.util.Scanner;

/**
 * Crea una lista con 5 ciudades y pide al usuario una posición (0–4) para
 * mostrar qué ciudad está en esa posición
 */
public class AveriguarCiudadEnLista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] ciudades = {"Paris", "Madrid", "Caracas", "Guatire", "Barcelona"};

        System.out.print("Indique la opción de ciudad entre 0 y 4: ");
        int opcionCiudad = entrada.nextInt();

        if (opcionCiudad >= 0 && opcionCiudad <= 4){
            System.out.println("La ciudad seleccionada es: " + ciudades[opcionCiudad]);
        } else {
            System.out.println("ERROR: elige un número entre 0 y 4");
        }

    }
}
