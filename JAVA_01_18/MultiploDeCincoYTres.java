import java.util.concurrent.ThreadLocalRandom;

/**
 * Programa que lee una secuencia de 10 números y muestra el mayor de los múltiplos de 5, y
 * el menor de los múltiplos de 3. Si no hubiera ningún múltiplo, el programa lo indicaría.
 */
public class MultiploDeCincoYTres {
    public static void main(String[] args) {
        int num, numMayor=Integer.MIN_VALUE, numMenor=Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            num = ThreadLocalRandom.current().nextInt(1,100);

            if (num % 3 == 0 && num < numMenor){
                numMenor = num;
            }

            if (num % 5 == 0 && num > numMayor){
                numMayor = num;
            }
        }

        if (numMayor != Integer.MIN_VALUE ){
            System.out.println("El mayor de los múltiplos de 5 es: " + numMayor);
        }

        if (numMenor != Integer.MAX_VALUE ){
            System.out.println("El menor de los múltiplos de 3 es: " + numMenor);
        }

        if (numMayor == Integer.MIN_VALUE && numMenor == Integer.MAX_VALUE){
            System.out.println("NO hay ningún múltiplo");
        }
    }
}
