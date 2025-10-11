package EjerciciosBasicosNivel3.nivel3BuclesPracticos;

import java.util.Scanner;

/**
 * Escribe un programa que muestre un contador de pasos: desde 1 hasta el
 * número que indique el usuario, pero de 2 en 2
 */
public class ContadorDePasos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Indique el número de paso: ");
        int numeroPasos = entrada.nextInt();

        for (int i = 1; i <= numeroPasos; i+=2) {
            System.out.println("paso " + i);
        }
    }
}
