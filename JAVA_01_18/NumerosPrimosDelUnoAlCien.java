/**
 * Programa que muestra los números primos existentes entre el 1 y el 100. NOTA: Un número
 * es primo si tiene dos únicos divisores que son el 1 y él mismo
 */
public class NumerosPrimosDelUnoAlCien {
    public static void main(String[] args) {

        // primera versión
        for (int i = 1; i <= 100; i++)
            for (int j = 2; j < i; j++) {
                if (i % j == 0) break;
                if (j == i - 1) System.out.println(i);
            }

        // segunda versión
        boolean esPrimo;
        for (int i = 1; i <= 100; i++) {
            esPrimo = true;

            for (int j = 2; esPrimo && j < i; j++) {
                if (i % j == 0) esPrimo = false;
            }

            if (esPrimo){
                System.out.println(i);
            }
        }
    }
}
