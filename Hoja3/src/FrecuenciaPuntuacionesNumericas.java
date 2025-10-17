import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Realiza un programa que lea desde teclado 200 puntuaciones numéricas enteras que han
 * de estar comprendidas entre el 0 y el 5, ambos inclusive. Al finalizar se mostrará por cada
 * una de las puntuaciones, su frecuencia.
 */
public class FrecuenciaPuntuacionesNumericas {
    public static void main(String[] args) {
        int[] puntuaciones = new int[200];
        int[] frecuencias = new int[6];

        for (int i = 0; i < puntuaciones.length; i++) {
            puntuaciones[i] = numeroRandom();
        }

        System.out.println(Arrays.toString(puntuaciones));

        for (int puntuacion : puntuaciones){
            switch (puntuacion){
                case 0 -> frecuencias[0]++;
                case 1 -> frecuencias[1]++;
                case 2 -> frecuencias[2]++;
                case 3 -> frecuencias[3]++;
                case 4 -> frecuencias[4]++;
                case 5 -> frecuencias[5]++;
            }
        }

        for (int i = 0; i < frecuencias.length; i++) {
            System.out.println("Para la puntuación " + i + " su frecuencia fue: " + frecuencias[i]);
        }
    }

    static int numeroRandom(){
        return ThreadLocalRandom.current().nextInt(0,6);
    }
}
