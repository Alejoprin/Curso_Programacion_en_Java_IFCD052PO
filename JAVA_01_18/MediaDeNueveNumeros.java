import java.util.Scanner;

/**
 * Programa que lee 9 números, y en el caso en el que el primero introducido sea igual al último,
 * nos muestra la media. En caso contrario, no se mostrará nada
 */
public class MediaDeNueveNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, primerNumero=0, ultimoNumero=0;
        float media=0F;

        for (int i = 0; i < 9; i++) {
            System.out.print("Indique el número " + (i+1) + ": ");

            if (i == 0){
                primerNumero = entrada.nextInt();
                media+=primerNumero;
            } else if ( i == 8){
                ultimoNumero = entrada.nextInt();
                media+=ultimoNumero;
            } else {
                numero = entrada.nextInt();
                media+=numero;
            }
        }

        if (primerNumero == ultimoNumero) {
            media/=9;
            System.out.println("La media es: " + String.format("%.2f", media));
        } else {
            System.out.println("FIN");
        }
    }
}
