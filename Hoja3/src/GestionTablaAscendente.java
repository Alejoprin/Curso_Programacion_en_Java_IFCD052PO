import java.util.Arrays;
import java.util.Scanner;

/**
 * Realiza un programa que gestione una tabla ordenada ascendentemente y con un máximo
 * de 18 elementos. No se permitirán repetidos:
 * Menú:
 * 1.- Introducir número entero.
 * 2.- Listar números.
 * 3.- Eliminar número.
 * 4.- Eliminar todos los números.
 * 5.- Salir
 */
public class GestionTablaAscendente {

        static final char ESQUINA_SUP_IZQ = '╔';
        static final char ESQUINA_SUP_DER = '╗';
        static final char ESQUINA_INF_IZQ = '╚';
        static final char ESQUINA_INF_DER = '╝';
        static final char LINEA_VER = '║';
        static final char LINEA_HOR = '═';
        static final char SEPARADOR_HACIA_ABAJO = '╦';
        static final char SEPARADOR_HACIA_ARRIBA = '╩';

        static int[] numeros = new int[18];
        static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String optMenu;
        boolean continuar = true;

        do {
            menu();
            ordenarListaAscendente();
            optMenu = entrada.nextLine();

            switch (optMenu){
                case "1":
                    introducirNumero();
                    break;
                case "2":
                    listarNumeros();
                    break;
                case "3":
                    eliminarNumero();
                    break;
                case "4":
                    eliminarTodos();
                    break;
                case "5":
                    System.out.println("Salio de la App");
                    continuar = false;
                    break;

                default:
                    System.out.println("ERROR: indique un número entre el 1 y 5");
                    break;
            }
        } while (continuar);
        entrada.close();
    }

    static void introducirNumero(){
        System.out.print("Indique el número que desea introducir en la lista: ");
        String numeroCandidato = entrada.nextLine();
        int numero;

        if (esNumeroValido(numeroCandidato)){
            numero = Integer.parseInt(numeroCandidato);
        } else {
            System.out.println("ERROR: número invalido, debe ingresar un número entero positivo >= a 1 y < a 100");
            return;
        }

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] == 0) {
                if (esRepetido(numero)){
                    System.out.println("ERROR: número repetido");
                } else {
                    numeros[i] = numero;
                    System.out.println("Número introducido en la lista correctamente");
                }
                return;
            }
        }

        System.out.println("La tabla esta llena, elimine algún número para poder añadir");
    }

    static void listarNumeros(){
        int anchoLista = numeros.length;

        // linea superior
        System.out.print(ESQUINA_SUP_IZQ);
        for (int i = 0; i < anchoLista; i++) {
            if (i == anchoLista - 1){
                System.out.printf("%c%c%c%c\n", LINEA_HOR, LINEA_HOR, LINEA_HOR, ESQUINA_SUP_DER);
            } else {
                System.out.printf("%c%c%c%c", LINEA_HOR, LINEA_HOR, LINEA_HOR, SEPARADOR_HACIA_ABAJO);
            }
        }

        // pintar lista
        for (int i = 0; i < anchoLista; i++) {
            System.out.printf("%-2c%-2d", LINEA_VER, numeros[i]);
        }
        System.out.println(LINEA_VER);

        // linea inferior
        System.out.print(ESQUINA_INF_IZQ);
        for (int i = 0; i < anchoLista; i++) {
            if (i == anchoLista - 1){
                System.out.printf("%c%c%c%c\n", LINEA_HOR, LINEA_HOR, LINEA_HOR, ESQUINA_INF_DER);
            } else {
                System.out.printf("%c%c%c%c", LINEA_HOR, LINEA_HOR, LINEA_HOR, SEPARADOR_HACIA_ARRIBA);
            }
        }

    }

    static void eliminarNumero(){
        String numeroCandidato;

        listarNumeros();
        System.out.print("Cuál número desea eliminar: ");
        numeroCandidato = entrada.nextLine();

        if (esNumeroValido(numeroCandidato)){
            int numero = Integer.parseInt(numeroCandidato);

            for (int i = 0; i < numeros.length; i++) {
                if (numero == numeros[i]){
                    numeros[i] = 0;
                    System.out.println("el número " + numero + ", fue eliminado correctamente");
                    return;
                }
            }

            System.out.println("el número " + numero + ", no se encontro en la lista");
        } else {
            System.out.println("ERROR: el valor introducido no es válido");
        }

    }

    static void eliminarTodos(){

        Arrays.fill(numeros, 0);
        System.out.println("Todos los elementos fueron eliminados");
    }

    static boolean esRepetido(int numero){

        for (int numeroEnLista : numeros){
            if (numero == numeroEnLista){
                return true;
            }
        }

        return false;
    }

    static boolean esNumeroValido(String numeroCandidato){
        if (numeroCandidato.isEmpty()) return false;

        if (numeroCandidato.length() > 2) return false;

        for (char numero : numeroCandidato.toCharArray()){
            if (!Character.isDigit(numero)){
                return false;
            }
        }

        return Integer.parseInt(numeroCandidato) >= 1;
    }

    static void ordenarListaAscendente(){
        int aux;

        for (int i = 0; numeros[i] != 0 && i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length && numeros[j] != 0; j++) {
                if(numeros[i] > numeros[j]){
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
    }

    static void menu(){
        System.out.print("""
                
                1 - Introducir número entero
                2 - Listar números
                3 - Eliminar número
                4 - Eliminar todos los números
                5 - Salir
                
                """);
    }
}
