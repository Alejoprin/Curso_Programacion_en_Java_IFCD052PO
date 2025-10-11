package EjerciciosBasicosNivel1.nivel1PrimerosPasos;

import java.util.Scanner;

/**
 * Pide al usuario su nombre y muestra un saludo personalizado:
 * Hola, [nombre]
 */
public class SaludoPersonalizado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre;

        System.out.print("Indique su nombre: ");
        nombre = entrada.nextLine();

        System.out.println("Hola, " + nombre);
    }
}
