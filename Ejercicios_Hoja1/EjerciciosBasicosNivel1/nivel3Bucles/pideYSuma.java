package EjerciciosBasicosNivel1.nivel3Bucles;

import java.util.Scanner;

/**
 * Pide un número e imprime la suma de todos los números desde 1 hasta
 * ese número
 */
public class pideYSuma {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, suma=0;

        System.out.print("Indique el número a evaluar: ");
        num = entrada.nextInt();

        for (int i = 0; i <= num; i++) {
            suma+= i;
        }
        System.out.println("El resultado es: " + suma);
    }
}
