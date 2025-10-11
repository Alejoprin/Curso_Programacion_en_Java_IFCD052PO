package tarea1;

import java.util.Scanner;

/**
 * Convierte números de 0-999 a palabras usando arrays
 */
public class NumeroAPalabraConArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Indique el número a evaluar: ");
        int numero = entrada.nextInt();

        if (numero >= 0 && numero <= 999) {
            String resultado = convertirNumeroAPalabra(numero);
            System.out.println(resultado);
        } else {
            System.out.println("ERROR: el número debe ser de 0 a 999");
        }

        entrada.close();
    }

    public static String convertirNumeroAPalabra(int numero) {
        // Caso especial: cero
        if (numero == 0) {
            return "cero";
        }

        StringBuilder palabra = new StringBuilder();

        // Arrays para las palabras
        String[] unidades = {"", "uno", "dos", "tres", "cuatro", "cinco",
                "seis", "siete", "ocho", "nueve"};

        String[] especiales = {"diez", "once", "doce", "trece", "catorce",
                "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};

        String[] decenas = {"", "", "veinte", "treinta", "cuarenta", "cincuenta",
                "sesenta", "setenta", "ochenta", "noventa"};

        String[] centenas = {"", "ciento", "doscientos", "trescientos", "cuatrocientos",
                "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};

        // Procesar centenas
        if (numero >= 100) {
            int centenasDigito = numero / 100;
            if (numero == 100) {
                palabra.append("cien");
                return palabra.toString();
            } else {
                palabra.append(centenas[centenasDigito]);
                if (numero % 100 != 0) {
                    palabra.append(" ");
                }
            }
            numero %= 100;
        }

        // Procesar decenas
        if (numero >= 10) {
            int decenasDigito = numero / 10;
            int unidadesDigito = numero % 10;

            if (numero < 20) {
                // Casos especiales 10-19
                palabra.append(especiales[numero - 10]);
                return palabra.toString();
            } else if (numero < 30) {
                // Casos especiales 20-29
                if (unidadesDigito == 0) {
                    palabra.append("veinte");
                } else {
                    palabra.append("veinti").append(unidades[unidadesDigito]);
                }
                return palabra.toString();
            } else {
                // Decenas normales 30-90
                palabra.append(decenas[decenasDigito]);
                if (unidadesDigito != 0) {
                    palabra.append(" y ").append(unidades[unidadesDigito]);
                }
                return palabra.toString();
            }
        }

        // Procesar unidades
        if (numero > 0) {
            palabra.append(unidades[numero]);
        }

        return palabra.toString();
    }
}