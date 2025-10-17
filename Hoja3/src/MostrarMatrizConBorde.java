/**
 * Realiza un programa que cargue una tabla de 5 filas y 7 columnas con los siguientes
 * números, para finalmente mostrarla con borde:
 * 35 26 25 16 15  6 5
 * 34 27 24 17 14  7 4
 * 33 28 23 18 13  8 3
 * 32 29 22 19 12  9 2
 * 31 30 21 20 11 10 1
 */
public class MostrarMatrizConBorde {

    static final char ESQUINA_SUP_IZQ = '╔';
    static final char ESQUINA_SUP_DER = '╗';
    static final char ESQUINA_INF_IZQ = '╚';
    static final char ESQUINA_INF_DER = '╝';
    static final char LINEA_VER = '║';
    static final char LINEA_HOR = '═';
    static final char SEPARADOR_HACIA_ABAJO = '╦';
    static final char SEPARADOR_HACIA_ARRIBA = '╩';
    static final char SEPARADOR_HOR_HACIA_DER = '╠';
    static final char SEPARADOR_HOR_HACIA_IZQ = '╣';
    static final char SEPARADOR_HOR_CRUZ = '╬';

    static final byte BORDE_ARRIBA = 1;
    static final byte BORDE_ABAJO = 0;

    public static void main(String[] args) {
        int[][] numeros = {{35,26,25,16,15,6,5}, {34,27,24,17,14,7,4}, {33,28,23,18,13,8,3}, {32,29,22,19,12,9,2}, {31,30,21,20,11,10,1}};
        int anchoMatriz = numeros[0].length * 4 + 1;
        int largoMatriz = numeros.length + 4;

        // pinta la primera linea
        pintaBorde(BORDE_ARRIBA, anchoMatriz);

        // pinta matriz
        int k = 0;
        for (int i = 0; i < largoMatriz; i++) {
            if (i % 2 == 1){
                System.out.print(SEPARADOR_HOR_HACIA_DER);
                k++;
            } else {
                System.out.print(LINEA_VER);
            }

            for (int j = 0; j < numeros[k].length; j++) {
                if (i % 2 == 1) {
                    if (j != numeros[k].length - 1) {
                        System.out.printf("%c%c%c%c", LINEA_HOR, LINEA_HOR, LINEA_HOR, SEPARADOR_HOR_CRUZ);
                    } else {
                        System.out.printf("%c%c%c%c", LINEA_HOR, LINEA_HOR, LINEA_HOR, SEPARADOR_HOR_HACIA_IZQ);
                    }

                } else {
                    if (numeros[k][j] > 9) {
                        System.out.printf(" %d%c",numeros[k][j], LINEA_VER);
                    } else {
                        System.out.printf("%3d%c", numeros[k][j], LINEA_VER);
                    }
                }
            }
            System.out.println();
        }

        // pinta la ultima linea
        pintaBorde(BORDE_ABAJO, anchoMatriz);
    }

    static void pintaBorde(byte posicionBorde, int anchoMatriz){
        for (int i = 0; i < anchoMatriz; i++) {
            if (i == 0) {
                System.out.print(posicionBorde == BORDE_ARRIBA ? ESQUINA_SUP_IZQ : ESQUINA_INF_IZQ);
            } else if (i == anchoMatriz - 1) {
                System.out.println(posicionBorde == BORDE_ARRIBA ? ESQUINA_SUP_DER : ESQUINA_INF_DER);
            } else if (i % 4 == 0) {
                System.out.print(posicionBorde == BORDE_ARRIBA ? SEPARADOR_HACIA_ABAJO : SEPARADOR_HACIA_ARRIBA);
            } else {
                System.out.print(LINEA_HOR);
            }
        }
    }
}
