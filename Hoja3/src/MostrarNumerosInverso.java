import java.util.Scanner;

/**
 * Realiza un programa que lea desde teclado 11 números enteros, para posteriormente
 * mostrarlos en el orden inverso al que fueron introducidos.
 */
public class MostrarNumerosInverso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[11];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Indique el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        entrada.close();

        System.out.println("El orden inverso de los números dados es: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            if (i > 0) System.out.print(numeros[i] + " ");
            else System.out.println(numeros[i]);
        }
    }
}
