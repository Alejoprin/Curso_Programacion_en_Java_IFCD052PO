package EjerciciosBasicosNivel3.nivel3BuclesPracticos;

import java.util.Scanner;

/**
 * Haz un programa que muestre un menú de opciones (por ejemplo: 1 =
 * sumar, 2 = restar, 3 = salir) y que se repita hasta que el usuario elija salir
 */
public class MenuOpciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        do {
            System.out.println("""
                    Selecciona una Opción:
                    
                    1 - Sumar
                    2 - Restar
                    3 - Salir
                    """);
            String opcionSeleccionada = entrada.nextLine();

            switch (opcionSeleccionada){
                case "1":
                    System.out.println("Elegiste sumar");
                    break;
                case "2":
                    System.out.println("Elegiste restar");
                    break;
                case "3":
                    System.out.println("Elegiste salir");
                    continuar = false;
                    break;

                default:
                    System.out.println("ERROR: seleccione un número entre 1 a 3");
                    break;
            }
        }while (continuar);
    }
}
