import java.util.Scanner;

/**
 * Realiza un programa que dibuje un cuadrado mágico de orden impar introducido por el
 * usuario. Un cuadrado mágico es aquel en el que sin repetir ningún número, todas las filas,
 * columnas, y las dos diagonales suman lo mismo.
 */
public class CuadradoMagico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int orden;
        int[][] cuadradoMagico;
        int fila, columna, filaSiguiente, columnaSiguiente;

        do {
            System.out.print("Indique la 'orden' en número impar del cuadrado mágico: ");
            orden = Integer.parseInt(entrada.nextLine());

        } while (orden % 2 == 0);
        cuadradoMagico = new int[orden][orden];

        fila = 0;
        columna = orden / 2;

        for (int i = 1; i <= orden * orden; i++) {
            cuadradoMagico[fila][columna] = i;

            // aplicando metodo siamés arriba-derecha
            filaSiguiente = (fila - 1 + orden) % orden;
            columnaSiguiente = (columna + 1) % orden;

            if (cuadradoMagico[filaSiguiente][columnaSiguiente] == 0){
                fila = filaSiguiente;
                columna = columnaSiguiente;
            } else {
                fila = (fila + 1) % orden;
            }
        }

        for (int[] filas : cuadradoMagico){
            for (int numero : filas){
                System.out.printf("%4d",numero);
            }
            System.out.println();
        }

    }
}
