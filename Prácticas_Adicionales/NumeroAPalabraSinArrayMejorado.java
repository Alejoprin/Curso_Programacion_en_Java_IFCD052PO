package tarea1;

import java.util.Scanner;

/**
 * Pedir un número por teclado entre 0 y 9.999. Se mostrará el número con letra
 * (*) Se pide realizar un evolutivo del ejercicio resuelto en clase, ampliando el número introducido hasta 9.999.
 * Por ejemplo:
 * Introduce un número:
 * 3248
 * "Ha introducido el número tres mil doscientos cuarenta y ocho"
 */
public class NumeroAPalabra3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Indique un número a evaluar del 0 al 9.999: ");
            numero = entrada.nextInt();

        } while (numero < 0 || numero > 9999);
        entrada.close();

        // miles
        int miles = numero / 1000;
        numero = numero - miles * 1000;

        // centenas
        int centenas = numero / 100;
        numero = numero - centenas * 100;

        // decenas
        int decenas = numero / 10;

        // unidades
        numero = numero - decenas * 10;

        System.out.println("Ha introducido el número: " + imprimirMiles(miles, centenas, decenas, numero));
    }

    static String imprimirMiles(int miles, int centenas, int decenas, int unidades) {
        String conversion = "";

        if (miles == 0){
            return imprimirCentenas(centenas, decenas, unidades);
        } else if (miles == 1){
            if (centenas == 0 && decenas == 0 && unidades == 0) conversion = "mil";
            else conversion = "mil " + imprimirCentenas(centenas, decenas, unidades);
        } else if (miles == 2){
            if (centenas == 0 && decenas == 0 && unidades == 0) conversion = "dos mil";
            else conversion = "dos mil " + imprimirCentenas(centenas, decenas, unidades);
        } else if (miles == 3){
            if (centenas == 0 && decenas == 0 && unidades == 0) conversion = "tres mil";
            else conversion = "tres mil " + imprimirCentenas(centenas, decenas, unidades);
        } else if (miles == 4){
            if (centenas == 0 && decenas == 0 && unidades == 0) conversion = "cuatro mil";
            else conversion = "cuatro mil " + imprimirCentenas(centenas, decenas, unidades);
        } else if (miles == 5){
            if (centenas == 0 && decenas == 0 && unidades == 0) conversion = "cinco mil";
            else conversion = "cinco mil " + imprimirCentenas(centenas, decenas, unidades);
        } else if (miles == 6){
            if (centenas == 0 && decenas == 0 && unidades == 0) conversion = "seis mil";
            else conversion = "seis mil " + imprimirCentenas(centenas, decenas, unidades);
        } else if (miles == 7){
            if (centenas == 0 && decenas == 0 && unidades == 0) conversion = "siete mil";
            else conversion = "siete mil " + imprimirCentenas(centenas, decenas, unidades);
        } else if (miles == 8){
            if (centenas == 0 && decenas == 0 && unidades == 0) conversion = "ocho mil";
            else conversion = "ocho mil " + imprimirCentenas(centenas, decenas, unidades);
        } else if (miles == 9){
            if (centenas == 0 && decenas == 0 && unidades == 0) conversion = "nueve mil";
            else conversion = "nueve mil " + imprimirCentenas(centenas, decenas, unidades);
        }

        return conversion;
    }

    static String imprimirCentenas(int centenas, int decenas, int unidades){
        String conversion = "";

        if (centenas == 0) {
            return imprimirDecenas(decenas, unidades);
        } else if (centenas == 1) {
            if (decenas == 0 && unidades == 0) conversion = "cien";
            else conversion = "ciento " + imprimirDecenas(decenas, unidades);
        } else if (centenas == 2) {
            if (decenas == 0 && unidades == 0) conversion = "doscientos";
            else conversion = "doscientos " + imprimirDecenas(decenas, unidades);
        } else if (centenas == 3) {
            if (decenas == 0 && unidades == 0) conversion = "trescientos";
            else conversion = "trescientos " + imprimirDecenas(decenas, unidades);
        } else if (centenas == 4) {
            if (decenas == 0 && unidades == 0) conversion = "cuatrocientos";
            else conversion = "cuatrocientos " + imprimirDecenas(decenas, unidades);
        } else if (centenas == 5) {
            if (decenas == 0 && unidades == 0) conversion = "quinientos";
            else conversion = "quinientos " + imprimirDecenas(decenas, unidades);
        } else if (centenas == 6) {
            if (decenas == 0 && unidades == 0) conversion = "seiscientos";
            else conversion = "seiscientos " + imprimirDecenas(decenas, unidades);
        } else if (centenas == 7) {
            if (decenas == 0 && unidades == 0) conversion = "setecientos";
            else conversion = "setecientos " + imprimirDecenas(decenas, unidades);
        } else if (centenas == 8) {
            if (decenas == 0 && unidades == 0) conversion = "ochocientos";
            else conversion = "ochocientos " + imprimirDecenas(decenas, unidades);
        } else if (centenas == 9) {
            if (decenas == 0 && unidades == 0) conversion = "novecientos";
            else conversion = "novecientos " + imprimirDecenas(decenas, unidades);
        }

        return  conversion;
    }

    static String imprimirDecenas(int decenas, int unidades){
        String conversion = "";

        if (decenas == 0) {
            return imprimirUnidades(unidades);
        } else if (decenas == 1) {
            if (unidades == 0) conversion = "diez";
            else if (unidades == 1) conversion = "once";
            else if (unidades == 2) conversion = "doce";
            else if (unidades == 3) conversion = "trece";
            else if (unidades == 4) conversion = "catorce";
            else if (unidades == 5) conversion = "quince";
            else conversion = "dieci" + imprimirUnidades(unidades);

        } else if (decenas == 2) {
            if (unidades == 0) conversion = "veinte";
            else conversion = "veinti" + imprimirUnidades(unidades);
        } else if (decenas == 3) {
            if (unidades == 0) conversion = "treinta";
            else conversion = "treinta y " + imprimirUnidades(unidades);
        } else if (decenas == 4) {
            if (unidades == 0) conversion = "cuarenta";
            else conversion = "cuarenta y " + imprimirUnidades(unidades);
        } else if (decenas == 5) {
            if (unidades == 0) conversion = "cincuenta";
            else conversion = "cincuenta y " + imprimirUnidades(unidades);
        } else if (decenas == 6) {
            if (unidades == 0) conversion = "sesenta";
            else conversion = "sesenta y " + imprimirUnidades(unidades);
        } else if (decenas == 7) {
            if (unidades == 0) conversion = "setenta";
            else conversion = "setenta y " + imprimirUnidades(unidades);
        } else if (decenas == 8) {
            if (unidades == 0) conversion = "ochenta";
            else conversion = "ochenta y " + imprimirUnidades(unidades);
        } else if (decenas == 9) {
            if (unidades == 0) conversion = "noventa";
            else conversion = "noventa y " + imprimirUnidades(unidades);
        }

        return conversion;
    }

    static String imprimirUnidades(int unidades){

        return switch (unidades) {
            case 0 -> "cero";
            case 1 -> "uno";
            case 2 -> "dos";
            case 3 -> "tres";
            case 4 -> "cuatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "siete";
            case 8 -> "ocho";
            case 9 -> "nueve";
            default -> "";
        };
    }
}
