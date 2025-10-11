package EjerciciosBasicosNivel1.nivel2Condicionales;

import java.util.Scanner;

/**
 * Pide un número al usuario e indica si es par o impar
 */

public class parOImpar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("Introduzca el número: ");
        num = entrada.nextInt();

        if (num % 2 == 0){
            System.out.println("el número " + num + " es par");
        } else {
            System.out.println("el número " + num + " es impar");
        }
    }
}
