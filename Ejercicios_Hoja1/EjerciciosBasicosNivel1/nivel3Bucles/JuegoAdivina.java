package EjerciciosBasicosNivel1.nivel3Bucles;

import java.util.Random;
import java.util.Scanner;

/**
 * Crea un juego donde el programa piense un número entre 1 y 10 y el usuario
 * deba adivinarlo
 */
public class JuegoAdivina {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random num = new Random();
        int numeroAletorio = num.nextInt(11);
        int numeroSeleccionado, contador=0;

        do {
            System.out.print("Indique el número y adivina: ");
            numeroSeleccionado = entrada.nextInt();

            if (numeroSeleccionado == numeroAletorio) {
                System.out.println("Adivinaste el número, era: " + numeroAletorio);
                break;
            } else if( numeroSeleccionado > numeroAletorio) {
                System.out.println("ERROR: te pasaste");
                contador++;
            } else {
                System.out.println("ERROR: te quedaste corto");
                contador++;
            }

        }while(contador < 3);

        if (contador == 3) System.out.println("Perdiste");
        else System.out.println("Ganaste");
    }
}
