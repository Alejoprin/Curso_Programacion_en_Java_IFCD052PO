package EjerciciosBasicosNivel3.nivel4ListasTextos;

import java.util.Scanner;

/**
 * Crea un programa que pida al usuario una lista de 5 números y luego los
 * muestre en orden inverso
 */
public class MostrarListaNumerosInverso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Indique el número " + (i+1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
