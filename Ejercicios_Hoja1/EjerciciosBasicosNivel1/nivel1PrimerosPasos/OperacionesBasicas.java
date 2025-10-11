package EjerciciosBasicosNivel1.nivel1PrimerosPasos;

import java.util.Scanner;

/**
 * Crea un programa que pida dos números y muestre:
 * - La suma
 * - La resta
 * - La multiplicación
 * - La división
 */

public class OperacionesBasicas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num1, num2;

        System.out.print("Indique el primer número: ");
        num1 = entrada.nextInt();

        System.out.print("Indique el segundo número: ");
        num2 = entrada.nextInt();

        System.out.println("La suma de " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("La resta de " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("La multiplicación de " + num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println("La división de " + num1 + " / " + num2 + " = " + ((float)num1 / num2));
    }
}
