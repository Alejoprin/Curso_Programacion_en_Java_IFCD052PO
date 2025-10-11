package EjerciciosBasicosNivel1.nivel5Funciones;

/**
 * Haz una función que reciba la base y la altura de un rectángulo y calcule su
 * área
 */
public class AreaRectangulo {
    public static void main() {
        areaRectangulo(5,5);
    }

    static void areaRectangulo(int base, int altura){
        System.out.println("el área del rectangulo es: " + (base * altura));
    }
}
