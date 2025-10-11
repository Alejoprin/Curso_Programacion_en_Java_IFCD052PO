import java.util.Scanner;

/**
 * Programa que lee 10 números e indica si todos los números son iguales o no
 */
public class NumerosIguales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        boolean iguales = true;

        System.out.print("Indique el número 1: ");
        int numAnterior = entrada.nextInt();

        for (int i = 2; i < 11; i++) {
            System.out.print("Indique el número " + i + ": ");
            num = entrada.nextInt();

            if (num != numAnterior){
                iguales = false;
            }
        }

        System.out.println(iguales ? "SON iguales" : "NO son iguales");
    }
}
