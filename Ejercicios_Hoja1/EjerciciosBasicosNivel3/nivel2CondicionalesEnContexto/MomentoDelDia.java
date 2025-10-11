package EjerciciosBasicosNivel3.nivel2CondicionalesEnContexto;

import java.util.Scanner;

/**
 * Pide la hora actual (0–23) e indica si es de mañana, tarde o noche
 */
public class MomentoDelDia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horaActual;

        System.out.print("Indique la hora actual en formato 0 a 23: ");
        horaActual = entrada.nextInt();

        if (horaActual >= 4 && horaActual <= 12){
            System.out.println("Mañana");
        } else if (horaActual > 12 && horaActual <= 20){
            System.out.println("Tarde");
        } else if ((horaActual > 20 && horaActual < 24) || (horaActual >= 0 && horaActual < 4)){
            System.out.println("Noche");
        } else {
            System.out.println("ERROR: hora fuera de rango");
        }
    }
}
