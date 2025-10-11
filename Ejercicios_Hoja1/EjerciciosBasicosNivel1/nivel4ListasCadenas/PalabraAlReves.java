package EjerciciosBasicosNivel1.nivel4ListasCadenas;

import java.util.Scanner;

/**
 * Pide una palabra y muéstrala al revés
 */
public class PalabraAlReves {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabra;

        System.out.print("Indique la palabra a transformar: ");
        palabra = entrada.nextLine();

        // primera manera: recorriendo con for
        System.out.print("La palabra " + palabra + " al revés: ");
        for (int i = palabra.length() -1; i >= 0; i--) {
            System.out.print(palabra.charAt(i));
        }

        // segunda manera: utilizando el metodo reverse de la clase StringBuilder
        System.out.print("\nSegunda manera: ");
        StringBuilder palabraInvertida = new StringBuilder(palabra).reverse();
        System.out.println(palabraInvertida);
    }
}
