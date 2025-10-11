package EjerciciosBasicosNivel3.nivel5FuncionesAplicadas;

/**
 * Define una función que reciba un número y muestre si es un número
 * perfecto (la suma de sus divisores propios es igual al número)
 */
public class NumeroPerfecto {
    public static void main(String[] args) {
        if (esNumeroPerfecto(8128)){
            System.out.println("Es número perfecto");
        } else {
            System.out.println("NO es número perfecto");
        }
    }

    static boolean esNumeroPerfecto(int numero){
        int sumaDivisores = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0){
                sumaDivisores += i;
            }
        }
        return sumaDivisores == numero;
    }
}
