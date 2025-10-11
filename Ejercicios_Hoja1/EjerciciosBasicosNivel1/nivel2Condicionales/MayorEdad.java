package EjerciciosBasicosNivel1.nivel2Condicionales;

import java.util.Scanner;

/**
 * Pide la edad e indica si la persona es mayor de edad o no
 */

public class MayorEdad {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int edad;

        System.out.print("Introduzca la edad: ");
        edad = entrada.nextInt();

        if (edad > 17) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
