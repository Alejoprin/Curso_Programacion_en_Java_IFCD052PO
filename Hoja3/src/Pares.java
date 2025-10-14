import java.util.Scanner;

/**
 * Realiza un programa que lea desde teclado 10 números y posteriormente muestre
 * solamente los que sean pares
 */
public class Pares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        StringBuilder pares = new StringBuilder();

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Indique el número " + (i+1) + ": ");
            numeros[i] = entrada.nextInt();

            if (numeros[i] % 2 == 0) {
                pares.append(numeros[i]).append(" ");
            }
        }
        entrada.close();

        if (pares.isEmpty()) System.out.println("NO hay número pares");
        else System.out.println("Los números pares de la lista indicada son: " + pares.toString().trim());
    }
}
