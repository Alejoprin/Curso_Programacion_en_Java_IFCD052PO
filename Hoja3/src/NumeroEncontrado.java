import java.util.Scanner;

/**
 * Realiza un programa que lea desde teclado 9 números. A continuación nos pedirá que
 * busquemos un número entre los introducidos, y nos dirá si ha sido encontrado o no. En el
 * caso en el que haya sido encontrado, nos indicará cuántas veces se ha introducido. El
 * programa nos preguntará si queremos seguir buscando más números o no: “¿Desea
 * seguir buscando?(s/n)”.
 */
public class NumeroEncontrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[9];
        int numeroABuscar;
        int repeticiones = 0;
        String seguirBuscando;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Indique el número " + (i+1) + ": ");
            numeros[i] = Integer.parseInt(entrada.nextLine());
        }

        do {
            System.out.print("\nIndique el número a buscar: ");
            numeroABuscar = Integer.parseInt(entrada.nextLine());

            for (int numero : numeros){
                if (numeroABuscar == numero){
                    repeticiones++;
                }
            }

            if (repeticiones > 0) System.out.println("El número " + numeroABuscar +
                    " ha sido encontrado, y se repite " + (repeticiones == 1 ? repeticiones + " vez" : repeticiones + " veces"));
            else System.out.println("No se encontró el número");

            repeticiones = 0;
            do {
                System.out.print("¿Desea seguir buscando?(s/n) ");
                seguirBuscando = entrada.nextLine();
            }while(!seguirBuscando.equalsIgnoreCase("s") && !seguirBuscando.equalsIgnoreCase("n"));
        } while (seguirBuscando.equalsIgnoreCase("s"));
        entrada.close();
    }
}
