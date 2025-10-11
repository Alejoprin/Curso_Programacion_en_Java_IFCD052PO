package EjerciciosBasicosNivel2.nivel3Bucles;

import java.util.Scanner;

/**
 * Pide un número y cuenta hacia atrás desde ese número hasta 0
 */
public class CuentaRegresiva {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("Indique el número a evaluar: ");
        numero = entrada.nextInt();

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
