import java.util.Scanner;

/**
 * Realiza un programa que lea desde teclado 12 números y posteriormente los muestre. Los
 * números que estuvieran repetidos solo se deben mostrar una vez
 */
public class MostrarNumerosSinRepetir {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[12];
        boolean[] repetidos = new boolean[12];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Indique el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        entrada.close();

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    repetidos[j] = true;
                }
            }
        }

        System.out.println("Los números que no se repiten son:");
        for (int i = 0; i < numeros.length; i++) {
            if (!repetidos[i]) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
