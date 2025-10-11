package EjerciciosBasicosNivel1.nivel2Condicionales;

import java.util.Scanner;

/**
 * Pide tres números y muestra cuál es el mayor de ellos
 */

public class MayorDeTres {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, numMayor = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            System.out.print("Introduzca el número " + (i+1) + " :");
            num = entrada.nextInt();

            numMayor = Math.max(numMayor, num);
        }

        System.out.println("El número mayor es " + numMayor);
    }
}
