package EjerciciosBasicosNivel1.nivel4ListasCadenas;

import java.util.Scanner;

/**
 * Pide una palabra y muestra cuántas vocales tiene
 */
public class CuantasVocales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabra;
        int contadorVocales=0;

        System.out.println("Indique la palabra a evaluar: ");
        palabra = entrada.nextLine();
        entrada.close();

        for(char letra : palabra.toLowerCase().toCharArray()) {
            switch (letra){
                case 97: // a
                case 101: // e
                case 105: // i
                case 111: // o
                case 117: // u
                    contadorVocales++;
                    break;
            }
        }

        System.out.println("la palabra " + palabra + " contiene " + contadorVocales + " vocales");
    }
}
