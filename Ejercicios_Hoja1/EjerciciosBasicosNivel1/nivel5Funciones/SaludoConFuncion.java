package EjerciciosBasicosNivel1.nivel5Funciones;

/**
 * Define una función que reciba un nombre y muestre un saludo
 */
public class SaludoConFuncion {
    public static void main(String[] args) {
        saludar("Alejandro");
    }

    static void saludar(String nombre){
        System.out.println("Hola, " + nombre);
    }
}
