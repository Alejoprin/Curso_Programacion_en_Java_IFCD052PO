import java.util.Arrays;
import java.util.Scanner;

/**
 * Realizar el juego Tres en Raya
 */

public class TresEnRaya {

    static final String MARCA_JUGADOR1 = "X";
    static final String MARCA_JUGADOR2 = "O";
    static final String POSICION_VACIA = " ";
    static final int JUGADAS_MAX = 9;
    static final char LINEA_VER = '║';
    static final char LINEA_HOR = '═';
    static final char SEPARADOR_CRUZ = '╬';

    static int jugadorEnTurno;
    static String[][] tablero = new String[3][3];
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        boolean repetirPartida;
        String decision;
        final int ULTIMA_JUGADA = 8;

        do {
            System.out.println("T R E S  E N  R A Y A");
            iniciarPartida();
            mostrarTablero();

            for (int i = 0; i < JUGADAS_MAX; i++) {
                // jugador 1 = 0, jugador 2 = 1
                jugadorEnTurno = i % 2;
                jugada();
                mostrarTablero();

                if (hayTresEnRaya()) {
                    boolean esJugador1 = jugadorEnTurno == 0;
                    dibujarJugadorGanador(esJugador1);
                    break;
                }

                if (i == ULTIMA_JUGADA) dibujarEmpate();
            }

            decision = entrada.nextLine();
            repetirPartida = decision.equals("s");

        }while(repetirPartida);
        System.out.println("Hasta una próxima!!");
        entrada.close();
    }

    static public void jugada(){
        int fila, columna;
        boolean esJugador1 = jugadorEnTurno == 0;
        final int ERROR_VALIDACION = -1;

        do {
            do {
                System.out.print("Jugador " + (esJugador1 ? 1 : 2) + " - fila: ");
                fila = validacion();
            } while (fila == ERROR_VALIDACION);

            do {
                System.out.print("jugador " + (esJugador1 ? 1 : 2) + " - columna: ");
                columna = validacion();
            } while (columna == ERROR_VALIDACION);

        } while (estaPosicionMarcada(fila, columna));

        String marcaJugador = esJugador1 ? MARCA_JUGADOR1 : MARCA_JUGADOR2;

        tablero[fila][columna] = marcaJugador;
    }

    static public void iniciarPartida(){
        Arrays.fill(tablero[0], POSICION_VACIA);
        Arrays.fill(tablero[1], POSICION_VACIA);
        Arrays.fill(tablero[2], POSICION_VACIA);
    }

    static public void mostrarTablero(){
        /**
         *       012345678910
         *   0   ___ ___ ___
         *   1   ___║___║___
         *   2   ___║___║___
         *   3   ═══╬═══╬═══
         *   4   ___║___║___
         *   5   ___║___║___
         *   6   ___║___║___
         *   7   ═══╬═══╬═══
         *   8   ___║___║___
         *   9   ___║___║___
         *  10   ___ ___ ___
         *
         */
        int dimensionTablero = tablero.length * 3 + 2;
        final int PRIMERA_FILA = 0;
        final int ULTIMA_FILA = 10;

        for (int fila = 0; fila < dimensionTablero; fila++){
            System.out.print("\t");
            for (int columna = 0; columna < dimensionTablero; columna++) {
                if (fila == PRIMERA_FILA || fila == ULTIMA_FILA) break;

                if (fila == 1 || fila == 5 || fila == 9){
                    if (columna == 0 || columna == 4 || columna == 8) System.out.print(" ");
                    if (columna == 1 || columna == 5 || columna == 9) System.out.print(tablero[(fila-1)/4][(columna-1)/4]);
                    if (columna == 3 || columna == 7 ) System.out.print(" " + LINEA_VER);
                }

                if (fila == 2 || fila == 4 || fila == 6 || fila == 8) {
                    if (columna == 3 || columna == 7 ) System.out.print("   " + LINEA_VER);
                }

                if (fila == 3 || fila == 7) {
                    if (columna == 3 || columna == 7) System.out.print(SEPARADOR_CRUZ);
                    else System.out.print(LINEA_HOR);
                }
            }
            System.out.println();
        }
    }

    static public int validacion(){
        String valor = entrada.nextLine();
        final int ERROR_VALIDACION = -1;

        if (valor.isEmpty()){
            System.out.println("ERROR: no se permite valor vacío");
            return ERROR_VALIDACION;
        }

        if (!Character.isDigit(valor.charAt(0))) {
            System.out.println("ERROR: ingresar número entero entre 0 y 2");
            return ERROR_VALIDACION;
        }

        int num = Integer.parseInt(valor);

        if (num < 0 || num > 2){
            System.out.println("ERROR: el número debe estar entre 0 y 2");
            return ERROR_VALIDACION;
        }

        return num;
    }

    static public boolean estaPosicionMarcada(int fila, int columna){
        if (!tablero[fila][columna].equals(POSICION_VACIA)) {
            System.out.println("Elige otra posición, la fila " + fila + ", columna " + columna + ", está marcada");
            return true;
        }

        return false;
    }

    static public boolean hayTresEnRaya(){
        boolean esJugador1 = jugadorEnTurno == 0;
        String marcaJugador = esJugador1 ? MARCA_JUGADOR1 : MARCA_JUGADOR2;
        int contador = 0;
        final int CANTIDAD_GANADORA = 3;

        // validación filas
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (!tablero[i][j].equals(marcaJugador)) break;
                contador++;
            }

            if (contador == CANTIDAD_GANADORA) return true;
            contador = 0;
        }

        // validación columnas
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (!tablero[j][i].equals(marcaJugador)) break;
                contador++;
            }

            if (contador == CANTIDAD_GANADORA) return true;
            contador = 0;
        }

        // validación diagonales
        for (int i = 2; i >= 0; i--) {
            if (!tablero[i][2-i].equals(marcaJugador)) break;
            contador++;
        }
        if (contador == CANTIDAD_GANADORA) return true;

        contador = 0;
        for (int i = 0; i < tablero.length; i++) {
            if (!tablero[i][i].equals(marcaJugador)) break;
            contador++;
        }

        return contador == CANTIDAD_GANADORA;
    }

    static public void dibujarJugadorGanador(boolean esJugador1){
        System.out.println();
        System.out.println("              ╔═══════════════════════════════╗");
        System.out.println("              ║  JUGADOR " + (esJugador1 ? "1" : "2") + " GANÓ LA PARTIDA!   ║");
        System.out.println("              ╚═══════════════════════════════╝");
        System.out.println();
        System.out.println("                             \\O/              ");
        System.out.println("                              |               ");
        System.out.println("                             / \\              ");
        System.out.println("                          ¡VICTORIA!          ");
        System.out.println();
        System.out.println(">> PRESIONA \"s\" para volver a jugar, otro carácter para salir <<");
        System.out.println();
    }

    static public void dibujarEmpate(){
        System.out.println();
        System.out.println("               ╔═══════════════════════════════╗");
        System.out.println("               ║         ¡ES UN EMPATE!        ║");
        System.out.println("               ╚═══════════════════════════════╝");
        System.out.println();
        System.out.println("                          \\O/     \\O/              ");
        System.out.println("                           |       |               ");
        System.out.println("                          / \\     / \\              ");
        System.out.println("                            ¡TABLAS!          ");
        System.out.println();
        System.out.println(">> PRESIONA \"s\" para volver a jugar, otro carácter para salir <<");
        System.out.println();
    }
}
