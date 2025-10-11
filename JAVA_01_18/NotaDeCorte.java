import java.util.Scanner;

/**
 * Programa que pide el número de calificaciones a introducir, y una nota de corte. A
 * continuación, se introducirán las calificaciones, para finalmente indicar cuántas calificaciones
 * han igualado o superado la nota de corte
 */
public class NotaDeCorte {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota, notasAprobadas=0;

        System.out.print("Indique el número de calificaciones a evaluar: ");
        int numeroCalificaciones = entrada.nextInt();

        System.out.print("Indique la nota de corte: ");
        int notaCorte = entrada.nextInt();

        for (int i = 0; i < numeroCalificaciones; i++) {
            System.out.print("Indique la nota " + (i+1) + ": ");
            nota = entrada.nextInt();

            if (nota >= notaCorte) notasAprobadas++;
        }

        System.out.println("Las notas aprobadas fueron: " + notasAprobadas);
    }
}
