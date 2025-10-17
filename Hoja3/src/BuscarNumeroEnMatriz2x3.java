import java.util.Scanner;

/**
 * Realiza un programa que cargue desde teclado una tabla bidimensional de 2x3 de números
 * enteros. Posteriormente el programa pedirá un número a buscar, y en caso de encontrarlo
 * indicará el número de fila y columna donde se ha encontrado por primera vez. El programa
 * ofrecerá al usuario la opción de seguir buscando más números: “¿Desea seguir
 * buscando?(s/n)”
 */
public class BuscarNumeroEnMatriz2x3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] numeros = new int[2][3];
        int numeroCandidato, fila = 0, columna = 0;
        boolean encontrado, seguirBuscando;
        String optBuscar;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("Introduce numero en la fila " + (i) + ", columna " + (j) + ": ");
                numeros[i][j] = Integer.parseInt(entrada.nextLine());
            }
        }

        do {
            encontrado = false;
            System.out.print("Indique el número a buscar: ");
            numeroCandidato = Integer.parseInt(entrada.nextLine());

            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros[i].length; j++) {
                    if (numeroCandidato == numeros[i][j]){
                        fila = i;
                        columna = j;
                        encontrado = true;
                    }
                }
            }

            if (encontrado) {
                System.out.println("El número " + numeroCandidato + ", fue encontrado en la fila " + fila + ", columna " + columna);
            } else {
                System.out.println("El número " + numeroCandidato + ", no ha sido encontrado");
            }

            do {
                System.out.print("¿Desea seguir buscando?(s/n) ");
                optBuscar = entrada.nextLine();
            } while (!optBuscar.equalsIgnoreCase("n") && !optBuscar.equalsIgnoreCase("s"));

            seguirBuscando = optBuscar.equalsIgnoreCase("s");

        } while (seguirBuscando);
        System.out.println("Saliste de la busqueda!");
        entrada.close();
    }
}
