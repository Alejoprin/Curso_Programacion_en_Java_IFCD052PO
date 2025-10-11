package EjerciciosBasicosNivel3.nivel5FuncionesAplicadas;

/**
 * Crea una función que reciba un texto y devuelva cuántas mayúsculas y
 * minúsculas contiene
 */
public class CantidadMayusMinus {

    public static void main(String[] args) {

        int[] cantidadMayusMinus = calculoMayusMinus("La frase qUe se va a Evaluar, DE Prueba");

        System.out.println("El texto tiene " + cantidadMayusMinus[0] + " mayúsculas, y " + cantidadMayusMinus[1] + " minúsculas");
    }

    static int[] calculoMayusMinus(String texto){
        int mayus,minus;
        mayus=minus=0;

        for (char letra : texto.toCharArray()){
            if (Character.isLowerCase(letra)){
                minus++;
            } else if(Character.isUpperCase(letra)){
                mayus++;
            }
        }

        return new int[]{mayus, minus};
    }
}
