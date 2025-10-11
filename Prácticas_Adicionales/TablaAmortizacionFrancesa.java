package tarea1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Alejandro Calderón Prin
 *
 * C = V / [(1 - (1 + i)^-N) / i]
 *
 * C = Cuota constante
 * V = Préstamo
 * i = Tasa de interés
 * N = Número de cuotas
 */
public class TablaAmortizacionFrancesa {

    static final String COLOR_POR_DEFECTO = "\u001B[0m";
    static final String COLOR_ROJO = "\u001B[31m";
    static final String COLOR_VERDE = "\u001B[32m";
    static final String COLOR_AZUL = "\u001B[34m";

    static final char ESQUINA_SUP_IZQ = '\u2554';
    static final char ESQUINA_SUP_DER = '\u2557';
    static final char ESQUINA_INF_IZQ = '\u255A';
    static final char ESQUINA_INF_DER = '\u255D';
    static final char LINEA_VERTICAL = '\u2551';
    static final char LINEA_HORIZONTAL = '\u2550';

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String prestamoString, tasaInteresString, numeroCuotasString;
        BigDecimal prestamo, tasaInteres, numeroCuotas;
        boolean esValorCorrecto = false;

        System.out.println();
        do {
            System.out.print("Indique el valor del Prétamos: ");
            prestamoString = entrada.nextLine();
            esValorCorrecto = esValorCorrecto(prestamoString);

            if (!esValorCorrecto){
                System.out.println(COLOR_ROJO + "ERROR: el préstamo debe ser un número entero positivo\n" + COLOR_POR_DEFECTO);
            } else {
                System.out.println(COLOR_VERDE + "valor ingresado correctamente\n" + COLOR_POR_DEFECTO);
            }

        }while (!esValorCorrecto);
        prestamo = new BigDecimal(prestamoString);

        do {
            System.out.print("Indique la tasa de interés: ");
            tasaInteresString = entrada.nextLine();
            esValorCorrecto = esValorCorrecto(tasaInteresString);

            if (!esValorCorrecto){
                System.out.println(COLOR_ROJO + "ERROR: la tasa de interés debe ser un número entero positivo\n" + COLOR_POR_DEFECTO);
            } else {
                System.out.println(COLOR_VERDE + "valor ingresado correctamente\n" + COLOR_POR_DEFECTO);
            }

        }while (!esValorCorrecto);
        tasaInteres = new BigDecimal(tasaInteresString);
        tasaInteres = tasaInteres.divide(BigDecimal.valueOf(100));

        do {
            System.out.print("Indique número de cuotas: ");
            numeroCuotasString = entrada.nextLine();
            esValorCorrecto = esValorCorrecto(numeroCuotasString);

            if (!esValorCorrecto){
                System.out.println(COLOR_ROJO + "ERROR: el número de cuotas debe ser un número entero positivo\n" + COLOR_POR_DEFECTO);
            } else {
                System.out.println(COLOR_VERDE + "valor ingresado correctamente\n" + COLOR_POR_DEFECTO);
            }

        }while (!esValorCorrecto);
        numeroCuotas = new BigDecimal(numeroCuotasString);

        tituloConBorde();
        tablaAmortizacionFrancesa(numeroCuotas, prestamo, tasaInteres);
    }

    static boolean esValorCorrecto(String valor){
        if (valor == null) {
            return false;
        }

        if (valor.isEmpty()){
            return false;
        }

        for (char caracter : valor.toCharArray()){
            if (!Character.isDigit(caracter)){
                return false;
            }
        }

        return Integer.parseInt(valor) > 0;
    }

    static void tituloConBorde(){
        String titulo = COLOR_AZUL + "Tabla de Amortización Francesa" + COLOR_POR_DEFECTO;
        int longitudTitulo = titulo.length();

        System.out.print(" ".repeat(18) + ESQUINA_SUP_IZQ);
        for (int i = 0; i < longitudTitulo + 3; i++) {
            System.out.print(LINEA_HORIZONTAL);
        }
        System.out.println(ESQUINA_SUP_DER);

        System.out.println(" ".repeat(18) + LINEA_VERTICAL + "      " + titulo + "      " + LINEA_VERTICAL);

        System.out.print(" ".repeat(18) + ESQUINA_INF_IZQ);
        for (int i = 0; i < longitudTitulo + 3; i++) {
            System.out.print(LINEA_HORIZONTAL);
        }
        System.out.println(ESQUINA_INF_DER);

    }

    static void tablaAmortizacionFrancesa(BigDecimal numeroCuotas, BigDecimal prestamo, BigDecimal tasaInteres){
        BigDecimal cuotaFija = BigDecimal.valueOf(0), acumTasaInteres = BigDecimal.valueOf(0);

        System.out.println("  Meses  -  Saldo Inicial  -  Interes  -  Capital  -  Cuota Fija  -  Saldo Final");
        for (int i = 1; i <= numeroCuotas.intValue(); i++) {

            System.out.printf("    %-10d %-15.0f %-12.0f", i, prestamo, prestamo.multiply(tasaInteres) );
            acumTasaInteres = acumTasaInteres.add(prestamo.multiply(tasaInteres));
            // C = V / [(1 - (1 + i)^-N) / i]
            if ( i == 1 ){
                cuotaFija = prestamo.divide(
                        BigDecimal.ONE.subtract(
                                BigDecimal.ONE.divide(
                                        BigDecimal.ONE.add(tasaInteres).pow(numeroCuotas.intValue()),
                                        10,
                                        RoundingMode.HALF_UP
                                )
                        ).divide(tasaInteres, 10, RoundingMode.HALF_UP),
                        2,
                        RoundingMode.HALF_UP
                ).setScale(0, RoundingMode.HALF_UP);
            }
            prestamo = prestamo.subtract(cuotaFija.subtract(prestamo.multiply(tasaInteres)));
            System.out.printf("%-12.0f %-14.0f %.0f\n", cuotaFija.subtract(prestamo.multiply(tasaInteres)), cuotaFija, prestamo.intValue() <= 0 ? BigDecimal.valueOf(0) : prestamo);
        }

        System.out.println("\nInteres a pagar: " + COLOR_VERDE + acumTasaInteres.setScale(0, RoundingMode.HALF_UP) + COLOR_POR_DEFECTO);
    }
}
