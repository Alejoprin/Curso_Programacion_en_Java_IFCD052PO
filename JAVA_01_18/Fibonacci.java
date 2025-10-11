import java.util.Scanner;

/**
 * Programa que genera los N primeros números de la serie de Fibonacci. El valor N deberá
 * ser leído por el teclado. NOTA: Los dos primeros números son 1, y el resto se obtiene
 * sumando los dos anteriores: 1,1,2,3,5,8,13,21…
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numActual=1, numAnterior=0, numAux=0;

        System.out.print("Indique la cantidad de número de la serie Fibonacci: ");
        int numerosAGenerar = entrada.nextInt();

        for (int i = 0; i < numerosAGenerar; i++) {
            System.out.print(numActual + " ");
            numAux = numActual;
            numActual += numAnterior;
            numAnterior = numAux;
        }
    }
}
