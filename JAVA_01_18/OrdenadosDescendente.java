import java.util.Scanner;

/**
 * Programa que lee 3 números y los muestra ordenados de manera descendente
 */
public class OrdenadosDescendente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, aux;

        System.out.print("Indique el primer número: ");
        num1 = entrada.nextInt();
        System.out.print("Indique el segundo número: ");
        num2 = entrada.nextInt();
        System.out.print("Indique el tercer número: ");
        num3 = entrada.nextInt();
        entrada.close();

        if (num1 < num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        if (num1 < num3){
            aux = num1;
            num1 = num3;
            num3 = aux;
        }

        if (num2 < num3){
            aux = num2;
            num2 = num3;
            num3 = aux;
        }

        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
