
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Desarrolla un programa en Java que simule el juego de la Lotería Primitiva española.
 *
 * REQUISITOS:
 *
 * 1. Generar una combinación ganadora aleatoria de 6 números únicos entre 1 y 49
 *    - Los números NO pueden repetirse
 *    - Utilizar la clase Arrays de Java
 *
 * 2. Simular jugadas automáticas hasta acertar los 6 números
 *    - Cada jugada debe generar 6 números aleatorios únicos (1-49)
 *    - Comparar cada jugada con la combinación ganadora
 *    - Continuar hasta conseguir los 6 aciertos
 *
 * 3. Mostrar estadísticas finales:
 *    - Combinación ganadora
 *    - Número total de intentos necesarios
 *    - Inversión total (considerando que cada boleto cuesta 1.25€)
 */

public class LoteriaPrimitiva {

    public static void main(String[] args) {

        int[] ticketLoteria;  // boleto jugador
        int[] premio = {8, 18, 28, 38, 40, 46}; // boleto ganador

        int intentos = 0;
        boolean perdio;
        final float PRECIO_BOLETO = 1.25f;

        do {
            ticketLoteria = generaTicket(1, 50, premio.length);
            perdio = false;

            for (int i = 0; i < premio.length; i++) {
                if (ticketLoteria[i] != premio[i]){
                    intentos++;
                    perdio = true;
                    break;
                }
            }

        }while (perdio);

        System.out.println("El ticket ganador fue: " + Arrays.toString(ticketLoteria) +
                ", en el intento: " + String.format("%,d",intentos) + ", lo que supone una inversión de: " +
                String.format("%,.2f", intentos * PRECIO_BOLETO) + "€");
    }

    static int[] generaTicket(int p_inicio, int p_fin, int p_cantidad) {

        int numeroCandidato;
        int[] ticket = new int[p_cantidad];

        for (int i = 0; i < ticket.length; ) {
            numeroCandidato = numeroRandom(p_inicio, p_fin);

            if (!esRepetido(numeroCandidato, ticket)) ticket[i++] = numeroCandidato;
        }

        Arrays.sort(ticket);
        return ticket;
    }

    static int numeroRandom(int p_inicio, int p_fin) {
        return ThreadLocalRandom.current().nextInt(p_inicio, p_fin);
    }

    static boolean esRepetido(int numeroCandidato, int[] ticket) {
        for (int i = 0; i < ticket.length && ticket[i] != 0; i++) {
            if (numeroCandidato == ticket[i]) return true;
        }
        return false;
    }
}
