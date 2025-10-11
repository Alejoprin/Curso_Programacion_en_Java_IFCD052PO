package EjerciciosBasicosNivel3.nivel3BuclesPracticos;

import java.util.Scanner;

/**
 * Crea un programa que pida 5 notas y muestre la media final
 */
public class MediaFinal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota, sumaNota=0, cantidadNotas=0;

        for (; cantidadNotas < 5; cantidadNotas++) {
            System.out.print("Ingrese la nota " + (cantidadNotas+1) + ": ");
            nota = entrada.nextInt();

            sumaNota+= nota;
        }

        float mediaFinal = (float)sumaNota/cantidadNotas;
        System.out.println("La media final de las notas ingresadas es: " + String.format("%.2f", mediaFinal));
    }
}
