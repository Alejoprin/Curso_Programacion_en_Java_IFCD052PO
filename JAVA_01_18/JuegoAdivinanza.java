import java.util.Scanner;

/**
 * Programa consiste en un juego en el que el Jugador1 introduce un número entre el 1 y el
 * 100 y el Jugador2 tendrá que adivinarlo en un máximo de 10 intentos. Por cada intento del
 * Jugador2, y en el caso de no acertar, se mostrará el mensaje “Te pasaste”, o “No llegaste”,
 * según corresponda. De la misma manera, y al terminar el programa, se mostrarán los
 * mensajes “Acertaste” o bien “Intentos agotados”
 */
public class JuegoAdivinanza {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean adivino = false;
        int intentos=1, numJugador2;

        System.out.print("Jugador 1 introduce el número a adivinar del 1 al 100: ");
        int numJugador1 = entrada.nextInt();

        do {
            System.out.print("Jugador 2 introduce un número , intento " + intentos + ": ");
            numJugador2 = entrada.nextInt();

            if (numJugador2 == numJugador1){
                System.out.println("Acertaste");
                adivino = true;
            } else if (numJugador2 < numJugador1){
                System.out.println("NO llegaste");
                intentos++;
            } else {
                System.out.println("TE pasaste");
                intentos++;
            }

        }while (!adivino && intentos < 11);

        System.out.println(!adivino ? "Intentos Agotados" : "");
    }
}
