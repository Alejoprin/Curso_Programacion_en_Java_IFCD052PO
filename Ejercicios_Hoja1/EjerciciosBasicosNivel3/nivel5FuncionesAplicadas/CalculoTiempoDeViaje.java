package EjerciciosBasicosNivel3.nivel5FuncionesAplicadas;

/**
 * Haz una función que reciba la distancia en km y la velocidad en km/h, y
 * calcule el tiempo del viaje
 */
public class CalculoTiempoDeViaje {
    public static void main(String[] args) {
        tiempoDeViaje(25,120);
    }

    static void tiempoDeViaje(int distancia, int velocidad){
        float tiempoViaje = (float)distancia /velocidad;
        System.out.println("para recorrer " + distancia + " km a " + velocidad + " km\\h el tiempo de viaje será: " + String.format("%.2f",tiempoViaje) + " horas");
    }
}
