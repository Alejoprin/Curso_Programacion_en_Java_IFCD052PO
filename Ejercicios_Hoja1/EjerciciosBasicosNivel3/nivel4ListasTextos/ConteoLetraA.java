package EjerciciosBasicosNivel3.nivel4ListasTextos;

import java.util.Scanner;

/**
 * Pide una frase y muestra cuántas veces aparece la letra "a"
 */
public class ConteoLetraA {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Indique la frase a evaluar: ");
        String frase = entrada.nextLine();
        int conteoletraA=0;

        for(char letra : frase.toLowerCase().toCharArray()){
            if (letra == 'a'){
                conteoletraA++;
            }
        }

        System.out.println("La cantidad de letras \"a\" es " + conteoletraA);
    }
}
