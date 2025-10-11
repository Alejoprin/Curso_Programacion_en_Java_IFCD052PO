import java.util.Scanner;

/**
 * Programa que lee un número y muestra la suma de sus divisores, sin incluir el propio número
 * entre sus divisores.
 */
public class SumaDeDivisores {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        int sumaDivisores=0;

        System.out.print("Indique el número a evaluar: ");
        int numero = entrada.nextInt();

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0){
                sumaDivisores+= i;
            }
        }

        System.out.println("La suma de sus divisores es: " + sumaDivisores);
    }
}
