package EjerciciosBasicosNivel2.nivel2Condicionales;

import java.util.Scanner;

/**
 * Pide una nota del 0 al 10 e indica si el alumno está aprobado o
 * suspendido
 */
public class AprobadoOSuspendido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;

        System.out.println("Indique la nota a evaluar: ");
        nota = entrada.nextInt();

        if (nota >= 0 && nota < 5){
            System.out.println("Estas suspendido");
        } else if (nota >= 5 && nota <= 10) {
            System.out.println("Estas aprobado");
        } else {
            System.out.println("ERROR: nota fuera de rango");
        }

    }
}
