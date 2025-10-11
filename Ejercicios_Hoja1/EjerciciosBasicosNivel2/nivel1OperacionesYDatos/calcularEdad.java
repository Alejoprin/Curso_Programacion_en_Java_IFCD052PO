package EjerciciosBasicosNivel2.nivel1OperacionesYDatos;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Pide al usuario su año de nacimiento y muestra su edad actual
 */
public class calcularEdad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        LocalDate fecha = LocalDate.now();
        int anioNacimiento;

        System.out.print("Indique año de nacimiento con formato xxxx: ");
        anioNacimiento = entrada.nextInt();

        System.out.println("Tienes " + (fecha.getYear() - anioNacimiento) + " años de edad");
    }
}
