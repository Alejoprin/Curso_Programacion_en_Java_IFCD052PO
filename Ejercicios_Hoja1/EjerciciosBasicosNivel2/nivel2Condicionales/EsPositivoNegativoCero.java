package EjerciciosBasicosNivel2.nivel2Condicionales;

import java.util.Scanner;

/**
 * Pide un número y muestra si es positivo, negativo o cero
 */
public class EsPositivoNegativoCero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Indique el número a evaluar: ");
        numero = entrada.nextInt();

        if (numero == 0) {
            System.out.println("El número es 0");
        } else if(numero > 0){
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
    }
}
