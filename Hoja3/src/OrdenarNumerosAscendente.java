import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Realiza un programa que lea 25 números para posteriormente mostrarlos en orden
 * ascendente.
 */
public class OrdenarNumerosAscendente {
    public static void main(String[] args) {
        int[] numeros = new int[25];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = ThreadLocalRandom.current().nextInt(1,100);
        }
        System.out.println("Números originales: " + Arrays.toString(numeros));

        int aux;
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[i]) {
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        System.out.println("Números ordenados: " + Arrays.toString(numeros));
    }
}
