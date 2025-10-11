import java.util.Scanner;

/**
 * Programa que lee de manera consecutiva números hasta que se introducen dos números
 * iguales seguidos
 */
public class NumerosIgualesConsecutivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num=0, numAComparar;
        boolean conseguido = false;

        do {
            System.out.println("Indique el número a comparar: ");
            numAComparar = entrada.nextInt();

            if (num == numAComparar){
                conseguido = true;
                System.out.println("Conseguiste números consecutivos");
            } else {
                num = numAComparar;
            }
        }while (!conseguido);
    }
}
