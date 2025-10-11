package EjerciciosBasicosNivel2.nivel5Funciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Haz una función que reciba dos números y devuelva el máximo común
 * divisor (MCD)
 */
public class MaximoComunDivisor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;

        System.out.print("Indique el primer número: ");
        num1 = entrada.nextInt();

        System.out.print("Indique el segundo número: ");
        num2 = entrada.nextInt();

        ////////////////////
        // VERSION 1
        ////////////////////
        System.out.println("El máximo común divisor V.1 de " + num1 + " y " + num2 + " es " + mcd(num1, num2));
        ////////////////////
        // VERSION 2
        ////////////////////
        System.out.println("El máximo común divisor V.2 de " + num1 + " y " + num2 + " es " + euclides(num1, num2));
    }

    static int euclides(int num1, int num2){
        int aux;

        while (num2 > 0){
            aux = num2;
            num2 = num1 % num2;
            num1 = aux;
        }

        return num1;
    }

    static int mcd(int num1, int num2){
        int resultadoMcd;
        ArrayList<Integer> descomposicionNum1 = descomposicionNumero(num1);
        ArrayList<Integer> descomposicionNum2 = descomposicionNumero(num2);

        int longitudArrayPequenio = Math.min(descomposicionNum1.size(), descomposicionNum2.size());

        if (descomposicionNum1.size() <= longitudArrayPequenio) {
            resultadoMcd = calculoMcd(descomposicionNum1,descomposicionNum2);

        } else {
            resultadoMcd = calculoMcd(descomposicionNum2, descomposicionNum1);
        }

        return resultadoMcd;
    }

    static ArrayList<Integer> descomposicionNumero(int num) {
        int i = 2, base=0, potencia=0;
        ArrayList<Integer> descomposicionNum = new ArrayList<>();

        while (num != 1){
            if (num % i == 0){
                num /= i;
                base = i;
                potencia++;

            } else {
                if (base > 0 && potencia > 0){
                    descomposicionNum.add(base);
                    descomposicionNum.add(potencia);
                    base=0;
                    potencia=0;
                }
                i++;
            }
        }
        descomposicionNum.add(base);
        descomposicionNum.add(potencia);

        return descomposicionNum;
    }

    static int calculoMcd(ArrayList<Integer> descomposicionNum1, ArrayList<Integer> descomposicionNum2){
        int calculoMcd=1;

        for (int i = 0; i < descomposicionNum1.size(); i=i+2) {
            for (int j = 0; j < descomposicionNum2.size(); j=j+2) {

                if (descomposicionNum1.get(i).equals(descomposicionNum2.get(j))){
                    if (descomposicionNum1.get(i+1) < descomposicionNum2.get(j+1)){
                        calculoMcd = calculoMcd * (int)Math.pow(descomposicionNum1.get(i),descomposicionNum1.get(i+1));
                    } else {
                        calculoMcd = calculoMcd * (int)Math.pow(descomposicionNum2.get(j),descomposicionNum2.get(j+1));
                    }
                }
            }
        }
        return  calculoMcd;
    }
}
