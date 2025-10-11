/**
 * Programa que muestra los 100 primeros números primos
 */
public class CienNumerosPrimos {
    public static void main(String[] args) {
        int conteo=0, i=2;
        boolean esPrimo;

        while (conteo < 101){
            esPrimo = true;

            for (int j = 2; esPrimo && j < i ; j++) {
                if (i % j == 0) esPrimo = false;
                if (j == i-1) {
                    conteo++;
                }
            }

            if (esPrimo) System.out.println(i);
            i++;
        }
    }
}
