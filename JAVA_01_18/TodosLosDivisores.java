import java.util.Scanner;

/**
 * Programa que muestra todos los divisores de un número introducido. Entre los divisores no
 * se incluirá el propio número
 */
public class TodosLosDivisores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Indique el número a evaluar: ");
        int numero = entrada.nextInt();

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0){
                System.out.println(i);
            }
        }
    }
}
