package EjerciciosBasicosNivel3.nivel2CondicionalesEnContexto;

import java.util.Scanner;

/**
 * Crea un programa que pida un número del 1 al 7 y muestre el día de la
 * semana correspondiente
 */
public class DiaDeLaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia;

        System.out.print("Indique número del 1 al 7 para seleccionar día: ");
        dia = entrada.nextInt();

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("ERROR: número fuera de rango");
                break;
        }
    }
}
