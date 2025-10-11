package EjerciciosBasicosNivel2.nivel3Bucles;

import java.util.Scanner;

/**
 * Imprime la tabla de multiplicar de un número introducido por el usuario
 */
public class TablaMultiplicarDeNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("Indique el número a evaluar: ");
        numero = entrada.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }
    }
}
