import java.util.Scanner;

/**
 * Programa que lee 11 números comprendidos entre el 20 y 40, ambos inclusive. En el caso
 * en el que algún número introducido no se encontrará dentro del rango permitido, se mostrará
 * un mensaje de error y seguirá pidiendo números. El programa finalizará cuando se hayan
 * introducido 11 números válidos y mostrará el número máximo introducido de los 11 válidos
 * Además, indicará cuántos números de los introducidos no han sido válidos
 */
public class NumerosValidos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int RANGO_MINIMO = 20;
        final int RANGO_MAXIMO = 40;
        final int NUMEROS_A_PEDIR = 11;
        int contador=0, numero, numeroMax=0, contadorNoValidos=0;

        while (contador < NUMEROS_A_PEDIR){
            System.out.print("Indique el número " + (contador+1) + ": ");
            numero = entrada.nextInt();

            if (numero >= RANGO_MINIMO && numero <= RANGO_MAXIMO){
                numeroMax = Math.max(numeroMax, numero);
                contador++;
            } else {
                System.out.println("ERROR: número invalido, debe indicar un número entre 20 y 40");
                contadorNoValidos++;
            }
        }

        System.out.println("El número máximo es: " + numeroMax + ", y han habido " + contadorNoValidos + " números no validos");
    }
}
