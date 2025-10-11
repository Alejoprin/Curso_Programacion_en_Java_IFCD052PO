package EjerciciosBasicosNivel2.nivel1OperacionesYDatos;

/**
 * Escribe un programa que convierta grados Celsius a Fahrenheit
 */
public class ConversionTemperaturas {
    public static void main(String[] args) {
        int celsius = 24;
        float fahrenheit = (float) celsius * 9 / 5 + 32;

        System.out.println(celsius + "°C son " + fahrenheit + "°F");
    }
}
