package EjerciciosBasicosNivel3.nivel1UtilidadesSimples;

/**
 * Haz un programa que convierta una cantidad de euros a dólares (usa una
 * tasa fija, por ejemplo 1€ = 1.1$)
 */
public class EurAUsd {
    public static void main(String[] args) {
        final float USD_TASA = 1.1f;
        int eur = 265;

        System.out.println(eur + " €, son " + eur * USD_TASA + " $");
    }
}
