import java.util.Scanner;

/**
 * Realiza un programa que cargue desde teclado una tabla de enteros de dimensión 3x3. El
 * programa mostrará la columna en la que la suma de sus elementos sea menor.
 */
public class MostrarMenorSumaColumnas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] numeros = new int[3][3];
        int[] sumaColumnas = new int[3];
        int columnaMenor = Integer.MAX_VALUE, posicion = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("Indique número para añadir en fila " + i + ", y columna " + j + ": ");
                numeros[i][j] = entrada.nextInt();
            }
        }
        entrada.close();

        for (int[] filas : numeros){
            for (int numero : filas){
                System.out.print(numero + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                sumaColumnas[j] += numeros[i][j];
            }
        }

        for (int i = 0; i < sumaColumnas.length; i++) {
            if (columnaMenor > sumaColumnas[i]){
                columnaMenor = sumaColumnas[i];
                posicion = i;
            }
        }

        System.out.println("La suma de la columna menor es: " + columnaMenor + ", y es la siguiente");
        for (int i = 0; i < sumaColumnas.length; i++) {
            System.out.println(numeros[i][posicion]);
        }
    }
}
