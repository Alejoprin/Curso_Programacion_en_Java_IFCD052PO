package EjerciciosBasicosNivel2.nivel1OperacionesYDatos;

import java.util.Scanner;

/**
 * Pide al usuario el radio de un círculo y muestra su área
 */
public class CalculoAreaCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int radio;

        System.out.println("Indique el radio del circulo: ");
        radio = entrada.nextInt();

        System.out.println("El área del circulo es: " + Math.round((Math.PI * Math.pow(radio,2)) * 100) / 100d );
    }
}
