package tarea1;

import java.util.Scanner;

/**
 * // introducir por teclado un numero de 0-999, y lo tiene que devolver escrito por palabras... 1 devuelve uno;
 */
public class NumeroAPalabra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        StringBuilder palabraDelNumero = new StringBuilder();

        System.out.print("Indique el número a evaluar: ");
        int numero = entrada.nextInt();
        entrada.close();

        if (numero >= 0 && numero <= 999){
            if ( numero == 0 ){
                palabraDelNumero.append("cero");
            } else{
                while (numero > 0){

                    if (numero > 99){
                        if (numero == 100) {
                            palabraDelNumero.append("cien");
                            break;
                        } else if (numero < 200){
                            palabraDelNumero.append("ciento ");
                        } else if (numero == 200) {
                            palabraDelNumero.append("doscientos");
                            break;
                        } else if (numero < 300) {
                            palabraDelNumero.append("doscientos ");
                        } else if (numero == 300) {
                            palabraDelNumero.append("trescientos");
                            break;
                        } else if (numero < 400) {
                            palabraDelNumero.append("trescientos ");
                        } else if (numero == 400){
                            palabraDelNumero.append("cuatrocientos");
                            break;
                        } else if (numero < 500) {
                            palabraDelNumero.append("cuatrocientos ");
                        } else if (numero == 500) {
                            palabraDelNumero.append("quinientos");
                            break;
                        } else if (numero < 600) {
                            palabraDelNumero.append("quinientos ");
                        } else if (numero == 600){
                            palabraDelNumero.append("seiscientos");
                            break;
                        } else if (numero < 700) {
                            palabraDelNumero.append("seiscientos ");
                        } else if (numero == 700){
                            palabraDelNumero.append("setecientos");
                            break;
                        } else if (numero < 800){
                            palabraDelNumero.append("setecientos ");
                        } else if (numero == 800){
                            palabraDelNumero.append("ochocientos");
                            break;
                        } else if (numero < 900) {
                            palabraDelNumero.append("ochocientos ");
                        } else if (numero == 900){
                            palabraDelNumero.append("novecientos");
                            break;
                        } else {
                            palabraDelNumero.append("novecientos ");
                        }

                        numero%=100;
                    } else if (numero > 9){

                        if (numero == 10){
                            palabraDelNumero.append("diez");
                            break;
                        } else if (numero < 20) {
                            if (numero < 16){
                                switch (numero){
                                    case 11:
                                        palabraDelNumero.append("once");
                                        break;
                                    case 12:
                                        palabraDelNumero.append("doce");
                                        break;
                                    case 13:
                                        palabraDelNumero.append("trece");
                                        break;
                                    case 14:
                                        palabraDelNumero.append("catorce");
                                        break;
                                    case 15:
                                        palabraDelNumero.append("quince");
                                        break;
                                }
                                numero=0;
                            }

                            if (numero > 15) palabraDelNumero.append("dieci");

                        } else if (numero == 20){
                            palabraDelNumero.append("veinte");
                            break;
                        } else if (numero < 30){
                            palabraDelNumero.append("veinti");
                        } else if (numero == 30) {
                            palabraDelNumero.append("treinta");
                            break;
                        } else if (numero < 40) {
                            palabraDelNumero.append("treinta y ");
                        } else if (numero == 40) {
                            palabraDelNumero.append("cuarenta");
                            break;
                        } else if (numero < 50){
                            palabraDelNumero.append("cuarenta y ");
                        } else if (numero == 50) {
                            palabraDelNumero.append("cincuenta");
                            break;
                        } else if (numero < 60) {
                            palabraDelNumero.append("cincuenta y ");
                        } else if (numero == 60){
                            palabraDelNumero.append("sesenta");
                            break;
                        } else if (numero < 70) {
                            palabraDelNumero.append("sesenta y ");
                        } else if (numero == 70){
                            palabraDelNumero.append("setenta");
                            break;
                        } else if (numero < 80) {
                            palabraDelNumero.append("setenta y ");
                        } else if (numero == 80) {
                            palabraDelNumero.append("ochenta");
                            break;
                        } else if (numero < 90) {
                            palabraDelNumero.append("ochenta y ");
                        } else if (numero == 90) {
                            palabraDelNumero.append("noventa");
                            break;
                        } else {
                            palabraDelNumero.append("noventa y ");
                        }

                        numero%=10;
                    } else {
                        switch (numero){
                            case 1:
                                palabraDelNumero.append("uno");
                                break;
                            case 2:
                                palabraDelNumero.append("dos");
                                break;
                            case 3:
                                palabraDelNumero.append("tres");
                                break;
                            case 4:
                                palabraDelNumero.append("cuatro");
                                break;
                            case 5:
                                palabraDelNumero.append("cinco");
                                break;
                            case 6:
                                palabraDelNumero.append("seis");
                                break;
                            case 7:
                                palabraDelNumero.append("siete");
                                break;
                            case 8:
                                palabraDelNumero.append("ocho");
                                break;
                            case 9:
                                palabraDelNumero.append("nueve");
                                break;
                        }
                        numero/=10;
                    }
                }
            }

        } else {
            System.out.println("ERROR: el número debe ser de 0 a 999");
        }

        System.out.println(palabraDelNumero);
    }
}
