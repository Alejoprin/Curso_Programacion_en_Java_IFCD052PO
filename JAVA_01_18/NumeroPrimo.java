import java.util.Scanner;

/**
 * Programa que nos informa si un número introducido es primo o no
 */
public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean esPrimo = true;

        System.out.print("Indique el número a evaluar: ");
        int numero = entrada.nextInt();

        for (int i = 2; esPrimo && i < numero; i++) {
            if (numero % i == 0){
                esPrimo = false;
            }
        }

        System.out.println(esPrimo ? "ES primo" : "NO es primo");
    }
}
