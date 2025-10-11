package EjerciciosBasicosNivel3.nivel1UtilidadesSimples;

import java.util.Scanner;

/**
 * Crea un programa que pida el precio de un producto y muestre el precio
 * final con un IVA del 21%
 */
public class PrecioConIva {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float precio;
        final float IVA = 0.21f;

        System.out.print("Indique el precio sin IVA: ");
        precio = entrada.nextFloat();

        float precioConIva = precio * IVA + precio;

        System.out.println("el precio con IVA es: " + precioConIva + " €");
    }
}
