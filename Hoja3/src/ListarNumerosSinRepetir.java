import java.util.Scanner;

/**
 * Realiza un programa que lea desde teclado 10 números sin repetir. Si el usuario introduce
 * algún número repetido se le debe notificar, y no ha de ser contabilizado
 */
public class ListarNumerosSinRepetir {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int numeroCandidato;
        boolean esRepetido;

        for (int i = 0; i < numeros.length; ) {
            esRepetido = false;
            System.out.print("Indique el número " + (i + 1) + ": ");
            numeroCandidato = entrada.nextInt();

            for (int j = 0; j < i; j++) {
                if (numeroCandidato == numeros[j]){
                    esRepetido = true;
                    break;
                }
            }

            if (esRepetido) System.out.println("Número repetido");
            else {
                numeros[i] = numeroCandidato;
                i++;
            }
        }
        entrada.close();
    }
}
