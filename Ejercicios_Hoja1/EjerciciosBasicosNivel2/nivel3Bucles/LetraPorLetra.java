package EjerciciosBasicosNivel2.nivel3Bucles;

import java.util.Scanner;

/**
 * Pide una palabra e imprímela letra por letra
 */
public class LetraPorLetra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabra;

        System.out.print("Indique la palabra a evaluar: ");
        palabra = entrada.nextLine();

        for (char letra : palabra.toCharArray()){
            System.out.print(letra + " ");
        }
    }
}
