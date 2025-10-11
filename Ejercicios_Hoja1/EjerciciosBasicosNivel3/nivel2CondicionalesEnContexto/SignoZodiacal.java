package EjerciciosBasicosNivel3.nivel2CondicionalesEnContexto;

import java.util.Scanner;

/**
 * Pide el año de nacimiento de una persona y muestra si su signo zodiacal
 * es de agua, aire, fuego o tierra (elige tú una lógica sencilla)
 */
public class SignoZodiacal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Indique el mes de nacimiento");
        int mes = entrada.nextInt();
        System.out.println("Indique el día de nacimiento");
        int dia = entrada.nextInt();

        boolean aries = (mes == 3 && dia >= 21) || (mes == 4 && dia <= 19);
        boolean tauro = (mes == 4 && dia >= 20) || (mes == 5 && dia <= 20);
        boolean geminis = (mes == 5 && dia >= 21) || (mes == 6 && dia <= 20);
        boolean cancer = (mes == 6 && dia >= 21) || (mes == 7 && dia <= 22);
        boolean leo = (mes == 7 && dia >= 23) || (mes == 8 && dia <= 22);
        boolean virgo = (mes == 8 && dia >= 23) || (mes == 9 && dia <= 22);
        boolean libra = (mes == 9 && dia >= 23) || (mes == 10 && dia <= 22);
        boolean escorpio = (mes == 10 && dia >= 23) || (mes == 11 && dia <= 21);
        boolean sagitorio = (mes == 11 && dia >= 22) || (mes == 12 && dia <= 21);
        boolean capricornio = (mes == 12 && dia >= 22) || (mes == 1 && dia <= 20);
        boolean acuario = (mes == 1 && dia >= 21) || (mes == 2 && dia <= 19);
        boolean piscis = (mes == 2 && dia >= 20) || (mes == 3 && dia <= 20);

        if (aries || leo || sagitorio){
            System.out.println("Eres Fuego");
        } else if (tauro || virgo || capricornio) {
            System.out.println("Eres Tierra");
        } else if (geminis || libra || acuario) {
            System.out.println("Eres Aire");
        } else if (cancer || escorpio || piscis){
            System.out.println("Eres Agua");
        } else if ((mes > 12 || mes < 0) || (dia > 31 || dia < 0) ){
            System.out.println("ERROR: mes o dia fuera de rango");
        }

    }
}
