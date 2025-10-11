package EjerciciosBasicosNivel2.nivel4ListasCadenas;

import java.util.Scanner;

/**
 * Pide una frase y muestra cuántas palabras contiene
 */
public class CantidadPalabras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner("Hola,     como estás");
        int contador=0;

        while (entrada.hasNext()){
            contador++;
            entrada.next();
        }
        entrada.close();

        System.out.println("Tiene " + contador + " palabras");
    }
}
