import java.time.LocalDate;
import java.util.Scanner;

/**
 * Programa que lee nombre y año de nacimiento de una serie de alumnos hasta introducir
 * como nombre de alumno “fin”. En ese momento mostrará la edad media de los alumnos y el
 * nombre del alumno menor. NOTA: Al introducir como nombre “fin”, no nos ha de pedir el año
 * de nacimiento
 */
public class AlumnoMenorYEdadMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre="", alumnoMenor="";
        int anioNacimiento=0, sumaEdades=0, anioMenor=Integer.MIN_VALUE, conteoAlumnos=0;
        float media;
        final String PALABRA_PARA_SALIR = "fin";
        boolean continuar = true;

        do {
            System.out.print("Indique el nombre del alumno: ");
            nombre = entrada.nextLine();

            if (!nombre.equals(PALABRA_PARA_SALIR)){
                System.out.print("Indique año de nacimiento: ");
                anioNacimiento = Integer.parseInt(entrada.nextLine());
                conteoAlumnos++;

                if (anioNacimiento > anioMenor) {
                    anioMenor = anioNacimiento;
                    alumnoMenor = nombre;
                }

                sumaEdades = sumaEdades + (LocalDate.now().getYear() - anioNacimiento);
            } else {
                continuar = false;
            }

            System.out.println();
        }while (continuar);

        if (!alumnoMenor.isEmpty()){
            media = (float)sumaEdades / conteoAlumnos;
            System.out.println("La media de edad es: " + String.format("%.2f", media));
            System.out.println("Alumno menor es: " + alumnoMenor);
        } else {
            System.out.println("No ingreso ningún dato");
        }
    }
}
