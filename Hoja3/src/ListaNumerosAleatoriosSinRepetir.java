import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Realiza un programa que muestre 10 números aleatorios enteros sin repetir de entre el 1 y
 * el 100, ambos inclusive.
 */
public class ListaNumerosAleatoriosSinRepetir {
    public static void main(String[] args) {
        int[] numerosAleatorios = new int[10];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = numeroRandom();

            for (int j = 0; i > 0 && j < i; j++) {
                if (numerosAleatorios[j] == numerosAleatorios[i]){
                    numerosAleatorios[j] = numeroRandom();
                }
            }
        }

        System.out.println("la lista de números es: " + Arrays.toString(numerosAleatorios));
    }

    static int numeroRandom(){
        return ThreadLocalRandom.current().nextInt(1,101);
    }
}
