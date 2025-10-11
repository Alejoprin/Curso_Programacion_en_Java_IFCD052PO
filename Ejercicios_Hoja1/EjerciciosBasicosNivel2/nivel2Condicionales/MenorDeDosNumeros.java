package EjerciciosBasicosNivel2.nivel2Condicionales;

import java.util.Scanner;

/**
 * Pide dos números e indica cuál es el menor
 */
public class MenorDeDosNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;

        System.out.print("Indique el primer número: ");
        num1 = entrada.nextInt();

        System.out.print("Indique el segundo número: ");
        num2 = entrada.nextInt();

        if ( num1 > num2 ){
            System.out.println(num2 + " es el número menor");
        } else if ( num1 < num2 ) {
            System.out.println(num1 + " es el número menor");
        } else {
            System.out.println("Son iguales");
        }
    }
}
