package EjerciciosBasicosNivel2.nivel4ListasCadenas;

import java.util.Scanner;

/**
 * Pide una palabra y comprueba si es un palíndromo (se lee igual al derecho
 * y al revés)
 */
public class Palindromo {
    public static void main(String[] args) {
        ////////////////////
        // VERSION 1
        ////////////////////
        Scanner entrada = new Scanner(System.in);
        String palabra;
        StringBuilder palabraInversa = new StringBuilder();

        System.out.print("Indique la palabra a evaluar: ");
        palabra = entrada.nextLine();

        for (int i = palabra.length()-1; i >= 0; i--) {
            palabraInversa.append(palabra.charAt(i));
        }

        if (palabra.equals(String.valueOf(palabraInversa))){
            System.out.println("ES palindromo");
        } else {
            System.out.println("NO es palindromo");
        }

        ////////////////////
        // VERSION 2
        ////////////////////
        boolean esPalindromo = true;
        for (int i = 0; i < palabra.length() / 2 ; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }
        System.out.println(esPalindromo ? "ES palindromo" : "NO es palindromo");


        ////////////////////
        // VERSION 3
        ////////////////////
        StringBuilder palabraInversa3 = new StringBuilder(palabra).reverse();
        if (palabra.contentEquals(palabraInversa3)){
            System.out.println("ES palindromo");
        } else {
            System.out.println("NO es palindromo");
        }
    }
}
