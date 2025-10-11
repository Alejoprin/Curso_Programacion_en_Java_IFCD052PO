package EjerciciosBasicosNivel1.nivel4ListasCadenas;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Crea una lista con 5 productos y muéstralos uno por uno en pantalla
 */
public class MostrarProductos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] productos = new String[5];
        String producto;

        for (int i = 0; i < productos.length; i++) {
            System.out.print("Indique el producto " + (i+1) + " :");
            producto = entrada.nextLine();
            productos[i] = producto;
        }

        System.out.println("Los productos son: " + Arrays.toString(productos));
    }
}
