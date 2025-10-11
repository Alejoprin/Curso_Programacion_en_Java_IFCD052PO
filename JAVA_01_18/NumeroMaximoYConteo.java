import java.util.concurrent.ThreadLocalRandom;

/**
 * Programa que lee 87 números. Al finalizar mostrará el máximo introducido, y cuántas veces
 * se repite dicho máximo
 */
public class NumeroMaximoYConteo {
    public static void main(String[] args) {
        int numeroMaximo=Integer.MIN_VALUE, conteoNumMax=0;

        for (int i = 0; i < 87; i++) {
            int generadorNumeros = ThreadLocalRandom.current().nextInt(1,10);

            if (generadorNumeros > numeroMaximo) {
                numeroMaximo = generadorNumeros;
                conteoNumMax = 1;
            } else if (generadorNumeros == numeroMaximo) {
                conteoNumMax++;
            }

        }

        System.out.println("El número max es: " + numeroMaximo + " y se repitio: " + conteoNumMax);
    }
}
