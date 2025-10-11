package EjerciciosBasicosNivel1.nivel5Funciones;

/**
 * Crea una función que indique si un número es primo o no
 */
public class NumeroPrimo {
    public static void main(String[] args) {

        System.out.println(esPrimo(96) ? "ES primo" : "NO es primo");
    }

    static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
