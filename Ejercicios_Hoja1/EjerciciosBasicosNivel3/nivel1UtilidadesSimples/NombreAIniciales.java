package EjerciciosBasicosNivel3.nivel1UtilidadesSimples;

import java.util.Scanner;

/**
 * Pide al usuario su nombre completo y muestra solo las iniciales
 */
public class NombreAIniciales {
    public static void main(String[] args) {
        Scanner entradaParaSegundoScanner = new Scanner(System.in);
        System.out.print("Indique el nombre a evaluar: ");
        String nombre = entradaParaSegundoScanner.nextLine();

        Scanner entrada = new Scanner(nombre);
        StringBuilder iniciales = new StringBuilder();

        while (entrada.hasNext()){
            String fragmentoNombre = entrada.next();
            iniciales.append(fragmentoNombre.charAt(0));
        }

        System.out.println("El nombre " + nombre + ", tiene las siguientes iniciales: " + iniciales);

    }
}
